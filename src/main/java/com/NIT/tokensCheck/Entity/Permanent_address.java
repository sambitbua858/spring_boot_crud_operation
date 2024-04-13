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
public class Permanent_address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int p_id;
    public String houseno;
    public String city;
    public String country;
    public String pincode;
}
