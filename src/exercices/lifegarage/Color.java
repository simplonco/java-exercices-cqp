package exercices.lifegarage;


public enum Color {
    RED("#F00333"),
    BLUE("#0000FF"),
    GREEN("#26C650");

    private String code = "";

    Color(String code) {
        this.code = code;
    }

    public String toString() {
        return "Color{" +
                "code='" + code + '\'' +
                '}';
    }
}
