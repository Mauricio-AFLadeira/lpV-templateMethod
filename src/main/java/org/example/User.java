package org.example;

public abstract class User {
    private String mensagem;
    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public abstract String adicionarEmoji();

    public String getTipo() {
        return "Anônimo";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "mensagem: " + this.mensagem + " " +
                this.adicionarEmoji() +
                '}';
    }
}
