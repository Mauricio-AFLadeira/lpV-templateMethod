package org.example;

public class UserLogged extends User{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String adicionarEmoji() {
        return "🤑🤑🤑🤑🤑🤑🤑";
    }

    @Override
    public String getTipo() {
        return getName();
    }
}
