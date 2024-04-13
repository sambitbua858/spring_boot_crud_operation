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
public class Training_details {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int training_id;
    public  String training_activities;
    public  String training_duration;
    public  String training_skills;
    public  String training_mentorship;


}
