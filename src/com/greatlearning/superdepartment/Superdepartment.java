package com.greatlearning.superdepartment;

public class Superdepartment {
	public String departmentName()
    {
    	String dept = new String();
        dept = "Super Department";
        return dept;
    }
    public String getTodaysWork()
    {
       String work = new String();
        work = "No work as of now";
        return work;
    }
    public String getWorkDeadline()
    {
        String deadline = new String();
        deadline = "nil";
        return deadline;
    }
    public String isTodayAHoliday()
    {
       String holiday = new String();
        holiday = "Today is not a Holiday";
        return holiday;
    }

}