package com.NIT.tokensCheck.Repository;

import com.NIT.tokensCheck.Entity.Salary_details;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface Salary_detailsrepo extends JpaRepository<Salary_details, Serializable> {
}
