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
public class Technical_skills {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int technicalskills_id;
    public String technicalskills_skills;
    public String technicalskills_course;
    public String technicalskills_institutename;
    public String technicalskills_exprerience;
    public String technicalskills_usedtools;
    public String technicalskills_profeciency;
    public String technicalskills_devtools;
    public String technicalskills_startdate;
    public String technicalskills_enddate;




}
