package javaprograms;

public class Pojo {
public static void main(String[] args) {
	Employee e=new Employee();
	
	
	int id = e.getId();
	System.out.println(id);
	Employee e1=new Employee(02,"paanai",41000);
	System.out.println("Id : "+e1.getId());
	System.out.println("Name : "+e1.getName());
	System.out.println("Salary : "+e1.getSalary());
}
}
