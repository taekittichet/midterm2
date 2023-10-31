package OOP;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private String groupBlood;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGroupBlood() {
        return groupBlood;
    }

    public void setGroupBlood(String groupBlood) {
        this.groupBlood = groupBlood;
    }

    public Student(String name, int age, String groupBlood) {
        this.name = name;
        this.age = age;
        this.groupBlood = groupBlood;
    }

    public String say(String message) {
        return name + " say: " + message;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", groupBlood='").append(groupBlood).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(groupBlood, student.groupBlood);
    }

}
