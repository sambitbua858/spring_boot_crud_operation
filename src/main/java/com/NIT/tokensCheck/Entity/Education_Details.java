package com.NIT.tokensCheck.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Education_Details {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int education_id;
    public String levelofeducation;
    public String stream;
    @OneToOne(cascade = CascadeType.ALL)
    public School_Details school_details;
    @OneToOne(cascade = CascadeType.ALL)
    public Diploma_Details diploma_details;
    @OneToOne(cascade = CascadeType.ALL)
    public Graduation_Details graduation_details;
    @OneToOne(cascade = CascadeType.ALL)
    public Course_and_Certification course_and_certification;
    @OneToOne(cascade = CascadeType.ALL)
    public Training_details training_details;


}
