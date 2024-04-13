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
public class Graduation_Details {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int graduation_id;
    public String graduationcollegename;
    public String graduationboardname;
    public String graduationcollegeadress;
    public String graduationpercentage;
    public long institutionid;
    public String graduationuniversityname;
    public String graduationdegreename;
    public String graduationsteam;
    public String startdate;
    public String enddate;
}
