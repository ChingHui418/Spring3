package tw.hui.spring3.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import tw.hui.spring3.entity.Employee;
import tw.hui.spring3.projection.EmployeeProjection;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	List<EmployeeProjection> searchByTitleStartingWith(String start);
}
