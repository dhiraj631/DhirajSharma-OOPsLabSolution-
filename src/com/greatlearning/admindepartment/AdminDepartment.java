package com.greatlearning.admindepartment;
import com.greatlearning.superdepartment.Superdepartment;

public class AdminDepartment extends Superdepartment {
	
	public String departmentName()
    {
        String dept = new String();
        dept = "Admin Department";
        return dept;
    }
    public String getTodaysWork()
    {
        String work = new String();
        work = "Complete your documents Submission";
        return work;
    }
    public String getWorkDeadline()
    {
    	String deadline = new String();
        deadline = "Complete by EOD";
        return deadline;
    }
	

}