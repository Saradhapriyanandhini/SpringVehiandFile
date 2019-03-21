package org.vehiclemanagement.controller;

import java.io.*;
import java.sql.*;
import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class Example {
	
	@RequestMapping(value = "/file1", method = RequestMethod.GET)
	public ModelAndView createFile() throws IOException {
		ModelAndView mv = new ModelAndView("/user/file");
		
		List<String> data = new ArrayList<String>();

		try {
			Connection con = null;
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/vehiclemanagement", "root", "root");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("Select * from orderdetails1");

			while (rs.next()) {
				String order_No = rs.getString("order_No");
				String order_Name = rs.getString("order_Name");
				String user_Name= rs.getString("user_Name");
				String Mobile_No = rs.getString("Mobile_No");
				String Place=rs.getString("Place");
				data.add(order_No + " " + order_Name + " " + user_Name + " " + Mobile_No+" "+Place);

			}
			writeToFile(data, "c:/SpringFile/orderdetails.txt");
			rs.close();
			st.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return mv;
	}

	private static void writeToFile( List<String> list, String path) {
		BufferedWriter out = null;
		try {
			File file = new File(path);
			out = new BufferedWriter(new FileWriter(file, true));
			for (String s : list) {
				out.write(s);
				out.newLine();

			}
			out.close();
		} catch (IOException e) {
		}
	}
}