public class Employee {
        public String name;
        public double Salary;

        public Employee(String name, double Salary){
            this.name= name;
            this.Salary= Salary;
        }
        public double annualSalary(){
            return Salary*12;
        }
        public void displayAll(){
            System.out.println("Employee name: "+name);
            System.out.println("Employee Salary: "+ Salary);
            System.out.println("Annual salary: "+ annualSalary());
        }
    public static void main(String[] args){
            Employee engineer = new Employee("Aya", 11000.50);
            engineer.displayAll();
    }
}
