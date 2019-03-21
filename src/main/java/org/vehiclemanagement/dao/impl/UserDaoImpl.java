package org.vehiclemanagement.dao.impl;

import java.io.File;
import java.io.FileWriter;
//import java.io.File;
//import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
//import org.apache.tomcat.util.http.fileupload.FileUtils;

//import javax.sql.DataSource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.vehiclemanagement.dao.UserDao;
//import org.vehiclemanagement.model.Brake;
import org.vehiclemanagement.model.Parts;
import org.vehiclemanagement.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	SessionFactory sessionFactory;

	// Session session=sessionFactory.openSession();
	protected Session currentSession() {
		return sessionFactory.getCurrentSession();
	}

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void create(User user) {
		// openSession().beginTransaction();
		currentSession().saveOrUpdate(user);
		// System.out.println("user");
		// openSession().getTransaction();
		// openSession().close();

	}
	

	@Override
	public void update(User user) {
		currentSession().update(user);
	}

	@Override
	public void delete(User user) {
		currentSession().delete(user);

	}

	@Override
	public User edit(Long userId) {

		return find(userId);
	}

	@Override
	public User find(Long userId) {

		return (User) currentSession().get(User.class, userId);
	}

	@Override

	public List<User> getAll() {

		return jdbcTemplate.query("select * from userdetails", new RowMapper<User>() {

			public User mapRow(ResultSet result, int row) throws SQLException {
				User user = new User();
				user.setUserId(result.getInt(2));
				user.setUsername(result.getString(1));
				user.setPassword(result.getString(3));
				return user;
			}
		});
	}
	

	@Override
	public String loginUser(User user) {
		String sql = "SELECT username FROM userdetails WHERE username=? AND passwordConf=?";
		// System.out.println(sql);
		try {
			// System.out.println(user.getUsername());
			// System.out.println(user.getPassword());
			// System.out.println(user.getPasswordConf());

			String username = jdbcTemplate.queryForObject(sql,
					new Object[] { user.getUsername(), user.getPasswordConf() }, String.class);
			//File file = new File("c:/test.txt");
			File newTextFile = new File("C:/thetextfile.txt");

            FileWriter fw = new FileWriter(newTextFile);
            fw.write(username);
            fw.close();

			//file.write(file, username);
			// System.out.println("hello");
			return username;

		} catch (Exception e) {
			return null;
		}
	}
	@Override
	public void create(Parts parts) {
		// TODO Auto-generated method stub
		
	}



}
