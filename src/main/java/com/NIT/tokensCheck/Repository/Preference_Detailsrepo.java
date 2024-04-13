package com.NIT.tokensCheck.Repository;

import com.NIT.tokensCheck.Entity.Preference_Details;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface Preference_Detailsrepo extends JpaRepository<Preference_Details, Serializable> {
}
