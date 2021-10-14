package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class StudentDao
{
  public static boolean insertStudentToDB(Student st)
  {
	  
	  boolean f=false;
	  try
	  {
		//jdbc code...
		  Connection con =ConnectionPr.createC() ;
		  String q="insert into students(sname ,sphone, scity) values(?,?,?)";
		  //preparedstmt
		  PreparedStatement pstmt = con.prepareStatement(q);
		  //set the value of parameter
		  pstmt.setString(1,st.getStudentName());
		  pstmt.setString(2,st.getStudentPhone());
		  pstmt.setString(3,st.getStudentCity());
		  
		  //execute...
		  pstmt.executeUpdate();
		  f=true;
      }
	  catch (Exception e)
	  {
		  e.printStackTrace();
	  }
	  return f;
  }

public static boolean deleteStudent(int userId) {
	  boolean f=false;
	  try
	  {
		//jdbc code...
		  Connection con =ConnectionPr.createC() ;
		  String q="delete from students where sid=?";
		  //preparedstmt
		  PreparedStatement pstmt = con.prepareStatement(q);
		  //set the value of parameter
		  pstmt.setInt(1,userId);
		
		  
		  //execute...
		  pstmt.executeUpdate();
		  f=true;
      }
	  catch (Exception e)
	  {
		  e.printStackTrace();
	  }
	  return f;
}

public static void showAllStudents() {
	  
	  boolean f=false;
	  try
	  {
		//jdbc code...
		  Connection con =ConnectionPr.createC() ;
		  String q="select * from students;";
		Statement stmt=con.createStatement();
		ResultSet set=stmt.executeQuery(q);
		  
		
		while(set.next())
		{
			int id=set.getInt(1);
		    String name=set.getString(2);
		    String phone=set.getString(3);
		    String city=set.getString("scity");
		    
		    System.out.println("ID : "+id);
		    System.out.println("name : "+name);
		    System.out.println("phone : "+phone);
		    System.out.println("city : "+city);
		    System.out.println("+++++++++++++++++++++++++++");   
		}
    }
	  
	  catch (Exception e)
	  {
		  e.printStackTrace();
	  }
	  
  }

//@Override
//public void update(Employee emp)throws SQLException
//{
//	 prStmt = dbCon.prepareStatement(EmpQueries.updateQuery);
//      
//      prStmt.setString(1,emp.getEmpFirstName());
//      prStmt.setString(2,emp.getEmpLastName());
//      prStmt.setInt(3,emp.getEmpBasic());
//      prStmt.setString(4,emp.getEmpGrade());
//      prStmt.setInt(5,emp.getEmpDeptID());
//      prStmt.setString(6,emp.getEmpDesignation());
//      prStmt.setString(7,emp.getEmpGender());
//      prStmt.setString(8,emp.getEmpMaritalStatus());
//      prStmt.setString(9,emp.getEmpHomeAddress());
//      prStmt.setString(10,emp.getEmpContactNum());
//      prStmt.setInt(11,emp.getEmpID());
//      
//      System.out.println(prStmt);
//      
//      int count = prStmt.executeUpdate();
//      
//      System.out.println(count+" record updated");
//      
//      
//}
public static boolean updateStudentToDB(Student st)
{
	  
	  boolean f=false;
	  try
	  {
		//jdbc code...
		  Connection con =ConnectionPr.createC() ;
		  String q="update students set Qty=1 where sid=1";
		  //preparedstmt
		  PreparedStatement pstmt = con.prepareStatement(q);
		  //set the value of parameter
		  pstmt.setString(1,st.getStudentName());
		  pstmt.setString(2,st.getStudentPhone());
		  pstmt.setString(3,st.getStudentCity());
		  
		  //execute...
		  pstmt.executeUpdate();
		  f=true;
    }
	  catch (Exception e)
	  {
		  e.printStackTrace();
	  }
	  return f;
}

public static void updateAllStudents() {
	
	 boolean f=false;
	  try
	  {
		//jdbc code...
		  Connection con =ConnectionPr.createC() ;
		  String q="update students set Qty=1 where sid=1";
		Statement stmt=con.createStatement();
		ResultSet set=stmt.executeQuery(q);
		  
		
		while(set.next())
		{
			int id=set.getInt(1);
		    String name=set.getString(2);
		    String phone=set.getString(3);
		    String city=set.getString("scity");
		    
		    System.out.println("ID : "+id);
		    System.out.println("name : "+name);
		    System.out.println("phone : "+phone);
		    System.out.println("city : "+city);
		    System.out.println("+++++++++++++++++++++++++++");   
		}
   }
	  
	  catch (Exception e)
	  {
		  e.printStackTrace();
	  }
}
}

