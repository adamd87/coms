package pl.adamd.coms.account.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.adamd.coms.account.dto.UserCreateRequest;
import pl.adamd.coms.account.dto.UserViewResponse;
import pl.adamd.coms.account.service.UserViewService;

@RestController
@RequestMapping("/api/users")
@AllArgsConstructor
class UserController {
    private final UserViewService userViewService;

    @PostMapping
    ResponseEntity<UserViewResponse> addNewEmployee(@RequestBody UserCreateRequest newEmployee){
        return ResponseEntity.ok(userViewService.createNewEmployee(newEmployee));
    }
}
