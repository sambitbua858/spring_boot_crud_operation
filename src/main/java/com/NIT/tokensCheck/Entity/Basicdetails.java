package com.NIT.tokensCheck.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Basicdetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int basic_id;
    public String fisrtname;
    public String middlename;
    public String lastname;
    public String profileimageurl;
    public String mobile_no;
    public String alternate_mobile_no;
    public String whatsapp_no;
    @OneToOne(cascade = CascadeType.ALL)
    public Address address;
    public String cityzenship;
    public String contry_of_resident;
    public String contry_of_cityzenship;
    public String DOB;
    public String place_of_birth;
    public String gender;
    @OneToOne(cascade = CascadeType.ALL)
    public Passport_details passport_details;
    @OneToOne(cascade = CascadeType.ALL)
    public Goverment_id_proof goverment_id_proof;










}
