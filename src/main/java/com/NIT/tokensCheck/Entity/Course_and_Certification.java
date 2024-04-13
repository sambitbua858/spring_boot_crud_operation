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
public class Course_and_Certification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int course_id;
    public String certification_course;
    public String issue_date;
    public String certification_url;
}
