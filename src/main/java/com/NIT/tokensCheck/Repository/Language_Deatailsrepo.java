package com.NIT.tokensCheck.Repository;

import com.NIT.tokensCheck.Entity.Language_Details;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface Language_Deatailsrepo extends JpaRepository<Language_Details, Serializable> {
}
