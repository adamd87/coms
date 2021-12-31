package pl.adamd.coms.account.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import pl.adamd.coms.account.enums.FormOfEmployment;
import pl.adamd.coms.account.enums.Position;
import pl.adamd.coms.account.enums.Role;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserCreateRequest {

    private Long id;
    @NotBlank
    private String name;
    @NotBlank
    private String surname;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfBirth;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfEmployment;
    @NotNull
    private Position position;
    private Role role;
    @NotNull
    private FormOfEmployment formOfEmployment;
    @NotNull
    private BigDecimal salary;
}
