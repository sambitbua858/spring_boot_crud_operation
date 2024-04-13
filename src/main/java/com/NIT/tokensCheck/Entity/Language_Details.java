package com.NIT.tokensCheck.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Language_Details {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int laguage_id;
    public String spoken_language;
    public String spoken_language_proficiency;
    @ManyToOne
    @JoinColumn(name = "employee_id")
    public Employee employee;

}
