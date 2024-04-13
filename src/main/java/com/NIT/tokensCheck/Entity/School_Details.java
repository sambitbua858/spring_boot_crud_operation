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
public class School_Details {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int school_id;
    public String schoolname;
    public String educationboard;
    public String addressofschool;
    public String subjectstudied;
    public String percentage;
}
