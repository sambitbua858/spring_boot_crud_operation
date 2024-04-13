package com.NIT.tokensCheck.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Work_Experience_Details {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int workexp_id;
    @OneToOne(cascade = CascadeType.ALL)
    public Company_details company_details;
    @OneToOne(cascade = CascadeType.ALL)
    public Project_Details project_details;

    public String totalexprerience;
    public String years_of_remoteexprience;
    public String professional_industrial_experience;
    public String freelance_experience;


}
