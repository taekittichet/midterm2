package OOP;
import function.utils.*;

import java.util.Objects;

public class Employee {
    private String fname;
    private String lname;
    private int age;
    private int salary;
    private int bonus;
    private final int id;

    public Employee(String fname, String lname, int age, int id) {
        this.fname = fname;
        this.lname = lname;
        this.id = id;
        if (Utils091.checkInt(age)) this.age = age;
        else throw new IllegalArgumentException("Age must be possitive.");
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (Utils091.checkInt(salary)) this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        if (Utils091.checkInt(bonus)) this.bonus = bonus;
    }

    public int addBonus(int bonus) {
       return this.bonus += bonus;
    }
    public int getFinalSalary() {
        return salary += bonus;
    }
    public int addAge() {
        return age += 1;
    }
    public String getFullName() {
        return fname + " " + lname;
    }
    public int getSalaryPerDay() {
        int salary2 = this.salary;
        return salary2 /= 30;
    }
    public int getSalaryPerWeek() {
        int salary2 = this.salary;
        return salary2 /= 4;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee(");
        sb.append("id='").append(id).append('\'');
        sb.append(", fname='").append(fname).append('\'');
        sb.append(", lname=").append(lname);
        sb.append(", age=").append(age);
        sb.append(", salary=").append(salary);
        sb.append(", bonus=").append(bonus);
        sb.append(", final salary=").append(getFinalSalary());
        sb.append(')');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        return false;
    }

    /*30. Create class 'Employee' with 1 private final attribute (id) and 5 private attribute (fname, lname, age, salary, bonus) then create constructor with 3 parameter (fname: String, lname: String, age: int).
30.1 While initialize the age in constructor use 'checkInteger' method in 'MathFuncYYY' class. throw 'IllegalArgumentException' error with the error message 'age must be positive'
31. Create Getter and Setter for all attribute except 'fname', 'lname', 'age' and 'id';
31.1 For each setter, use 'checkString' or 'checkInteger' depends on the type of function.
32. Create function 'addBonus' with 1 parameter (bonus: int) and then add bonus from parameter to current bonus.
33. Create function 'getFinalSalary' that return the sum of product and bonus.
34. Create function 'addAge' that add current age by 1 and then return the new age.
35. Create function 'getFullName' that return the full name of employee. The output should be like this 'John Doe' (fname + " " + lname)

36. Create function 'getSalaryPerDay' that return the salary per day of employee. The output should be like this '1000' if the  salary is 30,000.
37. Create function 'getSalaryPerWeek' that return the salary per hour of employee. The output should be like this '4285' if the  salary is 30,000.
38. Override 'toString' function that return all attribute. The output should be like this 'Employed(id=1, firstName=John, lastName=Doe, age=20, salary=10000, bonus=5000, finalSalary=15000)'
39. Override 'equals' function to compare all of attribute from own class to giving class.
40. Show all usage of all function on 'OOPYYY.java'*/
}
