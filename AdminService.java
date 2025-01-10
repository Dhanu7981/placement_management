package com.si.project1.service;

import java.util.List;

import com.si.project1.entity.Admin;

public interface AdminService {

	Admin saveAdmin(Admin admin);

	List<Admin> fetchAdminList();

	Admin fetchAdminById(Long adminId);

	void deleteAdminById(Long adminId);

	

}
