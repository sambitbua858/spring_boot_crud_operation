package com.NIT.tokensCheck.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Company_details {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int companydetails_id;
    public String comapnyname;
    public String comapnynumber;
    public String comapnyemail;
    @OneToOne(cascade = CascadeType.ALL)
    public Job_location_Company job_location_company;

}
