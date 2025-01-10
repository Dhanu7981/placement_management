package com.si.project1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.si.project1.entity.Admin;
import com.si.project1.repository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	AdminRepository r;
	@Override
	public Admin saveAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return r.save(admin);
	}

	@Override
	public List<Admin> fetchAdminList() {
		// TODO Auto-generated method stub
		return r.findAll();
	}

	@Override
	public Admin fetchAdminById(Long adminId) {
		// TODO Auto-generated method stub
		return r.findById(adminId).get();
	}

	@Override
	public void deleteAdminById(Long adminId) {
		// TODO Auto-generated method stub
		r.deleteById(adminId);
	}
}
