package edu.mum.employee.repository;

import edu.mum.employee.domain.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
