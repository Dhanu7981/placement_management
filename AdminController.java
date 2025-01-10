package com.si.project1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.si.project1.entity.Admin;
import com.si.project1.service.AdminService;

@RestController
public class AdminController {
	@Autowired
	AdminService s1;
	@PostMapping("/admins")
	public Admin saveAdmin(@RequestBody Admin admin) {
		
		return s1.saveAdmin(admin);
	}
	
	@GetMapping("/admins")
    public List<Admin> fetchAdminList() {
        //LOGGER.info("Inside fetchDepartmentList of DepartmentController");
        return s1.fetchAdminList();
    }
	
	@GetMapping("/admins/{id}")
    public Admin fetchAdminById(@PathVariable("id") Long adminId)
            {
        return s1.fetchAdminById(adminId);
    }
	@DeleteMapping("/admins/{id}")
    public String deleteAdminById(@PathVariable("id") Long adminId) {
        s1.deleteAdminById(adminId);
        return "Department deleted Successfully!!";
    }

}
