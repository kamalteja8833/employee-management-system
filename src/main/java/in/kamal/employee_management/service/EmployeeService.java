package in.kamal.employee_management.service;

import in.kamal.employee_management.entity.Employee;
import in.kamal.employee_management.exceptions.ResourceNotFoundException;
import in.kamal.employee_management.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    public Employee getEmployeeId(Long id){
        return employeeRepository.findById(Integer.valueOf(String.valueOf(id)))
                .orElseThrow(()->new ResourceNotFoundException("Employee not found"));
    }

    public Employee updateEmployee(Integer id, Employee employee) {

        Employee existingEmployee = employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found"));

        existingEmployee.setName(employee.getName());
        existingEmployee.setEmail(employee.getEmail());
        existingEmployee.setDept(employee.getDept());
        existingEmployee.setSalary(employee.getSalary());
        existingEmployee.setPhone(employee.getPhone());

        return employeeRepository.save(existingEmployee);
    }

    public void deleteEmployee(Long id){
        employeeRepository.deleteById(Integer.valueOf(String.valueOf(id)));
    }


}
