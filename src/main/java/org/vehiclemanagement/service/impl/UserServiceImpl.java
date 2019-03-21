package org.vehiclemanagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
//import org.springframework.transaction.annotation.Propagation;
import org.vehiclemanagement.dao.UserDao;
//import org.vehiclemanagement.model.Brake;
import org.vehiclemanagement.model.Parts;
import org.vehiclemanagement.model.User;
import org.vehiclemanagement.service.UserService;

@Service

public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	@Transactional
	@Override
	public void create(User user) {
		userDao.create(user);

	}
	@Transactional
	@Override
	public void update(User user) {
		userDao.update(user);

	}
	@Transactional
	@Override
	public void delete(User user) {
		userDao.delete(user);

	}
	@Transactional
	@Override
	public User edit(Long userId) {
		
		return userDao.edit(userId);
	}
	@Transactional
	@Override
	public User find(Long userId) {
		
		return userDao.find(userId);
	} 
	@Transactional
	@Override
	public List<User> getAll() {
		
		return userDao.getAll();
	}
	@Override
	public String loginUser(User user) {

		return userDao.loginUser(user);
	}
	
	
	
	@Override
	public void create(Parts parts) {
		// TODO Auto-generated method stub
		
	}
	

}
