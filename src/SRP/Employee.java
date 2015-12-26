package SRP;

public class Employee
{
    private String employeeName;
    private int employeeNo;
    
    public void setEmployeeName(String en){
        this.employeeName = en;
    }
    public String getEmployeeName(){
        return this.employeeName;
    }
    
    public void setEmployeeNo(int eno){
        this.employeeNo = eno;
    }
    public int getEmployeeNo(){
        return this.employeeNo;
    }
}