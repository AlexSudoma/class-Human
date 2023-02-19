package sample;

public class Main {

	public static void main(String[] args) {

		Student st1 = new Student("Vasya", "Pupkin", Gender.MALE, 1, "group 11");
		Student st2 = new Student("Petya", "Ivanov", Gender.MALE, 2, "group 11");
		Student st3 = new Student("Sveta", "Kotko", Gender.FEMALE, 3, "group 11");
		Student st4 = new Student("Katya", "Cibko", Gender.FEMALE, 4, "group 11");
		Student st5 = new Student("Vova", "Kolyagin", Gender.MALE, 5, "group 11");
		Student st6 = new Student("Vetalik", "Levchenko", Gender.MALE, 6, "group 11");
		Student st7 = new Student("Olya", "Brinyk", Gender.FEMALE, 7, "group 11");
		Student st8 = new Student("Vasya", "Lynko", Gender.MALE, 8, "group 11");
		Student st9 = new Student("Marina", "Sytko", Gender.FEMALE, 9, "group 11");
		Student st10 = new Student("Misha", "Ivashko", Gender.MALE, 10, "group 11");

		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		System.out.println(st4);
		System.out.println(st5);
		System.out.println(st6);
		System.out.println(st7);
		System.out.println(st8);
		System.out.println(st9);
		System.out.println(st10);

		Group group1 = new Group();
		try {
			group1.addStudent(st1);
			group1.addStudent(st2);
			group1.addStudent(st3);
			group1.addStudent(st4);
			group1.addStudent(st5);
			group1.addStudent(st6);
			group1.addStudent(st7);
			group1.addStudent(st8);
			group1.addStudent(st9);
			group1.addStudent(st10);

		} catch (GroupOverflowException e) {
			e.printStackTrace();
		}
		System.out.println(group1);

		try {
			group1.searchStudentByLastName("Ivashko");
			System.out.println(st10);
			group1.searchStudentByLastName(st5.getLastName());
			System.out.println(st5);
		} catch (StudentNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println(group1.removeStudentByID(9));

	}

}
