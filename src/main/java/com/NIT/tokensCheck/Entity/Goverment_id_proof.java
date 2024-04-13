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
public class Goverment_id_proof {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int gov_id;
    public String idproof;
    public String gov_image_url;
    public String identity_no;


}
