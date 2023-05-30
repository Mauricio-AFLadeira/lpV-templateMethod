package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserUnloggedTest {
    @Test
    void deveRetonarAvisoSemEmoji() {
        UserUnlogged user = new UserUnlogged();
        assertEquals("*faça seu cadastro para ativar os emojis*", user.adicionarEmoji());
    }

    @Test
    void deveRetornarInformacoes() {
        UserUnlogged user = new UserUnlogged();
        user.setMensagem("esperava mais de alguem como você");
        assertEquals("Anônimo{mensagem: esperava mais de alguem como você *faça seu cadastro para ativar os emojis*}", user.getInfo());
    }

}