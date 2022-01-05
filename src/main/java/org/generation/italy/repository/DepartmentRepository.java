package org.generation.italy.repository;

import java.math.BigInteger;

import org.generation.italy.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, BigInteger> {

}
