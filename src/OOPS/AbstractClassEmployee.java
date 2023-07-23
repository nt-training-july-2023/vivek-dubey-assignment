package OOPS;

 abstract class Person {
	
	private String name;
	private String email;
	
	public Person(String name, String email){
		this.name=name;
		this.email=email;
	}
	
	//abstract method
	public abstract void work();
	
	@Override
	public String toString(){
		return "Name is ="+this.name+"::Email is ="+this.email;
	}

	public void changeName(String newName) {
		this.name = newName;
	}	
}

public class AbstractClassEmployee extends Person {
	
	private int empId;
	
	public AbstractClassEmployee(String name, String email, int empId) {
		super(name, email);
		this.empId=empId;
	}
	
	@Override
	public void work() {
		if(empId == 0){
			System.out.println("Out of organisation");
		}else{
			System.out.println("This person is Working as an employee!!");
		}
	}

	public static void main(String[] args) {
		
				Person randomPerson = new AbstractClassEmployee("Archana","abc@gmail.com",0);
				Person abstractClassEmployee = new AbstractClassEmployee("Vivek","dubeyvk0106@gmail.com",111);
				randomPerson.work();
				abstractClassEmployee.work();
				abstractClassEmployee.changeName("Vivek Dubey");
				System.out.println(abstractClassEmployee.toString());
		
		
	}

}
