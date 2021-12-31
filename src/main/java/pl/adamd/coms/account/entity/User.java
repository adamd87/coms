package pl.adamd.coms.account.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.adamd.coms.account.enums.FormOfEmployment;
import pl.adamd.coms.account.enums.Position;
import pl.adamd.coms.account.enums.Role;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @NotBlank(message = "Employee name cannot be blank.")
    private String name;

    @NotBlank(message = "Employee surname cannot be blank.")
    private String surname;

    @NotNull(message = "Employee's date of birth must be entered.")
    private LocalDate dateOfBirth;

    @NotNull(message = "Enter the date on which the employee starts work.")
    private LocalDate dateOfEmployment;

    private Boolean active;

    @NotNull(message = "The job position must be specified.")
    private Position position;

    private Role role;

    @NotNull(message = "The form of employment must be specified.")
    private FormOfEmployment formOfEmployment;

    @NotNull(message = "The employee's monthly earnings must be entered.")
    private BigDecimal salary;
}
