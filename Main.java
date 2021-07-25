package hw;

public class Main {

	public static void main(String[] args) {

		Group group = new Group("6220");
		Student student1 = new Student("A", "B", 23, Gender.MALE, 147852, "6220");
		Student student2 = new Student("C", "D", 22, Gender.FEMALE, 369852, "6220");
		Student student3 = new Student("E", "F", 23, Gender.FEMALE, 365896, "6220");
		Student student4 = new Student("G", "H", 23, Gender.FEMALE, 852369, "6220");
		Student student5 = new Student("J", "K", 23, Gender.FEMALE, 852147, "6220");
		Student student6 = new Student("L", "M", 23, Gender.FEMALE, 789654, "6220");
		Student student7 = new Student("N", "O", 23, Gender.FEMALE, 456987, "6220");
		Student student8 = new Student("P", "Q", 23, Gender.FEMALE, 852365, "6220");
		Student student9 = new Student("R", "S", 23, Gender.FEMALE, 321456, "6220");
		Student student10 = new Student("T", "U", 23, Gender.FEMALE, 456387, "6220");
		Student student11 = new Student("X", "Y", 23, Gender.FEMALE, 758214, "6220");

		group.addStudent(student1);
		group.addStudent(student2);
		group.addStudent(student3);
		group.addStudent(student4);
		group.addStudent(student5);
		group.addStudent(student6);
		group.addStudent(student7);
		group.addStudent(student8);
		group.addStudent(student9);
		group.addStudent(student10);
		group.addStudent(student11);

		System.out.println(group.toString());

		group.searchStudent("B");

		group.delStudent(147852);
		
		group.searchStudent("Q");

		System.out.println(group.toString());

	}

}
