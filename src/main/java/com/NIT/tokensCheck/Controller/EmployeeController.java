package com.NIT.tokensCheck.Controller;

import com.NIT.tokensCheck.Entity.Employee;
import com.NIT.tokensCheck.Exception.EmployeeIdnotFound;
import com.NIT.tokensCheck.Service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {
    @Autowired
    public EmployeeService employeeService;

    @GetMapping("/")
    public List<Employee> getAll()
    {
        return employeeService.fetch();
    }
    @PostMapping("/")
    public String postAll(@RequestBody Employee employee)
    {
        return employeeService.store(employee);
    }
    @GetMapping("/{id}")
    public Optional<Employee> byId(@PathVariable int id) throws Exception
    {
        return Optional.ofNullable(employeeService.getbyID(id).orElseThrow(() -> new EmployeeIdnotFound(id)));
    }
    @DeleteMapping("/{id}")
    public void deleteAll(@PathVariable int id )
    {
        employeeService.deleteEmplyee(id);
    }

}
