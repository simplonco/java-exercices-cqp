package exercices.lifeschool;


import java.util.List;

public class School {
    private String name;
    private List<Student> students;

    public School(String name, List<Student> students) {
        this.name = name;
        this.students = students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public float getAverage() {
        int ageTotal = 0;
        for (Student student : students) {
            ageTotal += student.getAge();
        }
        return ageTotal / students.size();
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", students=" + students +
                '}';
    }

}
