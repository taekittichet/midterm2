package OOP;

public class OOP091 {
    public static void main(String[] args) {
        testStudent();
        testEmployee();
    }
    public static void testStudent() {
        Student student1 = new Student("Tom",18,"A");
        System.out.println(student1);
        System.out.println(student1.say("Hello world"));
        student1.setName("Karn");
        System.out.println("Change Student1 name to (Karn): " + student1.getName());
        System.out.println(" ");

        System.out.println(student1);
        student1.setAge(25);
        System.out.println("Change Student1 age to (25): " + student1.getAge());
        System.out.println(" ");

        System.out.println(student1);
        student1.setGroupBlood("AB");
        System.out.println("Change Student1 blood type to (AB): : " + student1.getGroupBlood());
        System.out.println("Final result: " + student1);
        System.out.println(" ");

        Student student2 = new Student("Buss",10,"B");
        System.out.println(" ");

        System.out.println("Student2: " + student2);
        System.out.println("Check equal between student1 and student2(not equal): " + student1.equals(student2));
        System.out.println(" ");

        System.out.println("Change student 1 to have everything same with student2");
        student1.setName("Buss");
        student1.setAge(10);
        student1.setGroupBlood("B");
        System.out.println("New student1: " + student1);
        System.out.println("Check equal between student1 and student2(equal): " + student1.equals(student2));

        System.out.println(" ");
    }
    public static void testEmployee() {
        Employee employee1 = new Employee("Kittipat","Srikitticha",18,001);
        employee1.setSalary(15000);
        System.out.println("Salary: " + employee1.getSalary());
        employee1.setBonus(5000);
        System.out.println("Bonus: " + employee1.getBonus());
        System.out.println("Final salary: " + employee1.getFinalSalary());
        System.out.println("Salary per day: " + employee1.getSalaryPerDay());
        System.out.println("Salary per week: " + employee1.getSalaryPerWeek());
        System.out.println(employee1);
        System.out.println(" ");

        Employee employee2 = new Employee("Teerapat","Sangman",19,002);
        employee2.setSalary(200000);
        System.out.println("Salary: " + employee2.getSalary());
        employee2.setBonus(8000000);
        System.out.println("Bonus: " + employee2.getBonus());
        System.out.println("Final salary: " + employee2.getFinalSalary());
        System.out.println("Salary per day: " + employee2.getSalaryPerDay());
        System.out.println("Salary per week: " + employee2.getSalaryPerWeek());
        System.out.println(employee2);
        System.out.println("Check equal: " + employee1.equals(employee2));
    }
}
