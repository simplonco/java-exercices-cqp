package exercices.lifeschool;


import java.time.LocalDate;
import java.util.Objects;

public class Graduate extends Student {

    private int level;

    public Graduate(String firstName, String name, LocalDate birth, int age, int level) {
        super(firstName, name, birth, age);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return "Graduate{" +
                "fistName='" + super.getFirstName() +
                "',name='" + super.getName() +
                "',level=" + level +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Graduate graduate = (Graduate) o;
        return level == graduate.level;
    }

    @Override
    public int hashCode() {
        return Objects.hash(level);
    }
}
