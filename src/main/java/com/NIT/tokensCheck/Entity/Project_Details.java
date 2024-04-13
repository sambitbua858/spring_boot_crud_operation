package com.NIT.tokensCheck.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Project_Details {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int projectdetails_id;
    @OneToOne(cascade = CascadeType.ALL)
    public Active_Project active_project;
    @OneToOne(cascade = CascadeType.ALL)
    public Closed_Project closed_project;
    @OneToOne(cascade = CascadeType.ALL)
    public Personal_Project personal_project;


}
