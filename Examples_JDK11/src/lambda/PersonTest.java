package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PersonTest {

	private static List<Person> roster = new ArrayList<Person>();
	private static void init() {
		Person p1 = new Person();
		p1.setAge(10);
		roster.add(p1);
		p1 = new Person();
		p1.setAge(20);
		roster.add(p1);
		p1 = new Person();
		p1.setAge(30);
		roster.add(p1);
		p1 = new Person();
		p1.setAge(40);
		roster.add(p1);
		p1 = new Person();
		p1.setAge(50);
		roster.add(p1);
				
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		init();
		
		//printPersons(roster);
		List<Person> filterd = roster.stream().filter(p -> p.getAge() > 30).collect(Collectors.toList());
		filterd.forEach(n -> System.out.println(n.getprintPerson()));
	

		
	}
	
		
}
