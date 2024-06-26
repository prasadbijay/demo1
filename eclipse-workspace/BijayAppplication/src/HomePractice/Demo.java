package HomePractice;
import java.util.Comparator;
public class Demo implements Comparable<Demo>{
	int id;
	int salary;
	String Name;
	int contact;
	public Demo(int id, int salary, String name, int contact) {
		super();
		this.id = id;
		this.salary = salary;
		this.Name = name;
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Demo [id=" + id + ", salary=" + salary + ", Name=" + Name + ", contact=" + contact + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	@Override
	public int compareTo(Demo on) {
		// TODO Auto-generated method stub
		if(id==on.id) {
			System.out.println("exeception");
			return 1;
		}
		else if(id !=on.id) { 
			System.out.println("");
		return 0;
	}
		else {
			return -1;
		}
		}

}
