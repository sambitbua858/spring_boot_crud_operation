package com.NIT.tokensCheck.Service;

import com.NIT.tokensCheck.Entity.Employee;
import com.NIT.tokensCheck.Repository.Employee_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    public Employee_repo employee_repo;

    public String store(Employee employee)
    {
        employee_repo.save(employee);
        return "value added";
    }
    public List<Employee> fetch()
    {
        return employee_repo.findAll();
    }
    public Optional<Employee> getbyID(int id) throws Exception
    {
        Optional<Employee> employee = employee_repo.findById(id);
        return employee;
    }
    public void deleteEmplyee(int id)
    {
        employee_repo.deleteById(id);
    }
}
