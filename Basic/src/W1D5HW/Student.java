package W1D5HW;


import java.util.ArrayList;
import java.util.List;

public class Student {
	private final String name;
	private final int id;
	private final int age;
	private final List<String>list;
	
	public Student(String name, int id, int age,ArrayList<String>list) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		this.list=new ArrayList(list);
	}

	public final void goToSchool(String name) {
		
		
		System.out.println(name+" is going to school");
		
	}

	public ArrayList<String> getList() {
		return new ArrayList(list);
	}
	
	

	
}
