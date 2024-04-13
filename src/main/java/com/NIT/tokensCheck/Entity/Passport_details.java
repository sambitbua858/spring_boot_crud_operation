package com.NIT.tokensCheck.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Passport_details {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int passport_id;
    public String passport_no;
    public String visa_type;
    public String visa_no;
    public String visa_renual_date;
    public String application_allowed_overseas;

}
