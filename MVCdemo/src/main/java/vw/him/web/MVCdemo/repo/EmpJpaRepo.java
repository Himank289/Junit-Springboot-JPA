package vw.him.web.MVCdemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vw.him.web.MVCdemo.model.Employee;

@Repository
public interface EmpJpaRepo extends JpaRepository<Employee, Integer>{
	
	public Employee findByEmpid(int id);

}
