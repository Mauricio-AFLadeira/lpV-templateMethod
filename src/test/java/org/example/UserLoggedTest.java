package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserLoggedTest {
    @Test
    void deveRetonarEmoji() {
        UserLogged user = new UserLogged();
        assertEquals("🤑🤑🤑🤑🤑🤑🤑", user.adicionarEmoji());
    }

    @Test
    void deveRetornarInformacoes() {
        UserLogged user = new UserLogged();
        user.setMensagem("se você tivesse feito isso antes ainda estariamos na mesma situação");
        user.setName("Richas");
        assertEquals("Richas{mensagem: se você tivesse feito isso antes ainda estariamos na mesma situação 🤑🤑🤑🤑🤑🤑🤑}", user.getInfo());
    }

}