package com.myjdbc.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.myjdbc.dbutil.DbConnection;

public class CustomerDao {
	String genCustId(String fname,String lname)
	{
		try
		{
			Connection con= DbConnection.getConnection();
			String sql="select seq.nextval from dual";
			PreparedStatement stat= con.prepareStatement(sql);

			ResultSet rs= stat.executeQuery();
			rs.next();
			int seqNum=rs.getInt(1);
			String custId="";
			if(seqNum < 10)
			{
				custId="00"+seqNum;
			}
			else if(seqNum < 100)
			{
				custId="0"+seqNum;
			}

			custId=fname.substring(0,2)+lname.substring(0,2)+custId;

			return custId;
		}
		catch (Exception e) {
			e.printStackTrace();
			return "";
		}


	}




	public  String saveCust(Customer customer)
	{
		try
		{
			Connection con= DbConnection.getConnection();
			String sql="insert into customer values(?,?,?,?)";
			PreparedStatement stat= con.prepareStatement(sql);

			stat.setString(1,customer.getFname());
			stat.setString(2,customer.getLname());
			stat.setDate(4,new java.sql.Date(customer.getDob().getTime()));

			String custId= genCustId(customer.getFname(), customer.getLname());
			if(custId.length()>0)
			{
				stat.setString(3,custId);
				stat.executeUpdate();
				return "recs Inserted";
			}


			return "";
		}
		catch (Exception e) {
			e.printStackTrace();
			return "";
		}


	}

	public Customer getCustomerById(String custid) {

		try {
			Connection con = DbConnection.getConnection();
			String sql = "select * from customer where custid=?;";
			PreparedStatement stat= con.prepareStatement(sql);

			stat.setString(1, custid);

			ResultSet rs= stat.executeQuery();

			if(rs.next()) {
				Customer cust = new Customer();
				cust.setFname(rs.getString("fname"));
				cust.setLname(rs.getString("lname"));
				cust.setDob(rs.getDate("dob"));

				return cust;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public String updateCustomer(String custid,Customer customer) {
		try {
			Customer oldData = getCustomerById(custid);
			Connection con = DbConnection.getConnection();
			String sql = "update customer set fname=?,lname=?,dob=? where custid=?;";
			PreparedStatement stat= con.prepareStatement(sql);

			stat.setString(4, custid);

			if(customer.getFname()==null) {
				customer.setFname(oldData.getFname());
			}
			if(customer.getLname()==null) {
				customer.setLname(oldData.getLname());
			}
			if(customer.getDob()==null) {
				customer.setDob(oldData.getDob());
			}

		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}