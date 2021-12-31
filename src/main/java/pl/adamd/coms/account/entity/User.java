package pl.adamd.coms.account.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.adamd.coms.account.enums.FormOfEmployment;
import pl.adamd.coms.account.enums.Position;
import pl.adamd.coms.account.enums.Role;

import javax.persistence.*;
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
    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private LocalDate dateOfEmployment;
    private Position position;
    private Role role;
    private FormOfEmployment formOfEmployment;
    private BigDecimal salary;
}
