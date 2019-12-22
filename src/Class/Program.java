package Class;

public class Program extends Employee {


    public Program(String name, int age, String company) {
        super(name, age, company);
    }

    public static void main(String[] args) {
        Person tom = new Person("Tom", 29) {


            @Override
            public void display() {
                System.out.printf("Person %s. %s age. \n", getName(), getAge());
            }
        };
        tom.display();
        Person sam = new Employee("Sam", 30, "Mera");
        sam.display();
    }
}


