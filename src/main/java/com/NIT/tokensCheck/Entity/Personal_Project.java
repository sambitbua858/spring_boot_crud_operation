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
public class Personal_Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int personalprojet_id;
    public String personalprojet_name;
    public String personalprojet_companyname;
    public String personalprojet_projecturl;
    public String personalprojet_projectdescription;
    public String personalprojet_skillsused;
    public String personalprojet_project_duration;


}
