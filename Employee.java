public class Employee{
    int id;
    String Firstname;
    String Lastname;
    int salary;

    public Employee(int id, String Firstname, String Lastname, int salary){
        this.id = id;
        this.Firstname = Firstname;
        this.Lastname = Lastname;
        this.salary = salary;

    }

    public int getId(){
        return this.id ;
    }

    public String getFirstname(){
        return this.Firstname;
    }

    public String getLastname(){
        return this.Lastname;
    }

    public int getSalary(){
        return this.salary;
    }

    public void setId(int newid){
        this.id = newid;
    }

    public void setFirstname(String newFirstname){
        this.Firstname = newFirstname;
    }

    public void setLastname(String newLastname){
        this.Lastname = newLastname;
    }

    public void setSalary(int newsalary){
        this.salary = newsalary;
    }
    public String getName(){
        return Firstname + " " + Lastname;
    }
    public int  getAnnualSallary(){
        return salary*12;
    }
    public int raiseSallary(){
        return salary*110/100;
    }
    @Override

    public String toString(){
        return "id is: " + id + "\n" +
               "firstname is: " + Firstname + "\n" +
               "lastname is:" + Lastname + "\n" +
               "salary is: " + salary + "\n"+
               "name is: " + getName() + "\n" +
               "annual salary is: " + getAnnualSallary();

    }

}