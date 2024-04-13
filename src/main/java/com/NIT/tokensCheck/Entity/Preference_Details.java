package com.NIT.tokensCheck.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Preference_Details {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int preference_id;
    public String preferredcountry;
    public String preferredcity1;
    public String preferredcity2;
    public String workmodule;
    public String shifttiming;
    public String employmenttype;
    public String desiredpayrate;
    public String contractperiod;
    public String noticeperiod;
    public String desiredstartdate;
    public String hoursperweek;
    public String payperhour;
    public String minimumpay;
    public String billingrate;
    public String jobshift;
    @OneToOne(cascade = CascadeType.ALL)
    public Job_preference_Details job_preference_details;
    public String job_post;
}
