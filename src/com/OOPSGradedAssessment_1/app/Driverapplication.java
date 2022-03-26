package com.OOPSGradedAssessment_1.app;
import com.OOPSGradedAssessment_1.model.*; 

public class Driverapplication {
	public static void main(String args[])
	{
		AdminDepartment adminDeptObj=new AdminDepartment();
		HrDepartment hrDeptObj=new HrDepartment();
		TechDepartment techDeptObj=new TechDepartment();
		System.out.println("Welcome to " + adminDeptObj.departmentName());
		System.out.println(adminDeptObj.getTodaysWork());
		System.out.println(adminDeptObj.getWorkDeadline());
		System.out.println(adminDeptObj.isTodayAHoliday());
		System.out.println();
		System.out.println("Welcome to " + hrDeptObj.departmentName());
		System.out.println(hrDeptObj.doActivity());
		System.out.println(hrDeptObj.getTodaysWork());
		System.out.println(hrDeptObj.getWorkDeadline());
		System.out.println(hrDeptObj.isTodayAHoliday());
		System.out.println();
		System.out.println("Welcome to " + techDeptObj.departmentName());
		
		System.out.println(techDeptObj.getTodaysWork());
		System.out.println(techDeptObj.getWorkDeadline());
		System.out.println(techDeptObj.getTechStackInformation());
		System.out.println(techDeptObj.isTodayAHoliday());
		
		
		
	}

}
