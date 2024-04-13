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
public class Active_Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int activeproject_id;
    public String activeproject_inhouse;
    public String activeproject_client;
    public String activeproject_designation;
    public String activeproject_skillsused;
    public String activeproject_project_description;
    public String activeproject_project_duration;
    public String activeproject_assingment_status;
    public String activeproject_assinged_customer;
    public String activeproject_customer_feedback;


}
