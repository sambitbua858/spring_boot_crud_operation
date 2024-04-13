package com.NIT.tokensCheck.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int address_id;
    @OneToOne(cascade = CascadeType.ALL)
    public Residential_address residential_address;
    @OneToOne(cascade = CascadeType.ALL)
    public Permanent_address permanent_address ;


}
