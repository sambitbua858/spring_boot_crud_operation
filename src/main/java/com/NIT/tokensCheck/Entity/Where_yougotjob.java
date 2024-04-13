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
public class Where_yougotjob {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int whereugotjob_id;
    public String recived_email;
    public String from_google;
    public String facebook_ads;
    public String youtube_ads;
    public String quora;
}
