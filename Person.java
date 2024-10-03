package JavaAssignment;

public class Person {

		final private int age ;
		final private String name;

		public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
		}

		public int getAge() {
		return age;
	}

		public String getName() {
		return name;

		}

		@Override

		public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
		}

		public static void main(String[] args) {

		Person person =new Person(25,"Ashvini");
		 System.out.println(person);

	       
		person.getAge();
		person.getName();

		}

	}


