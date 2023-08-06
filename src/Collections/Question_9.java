package Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

 class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String retreiveName() {
        return name;
    }

    public int retreiveAge() {
        return age;
    }

    
    public int compareTo(Person otherPer) {
        return this.name.compareTo(otherPer.name);
    }

    
    public String toString() {
        return name + " (" + age + " years old)";
    }
}
 
 class AgeComparator implements Comparator<Person> {
	    @Override
	    public int compare(Person p1, Person p2) {
	        return Integer.compare(p1.retreiveAge(), p2.retreiveAge());
	    }
	}



public class Question_9 {
	
	 public static void main(String[] args) {
	        List<Person> peopleList = new ArrayList<>();
	        peopleList.add(new Person("Vivek", 23));
	        peopleList.add(new Person("Rajan", 25));
	        peopleList.add(new Person("Narendra", 33));
	        peopleList.add(new Person("Ramendra", 35));

	        
	        Collections.sort(peopleList);
	        System.out.println("It's Sorted by name (natural ordering):");
	        System.out.println(peopleList);

	        
	        Collections.sort(peopleList, new AgeComparator());
	        System.out.println("\nIt's Sorted by age using Comparator:");
	        System.out.println(peopleList);
	    }

}
