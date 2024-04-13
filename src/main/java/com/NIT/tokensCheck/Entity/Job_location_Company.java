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
public class Job_location_Company {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int joblocation_id;
    public String company_address;
    public String company_zip_code;
    public String work_module;
    public String company_designation;
    public String joiningdate;
    public String realesedate;



}
