package com.NIT.tokensCheck.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Skills_details {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int skillsdetails_id;
    @OneToOne(cascade = CascadeType.ALL)
    public Technical_skills technical_skills;
    @OneToOne(cascade = CascadeType.ALL)
    public Soft_skills soft_skills;
    @ManyToOne
    public Employee employee;



}
