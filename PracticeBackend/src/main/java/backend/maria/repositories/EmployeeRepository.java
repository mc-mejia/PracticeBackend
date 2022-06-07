package backend.maria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import backend.maria.models.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
