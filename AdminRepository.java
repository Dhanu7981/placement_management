package com.si.project1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.si.project1.entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
	
	

}
