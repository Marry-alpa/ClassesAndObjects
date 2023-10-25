public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        MyClassWithMethod obj2 = new MyClassWithMethod();
        //obj.forError("Error");
        obj2.print("Print something");
        Horse horse = new Horse("Bruno", "orange", 7);
        Students students = new Students();

        students.setName("Katrin");
        students.setSurname("Madrigal");
        students.setAge(18);

        System.out.printf(
                "Name: %s Surname: %s Age: %d",
                students.getName(),
                students.getSurname(),
                students.getAge());
        //obj.setCourse("Course");
    }
}
