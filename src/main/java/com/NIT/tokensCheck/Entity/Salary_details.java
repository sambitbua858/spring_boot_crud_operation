package com.NIT.tokensCheck.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Salary_details {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int salary_id;
    public String currentctc;
    public String expectedctc;
    public String hourlyrate;
}
