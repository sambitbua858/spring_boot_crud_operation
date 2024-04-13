package com.NIT.tokensCheck.Service;

import com.NIT.tokensCheck.Entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<Employee> fetch();

    String store(Employee employee);
    Optional<Employee> getbyID(int id);
    void deleteEmplyee(int id);
}
