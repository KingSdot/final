package movie.theater.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import movie.theater.entity.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Long> {

}
