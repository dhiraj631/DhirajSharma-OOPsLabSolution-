package com.greatlearning.HrDepartment;
import com.greatlearning.superdepartment.Superdepartment;

public class HrDepartment extends Superdepartment {
	
	public String departmentName()
    {
        String dept = new String();
        dept = "HR Department";
        return dept;
    }
    public String getTodaysWork()
    {
     String work = new String();
        work = "Fill Today's worksheet and mark your attendence";
        return work;
    }
    public String getWorkDeadline()
    {
        String deadline = new String();
        deadline = "Complete by EOD";
        return deadline;
    }
    public String doActivity()
    {
     String activity = new String();
        activity = "team Lunch";
        return activity;
    }

}