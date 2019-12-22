package Class;

abstract class Person implements Computer {
    private String name;
    private int age;


    public String getName() {
        return name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void display();

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void playing() {
        System.out.println("You playing!");
    }
}


