package br.edu.insper.desagil.aps6.equipes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EquipeTest {
	private Equipe e;
	private List<String> emailsEsperados;

	private Usuario usuarioCom(String email) {
		Usuario usuario = mock(Usuario.class);
		when(usuario.getEmail()).thenReturn(email);
		return usuario;
	}

	private List<String> emailsObtidos(List<Usuario> usuarios) {
		List<String> emails = new ArrayList<>();
		for (Usuario usuario : usuarios) {
			emails.add(usuario.getEmail());
		}
		return emails;
	}

	@BeforeEach
	private void setUp() {
		e = new Equipe(new ArrayList<>());
		e.filia(usuarioCom("usuario1@teste.com"));
		e.filia(usuarioCom("usuario2@teste.com"));
		e.filia(usuarioCom("usuario3@teste.com"));
		e.filia(usuarioCom("usuario4@teste.com"));
		e.altera("usuario2@teste.com", true);
		e.altera("usuario4@teste.com", true);
		emailsEsperados = new ArrayList<>();
	}

	@Test
	void temDoisComuns() {
		emailsEsperados.add("usuario1@teste.com");
		emailsEsperados.add("usuario3@teste.com");
		assertEquals(emailsEsperados, emailsObtidos(e.listaComuns()));
	}

	@Test
	void temDoisProprietarios() {
		emailsEsperados.add("usuario2@teste.com");
		emailsEsperados.add("usuario4@teste.com");
		assertEquals(emailsEsperados, emailsObtidos(e.listaProprietarios()));
	}

	@Test
	void temQuatroFiliados() {
		emailsEsperados.add("usuario1@teste.com");
		emailsEsperados.add("usuario2@teste.com");
		emailsEsperados.add("usuario3@teste.com");
		emailsEsperados.add("usuario4@teste.com");
		assertEquals(emailsEsperados, emailsObtidos(e.listaTodos()));
	}
}
