package oop3;

public class PersonTest {
	public static void main(String[] args) {
		Person person = new Person("Timo Werner",
									"London", 
									"0888888888",
									"timoW@gmail.com");
		Student student = new Student(  "Kai Havertz",
										"Cobham",
										"0123456789",
										"kaihav99@gmail.com",
										Student.FRESHMAN);
		Employee employee = new Employee(
				"Odoi",
				"Fulham",
				"1234321",
				"calumHO00@gmail.com",
				"Chelsea",
				200_000);
		Staff staff = new Staff(
				"Eduard Mendy",
				"Rennes",
				"987666",
				"edoumen1@gmail.com",
				"Chelsea",
				80_000,
				"Goalkeeper");
		Faculty faculty = new Faculty(
				"Kepa",
				"Valencia",
				"987420666",
				"kepaldo1@gmail.com",
				"Office22",
				90_000,
				"9:00-17:00",
				"Global Elite");

		System.out.println(person.toString() + "\n");
		System.out.println(student.toString() + "\n");
		System.out.println(employee.toString() + "\n");
		System.out.println(staff.toString() + "\n");
		System.out.println(faculty.toString() + "\n");
	}
}
