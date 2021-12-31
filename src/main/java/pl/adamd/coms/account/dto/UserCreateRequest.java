package pl.adamd.coms.account.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import pl.adamd.coms.account.enums.FormOfEmployment;
import pl.adamd.coms.account.enums.Position;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserCreateRequest {

    private String name;

    private String surname;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfBirth;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfEmployment;

    private Position position;

    private FormOfEmployment formOfEmployment;

    private BigDecimal salary;
}
