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
public class Soft_skills {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int softskills_id;
    public String softskills_skills;
    public String softskills_profeciency;

}
