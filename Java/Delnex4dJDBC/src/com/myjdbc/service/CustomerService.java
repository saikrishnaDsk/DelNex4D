package com.myjdbc.service;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.myjdbc.model.Customer;
import com.myjdbc.model.CustomerDao;

public class CustomerService {

	public static void main(String[] args)throws Exception {


		SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd");

		Date dob= sd.parse("1988-11-05");


		Customer cust=new Customer("VIRAT", "KOHLI",null,dob);
		CustomerDao dao=new CustomerDao();
		System.out.println(dao.saveCust(cust));

//		Customer cu = new Customer();
//		
////		cu.setCustid("ViKo001");
//		cu.setLname("Sharma");
//		System.out.println(dao.updateCustomer("ViKo003", cu));

	}

}