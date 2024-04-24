/*package pl.pp;
import pl.pp.Person;

public class mySeventhApp {
    public static void main(String[] args) {
        Person person1 = new Person(); // create object person1 of class Person with default parameters/attributes
        person1.hiToAll(); // by default, fields are empty or zero so this should be displayed

        person1.forename = "John";
        person1.surname = "Doe";
        person1.age = 24;
        person1.hiToAll(); // now it should display the values that we just entered as attributes of the object

        // knowing that we have a constructor for the object that is not empty but accepts certain characteristics, you can
        // initialize an object in one line instead of entering values in each field as above

        Person person2 = new Person("Alice", "Hart", 42);
        person2.hiToAll();

        // you can now use the method growOld() e.g., once for object person1 and three times for object person2
        person1.growOld();
        for(int i=0; i<3; i++) {
            person2.growOld();
        }
        // and display the final age, does everything match up?
        person1.hiToAll();
        person2.hiToAll();

        // instead of referring to specific fields of the object, you can write methods that set, for example, the variable
        // forename or read it and use these methods
        System.out.println(person1.getName()); // read forename from the object using a method (see - Person class code)
        person1.setName("Lolo"); // change the forename field in the object person1
        System.out.println(person1.getName()); // check if the forename in the object person1 has changed
        person1.hiToAll();
    }
}*/
public class mySeventhApp {
    public static void main(String[] args) {
        class Person {
            String forename;
            String surname;
            int age;
            String address;
            int year_of_birth;

            // Constructor
            public Person(String forename, String surname, int age, String address, int year_of_birth) {
                this.forename = forename;
                this.surname = surname;
                this.age = age;
                this.address = address;
                this.year_of_birth = year_of_birth;
            }

            // Constructor with three parameters
            public Person(String forename, String surname, int age) {
                this.forename = forename;
                this.surname = surname;
                this.age = age;
            }

            // Default constructor
            public Person() {
                this("", "", 0, "", 0);
            }

            public void hiToAll() {
                System.out.println("Hi, my name is " + forename + " " + surname + ", I am " + age + " years old." + "My address " + address + " Year_of_birth " + year_of_birth);
            }

            public void growOld(int years) {
                this.age += years;
            }

            public void beYounger() {
                if (this.age > 0) {
                    this.age--;
                }
            }

            public String getName() {
                return this.forename;
            }

            public void setName(String name) {
                this.forename = name;
            }
        }

        Person person1 = new Person();
        person1.hiToAll();

        person1.setName("John");
        person1.surname = "Doe";
        person1.growOld(24);
        person1.address = "Evreika 25";
        person1.year_of_birth = (1990);
        person1.hiToAll();

        Person person2 = new Person("Alice", "Hart", 42, "Lukyanenka 56", 1992);
        person2.hiToAll();

        person1.growOld(8);
        for(int i=0; i<4; i++) {
            person2.growOld(1);
        }

        person1.hiToAll();
        person2.hiToAll();

        System.out.println(person1.getName());
        person1.setName("Lolo");
        System.out.println(person1.getName());
        person1.hiToAll();
    }
}
