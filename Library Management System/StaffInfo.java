
package librarymanagementsystem2;


public class StaffInfo {
     private String id;
      private String name;
    private int salary;

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
}     
    StaffInfo(String i,String n,int s){
        id=i;
        name=n;
        salary=s;
    }
    //override
  void tax( int salary){
       if (salary>2000){
           System.out.println(" tax added salary");
       }
       else{
           System.out.println("no tax");
       }
   }
        
    
    
    
    void Staff_Info(){
        System.out.println("Staff Name : "+name+"\nStaff Id : "+id+"\nStaff Salary : "+salary);
    }

}

    

