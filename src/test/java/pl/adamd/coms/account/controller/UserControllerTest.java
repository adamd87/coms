package pl.adamd.coms.account.controller;

import db.init.SqlTruncateTables;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import pl.adamd.coms.account.enums.Role;
import pl.adamd.coms.account.repository.UserRepository;
import pl.adamd.coms.helpers.NewUserGenerator;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@SqlTruncateTables
@ActiveProfiles("test")
class UserControllerTest {
    @LocalServerPort
    private int port;

    @Autowired
    UserRepository repository;

    @Test
    @DisplayName("Should return status 200 if user has been created")
    void addNewEmployee_createNewEmployee_ShouldReturnStatus200(){
        final String newEmployee = NewUserGenerator.newEmployeeWithCorrectDataAndPositionManager();
        given().body(newEmployee)
                .when()
                .contentType(String.valueOf(MediaType.APPLICATION_JSON))
                .post("http://localhost:" + port + "/api/users")
                .then()
                .assertThat()
                .statusCode(200);
        assertThat(repository.findAll()).hasSize(1);
    }

    @Test
    @DisplayName("Should set admin role if new employee has position Manager")
    void addNewManager_createNewEmployee_SetRoleAdmin(){
        final String newManager = NewUserGenerator.newEmployeeWithCorrectDataAndPositionManager();
        given().body(newManager)
                .when()
                .contentType(String.valueOf(MediaType.APPLICATION_JSON))
                .post("http://localhost:" + port + "/api/users")
                .then()
                .assertThat()
                .statusCode(200);

        assertThat(repository.findById(1L).get().getRole()).isEqualTo(Role.ADMIN);
    }

    @Test
    @DisplayName("Should set user role if new employee has position other than Manager")
    void addNewWorker_createNewEmployee_SetRoleUser(){
        final String newWorker = NewUserGenerator.newEmployeeWithCorrectDataAndPositionWorker();
        given().body(newWorker)
                .when()
                .contentType(String.valueOf(MediaType.APPLICATION_JSON))
                .post("http://localhost:" + port + "/api/users")
                .then()
                .assertThat()
                .statusCode(200);

        assertThat(repository.findById(1L).get().getRole()).isEqualTo(Role.USER);
    }

    @Test
    @DisplayName("Should set active boolean true for new employee")
    void addNewWorker_createNewEmployee_SetActiveTrue(){
        final String newWorker = NewUserGenerator.newEmployeeWithCorrectDataAndPositionWorker();
        given().body(newWorker)
                .when()
                .contentType(String.valueOf(MediaType.APPLICATION_JSON))
                .post("http://localhost:" + port + "/api/users")
                .then()
                .assertThat()
                .statusCode(200);

        assertTrue(repository.findById(1L).get().getActive());
    }

}