package com.NIT.tokensCheck.Repository;

import com.NIT.tokensCheck.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface Employee_repo extends JpaRepository<Employee, Serializable> {
}
