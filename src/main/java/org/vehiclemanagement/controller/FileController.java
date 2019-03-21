package org.vehiclemanagement.controller;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.vehiclemanagement.model.Order;
import org.vehiclemanagement.service.FileService;
//import org.vehiclemanagement.model.Order;

@Controller

public class FileController {
	@Autowired
	private FileService fileService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView createFile() throws IOException {
		ModelAndView mv = new ModelAndView("/user/file");
		//List<String> data = new ArrayList<String>();
		File file = new File("c:/SpringFile/orderdetails.txt");
		//String formatStr = "%-20s %-20s %-20s %-20s %-20s";
		if (file.createNewFile()) {
			mv.addObject("msg", "File created!");
			List<Order> list=fileService.getAll();  
			BufferedWriter out = null;
			out = new BufferedWriter(new FileWriter(file, true));
			
			for (Order s:list) {
				out.write(s.getOrder_No());
				out.write(s.getOrder_Name());
				out.write(s.getUser_Name());
				out.write(s.getMobile_No());
				out.write(s.getPlace());
				out.newLine();

			}
			out.close();

			

	} else {
		mv.addObject("msg", "File already exists.");
	}
	return mv;
}

}
			/*try {
				Connection con = null;
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehiclemanagement", "root", "root");
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(
						"Select cast(order_No as char(20))order_no,cast(order_Name as char(20))order_name, cast(user_Name as char(20))user_name,cast(mobile_No as char(20))mobile_no,cast(Place as char(20))place from orderdetails1");

				/*while (rs.next()) {
					String order_No = rs.getString("order_no");

					String order_Name = rs.getString("order_name");

					String user_Name = rs.getString("user_name");

					String Mobile_No = rs.getString("mobile_no");

					String Place = rs.getString("place");

					//String format = String.format(formatStr, order_No, order_Name, user_Name, Mobile_No, Place);

					//data.add(format);*/
					/*List<Order> list=new ArrayList<Order>();  
			        while(rs.next()){  
			        Order order=new Order();  
			        order.setOrder_No(rs.getString("order_no"));

			        order.setOrder_Name( rs.getString("order_name"));

			        order.setUser_Name(rs.getString("user_name"));

			        order.setMobile_No(rs.getString("mobile_no"));

			        order.setPlace(rs.getString("place"));
			        
			        list.add(order);  

				}*/
			

// Order order = new Order(123456, "SparePart", "sharu", 1231234234, "cbe");
// Order order = new Order();
// FileWriter writer = new FileWriter(file);
// order.setOrder_No(1234);
// order.setOrder_Name("brake");
// order.setMobile_No(1344);
// order.setPlace("cbe");
// order.setUser_Name("nandhu");
// String str = order.toString();
// writer.write(str);

// String orderno = String.valueOf(order.getOrder_No());
// String mob = String.valueOf(order.getMobile_No());

// writer.write(orderno + " ");
// writer.write(order.getOrder_Name() + " ");
// writer.write(order.getUser_Name() + " ");
// writer.write(order.getPlace() + " ");
// writer.write(mob);
// writer.close();

// return mv;
