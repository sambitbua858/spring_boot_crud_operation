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
public class Closed_Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int closedproject_id;
    public String closedproject_inhouse;
    public String closedproject_client;
    public String closedproject_designation;
    public String closedproject_skillsused;
    public String closedproject_project_description;
    public String closedproject_project_duration;
    public String closedproject_assingment_status;
    public String closedproject_assinged_customer;
    public String closedproject_customer_feedback;
}
