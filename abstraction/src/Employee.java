public class Employee extends Person{
    private int EmpID;

    public Employee(String name, String gender, int empID) {
        super(name,gender);
        this.EmpID = empID;
    }


}