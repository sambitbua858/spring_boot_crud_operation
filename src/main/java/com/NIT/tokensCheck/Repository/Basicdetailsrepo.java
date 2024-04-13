package com.NIT.tokensCheck.Repository;

import com.NIT.tokensCheck.Entity.Basicdetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface Basicdetailsrepo extends JpaRepository<Basicdetails, Serializable> {
}
