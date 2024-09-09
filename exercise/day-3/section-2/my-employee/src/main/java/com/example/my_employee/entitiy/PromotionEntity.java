package com.example.my_employee.entitiy;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "promotions")
@Setter
@Getter
public class PromotionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "employee_id", nullable = false)
    @JsonProperty("employee_id")
    private Long employeeId;

    @Column(name = "promotion_date", nullable = false)
    @JsonProperty("promotion_date")
    private LocalDate promotionDate;

    @Column(name = "new_salary", nullable = false)
    @JsonProperty("new_salary")
    private BigDecimal newSalary;
}
