package org.vehiclemanagement.dao;

import java.util.List;

//import org.vehiclemanagement.model.Brake;
import org.vehiclemanagement.model.Parts;
import org.vehiclemanagement.model.User;

public interface UserDao {
	
	public void create(User user);
	public void create(Parts parts);
	String loginUser(User user);
	public void update(User user);
	public void delete(User user);
	public User edit(Long userId);
	public User find(Long userId);
	public List<User> getAll();
	
	

}
