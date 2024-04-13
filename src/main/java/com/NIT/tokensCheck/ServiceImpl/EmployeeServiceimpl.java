package com.NIT.tokensCheck.ServiceImpl;

import com.NIT.tokensCheck.Entity.Employee;
import com.NIT.tokensCheck.Repository.Employee_repo;
import com.NIT.tokensCheck.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceimpl implements EmployeeService {
    @Autowired
    public Employee_repo employee_repo;

    public String store(Employee employee)
    {
        employee_repo.save(employee);
        return "value added";
    }
    @Override
    public List<Employee> fetch()
    {
        return employee_repo.findAll();
    }
    @Override
    public Optional<Employee> getbyID(int id)
    {
        Optional<Employee> employee = employee_repo.findById(id);
        return employee;
    }
    @Override
    public void deleteEmplyee(int id)
    {
        employee_repo.deleteById(id);
    }
}
