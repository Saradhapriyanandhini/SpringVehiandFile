package org.vehiclemanagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
import org.vehiclemanagement.dao.FileDao;

import org.vehiclemanagement.model.Order;

import org.vehiclemanagement.service.FileService;
@Service
public class FileServiceImpl  implements FileService{
	@Autowired
	private FileDao fileDao;
	
	@Override
	public List<Order> getAll() {
		
		return fileDao.getAll();
	}

}
