package se.jhnesk.quizbutton;

public enum UserState {
    INSTANCE;

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
