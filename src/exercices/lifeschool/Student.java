package exercices.lifeschool;


import java.time.LocalDate;

public class Student {
    private String firstName;
    private String name;
    private LocalDate birth;
    private int age;

    public Student(String firstName, String name, LocalDate birth, int age) {
        this.firstName = firstName;
        this.name = name;
        this.birth = birth;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", name='" + name + '\'' +
                ", birth=" + birth +
                ", age=" + age +
                '}';
    }
}
