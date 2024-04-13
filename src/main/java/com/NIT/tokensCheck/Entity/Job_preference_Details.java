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
public class Job_preference_Details {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int job_preference_id;
    public String job_appided;
    public String applicationdate;
    public String cover_letter;
    public String application_status;



}
