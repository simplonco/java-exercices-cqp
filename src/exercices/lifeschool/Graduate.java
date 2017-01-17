package exercices.lifeschool;


import java.time.LocalDate;

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
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Graduate{" +
                "fistName='" + super.getFirstName() +
                "',name='" + super.getName() +
                "',level=" + level +
                '}';
    }

}
