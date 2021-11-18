package com.greatlearning.TechDepartment;
import com.greatlearning.superdepartment.Superdepartment;

public class TechDepartment extends Superdepartment {

	public String departmentName()
    {   String dept = new String();
        dept = "Tech Department";
        return dept;
    }
    public String getTodaysWork()
    {String work = new String();
        work = "Complete coding of module 1";
        return work;
    }
    public String getWorkDeadline()
    {
         String deadline = new String();
        deadline = "Complete by EOD";
        return deadline;
    }
    public String getTechStackInformation()
    {
       String info = new String();
        info = "core Java";
        return info;
    }
}