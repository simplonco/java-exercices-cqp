package exercices.lifeschool;


import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class LifeSchool {

    public static void main(String[] args) {
        Student stephanie = new Student("Stéphanie", "Durand", LocalDate.of(1980, Month.NOVEMBER, 12), 37);
        Student mamadou = new Student("Mamadou", "Fort", LocalDate.of(1992, Month.SEPTEMBER, 13), 25);
        Student florence = new Student("Florence", "Lune", LocalDate.of(2001, Month.APRIL, 5), 16);
        Student loic = new Student("loic", "Martin", LocalDate.of(1998, Month.NOVEMBER, 7), 19);

        List<Student> students = new ArrayList<>();
        students.add(stephanie);
        students.add(mamadou);
        students.add(florence);
        students.add(loic);

        School infoJava = new School("InfoJava", students);
        System.out.println(infoJava);

        float average = infoJava.getAverage();
        System.out.println(average);

        Graduate drake = new Graduate("Drake", "Foudre", LocalDate.of(1990, Month.NOVEMBER, 11), 27, 2);
        Graduate solange = new Graduate("Solange", "Feu", LocalDate.of(1990, Month.DECEMBER, 12), 27, 5);
        Graduate johnny = new Graduate("Johnny", "Lumiere", LocalDate.of(1990, Month.OCTOBER, 10), 27, 3);

        students.add(drake);
        students.add(solange);
        students.add(johnny);
        infoJava.setStudents(students);

        System.out.println(infoJava);

        Graduate compare = infoJava.compare(drake, solange);

        System.out.println(drake.equals(solange));



    }
}
