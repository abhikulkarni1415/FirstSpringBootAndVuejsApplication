package net.JavaVuejs.springboot_backened.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.JavaVuejs.springboot_backened.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
