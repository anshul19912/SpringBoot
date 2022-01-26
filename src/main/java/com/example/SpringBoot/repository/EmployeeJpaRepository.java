package com.example.SpringBoot.repository;
import com.example.SpringBoot.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeJpaRepository extends JpaRepository<Employee,Long> {



}
