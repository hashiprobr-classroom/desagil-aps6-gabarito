package br.edu.insper.desagil.aps6.equipes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MensagemTest {
	private Mensagem m;

	private Usuario usuarioCom(String email) {
		Usuario usuario = mock(Usuario.class);
		when(usuario.getEmail()).thenReturn(email);
		return usuario;
	}

	@BeforeEach
	private void setUp() {
		m = new Mensagem(mock(Usuario.class), "teste");
	}

	@Test
	void interacaoPositivaNegativaPositiva() {
		m.interagir(usuarioCom("usuario1@teste.com"), true);
		m.interagir(usuarioCom("usuario2@teste.com"), false);
		m.interagir(usuarioCom("usuario3@teste.com"), true);
		assertEquals(1, m.popularidade());
	}

	@Test
	void interacaoNegativaPositivaNegativa() {
		m.interagir(usuarioCom("usuario1@teste.com"), false);
		m.interagir(usuarioCom("usuario2@teste.com"), true);
		m.interagir(usuarioCom("usuario3@teste.com"), false);
		assertEquals(-1, m.popularidade());
	}

	@Test
	void interacaoPositivaNegativaPositivaNegativa() {
		m.interagir(usuarioCom("usuario1@teste.com"), true);
		m.interagir(usuarioCom("usuario2@teste.com"), false);
		m.interagir(usuarioCom("usuario3@teste.com"), true);
		m.interagir(usuarioCom("usuario4@teste.com"), false);
		assertEquals(0, m.popularidade());
	}

	@Test
	void interacaoNegativaPositivaNegativaPositiva() {
		m.interagir(usuarioCom("usuario1@teste.com"), false);
		m.interagir(usuarioCom("usuario2@teste.com"), true);
		m.interagir(usuarioCom("usuario3@teste.com"), false);
		m.interagir(usuarioCom("usuario4@teste.com"), true);
		assertEquals(0, m.popularidade());
	}
}
