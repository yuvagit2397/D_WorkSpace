package javaprograms;

public class Employee {
	
private int id;
private String name;
private int salary;


Employee(){

}
//optional(if we use parameterized cons no need to write setMethods)
Employee(int id,String name,int salary){
	this.id=id;
	this.name=name;
	this.salary=salary;
}

public void setId(int id) {
	this.id=id;
}
public void setName(String name ) {
	this.name=name;
}
public void setSalary(int salary) {
	this.salary=salary;
}
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public int getSalary() {
	return salary;
}

}
