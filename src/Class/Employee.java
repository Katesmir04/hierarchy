package Class;

class Employee extends Person {

    private String company;

    public Employee(String name, int age, String company) {
        super(name, age);
        this.company = company;
    }


    @Override
    public void display() {
        System.out.printf("Employee %s to which %s age works in %s. \n", super.getName(), getAge(), company);
    }


}
