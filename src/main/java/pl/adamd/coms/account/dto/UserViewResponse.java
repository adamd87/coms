package pl.adamd.coms.account.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.adamd.coms.account.enums.FormOfEmployment;
import pl.adamd.coms.account.enums.Position;
import pl.adamd.coms.account.enums.Role;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public
class UserViewResponse {

    private Long id;
    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private LocalDate dateOfEmployment;
    private Boolean active;
    private Position position;
    private Role role;
    private FormOfEmployment formOfEmployment;
    private BigDecimal salary;
}
