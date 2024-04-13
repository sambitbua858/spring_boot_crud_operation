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
public class Diploma_Details {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int diploma_id;
    public String collegename;
    public String collegeboard;
    public String addressofcollege;
    public String subjectstudiedincollege;
    public String percentageofdiploma;
}
