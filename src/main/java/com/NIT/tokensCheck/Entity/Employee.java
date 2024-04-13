package com.NIT.tokensCheck.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int emp_id;
    @OneToOne(cascade = CascadeType.ALL)
    public Basicdetails basicdetails;

    @OneToOne(cascade = CascadeType.ALL)
    public Education_Details education_details;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    public List<Language_Details> language_details=new ArrayList<>();

    @OneToOne(cascade = CascadeType.ALL)
    public Preference_Details preference_details;

    @OneToOne(cascade = CascadeType.ALL)
    public Salary_details salary_details;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    public List<Skills_details> skills_details=new ArrayList<>();

    @OneToOne(cascade = CascadeType.ALL)
    public Social_Profiles_links_details social_profiles_links_details;

    @OneToOne(cascade = CascadeType.ALL)
    public Where_yougotjob where_yougotjob;

    @OneToOne(cascade = CascadeType.ALL)
    public Work_Experience_Details work_experience_details;




}
