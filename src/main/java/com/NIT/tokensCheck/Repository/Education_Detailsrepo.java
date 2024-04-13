package com.NIT.tokensCheck.Repository;

import com.NIT.tokensCheck.Entity.Education_Details;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface Education_Detailsrepo extends JpaRepository<Education_Details, Serializable> {
}
