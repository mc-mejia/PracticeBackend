package backend.maria.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import backend.maria.models.Employee;
import backend.maria.repositories.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository empRepository;
	
	@PostMapping("/employees/create")
	public Employee addEmployee(Employee employee) {
		return empRepository.save(employee);
	}

	@DeleteMapping("/employees/delete")
	public void deleteEmployee(long empId) {
		empRepository.deleteById(empId);
	}
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return empRepository.findAll();
	}
}
