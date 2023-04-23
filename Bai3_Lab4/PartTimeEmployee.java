
package Bai3_Lab4;

public class PartTimeEmployee extends Employee {
    private int hoursPerWeek;
    public PartTimeEmployee(String name,int age,char gender,String employerName,String dateHired,int hoursPerWeek){
        super(name,age,gender,employerName,dateHired);
        this.hoursPerWeek=hoursPerWeek;
    }
    public void sethoursPerWeek(int hoursPerWeek){
        this.hoursPerWeek=hoursPerWeek;
    }
    public int gethoursPerWeek(){
        return this.hoursPerWeek;
    }
    Employee e=new Employee(null,0,'N',"DEF","14-12");
    @Override
    public String toString(){
        System.out.println(e.toString());
        return "hoursPerWeek"+hoursPerWeek;
    }
    
    
}
