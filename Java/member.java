class Member{
    String name;
    int age;
    String number;
    String address;
    int salary;
  
    public void printSalary(){
      System.out.println(salary);
    }
  
  }
  class Employee extends Member{
    String specialization;
  }
  class Manager extends Member{
    String department;
  }
  class member{
    public static void main(String[] args){
      Employee e = new Employee();
      e.name = "Kumaresh";
      e.age = 21;
      e.number = "7010502099";
      e.address = "Coimbatore";
      e.salary = 50000;
      e.specialization = "Nothing";
  
      Manager m = new Manager();
      
    }
  }