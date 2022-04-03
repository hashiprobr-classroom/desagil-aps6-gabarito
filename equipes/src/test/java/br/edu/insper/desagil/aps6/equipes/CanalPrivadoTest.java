package br.edu.insper.desagil.aps6.equipes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CanalPrivadoTest {
	private CanalPrivado c;

	private Usuario usuarioCom(String email) {
		Usuario usuario = mock(Usuario.class);
		when(usuario.getEmail()).thenReturn(email);
		return usuario;
	}

	@BeforeEach
	private void setUp() {
		List<Usuario> lista = new ArrayList<>();
		lista.add(usuarioCom("usuario1@teste.com"));

		Equipe equipe = mock(Equipe.class);
		when(equipe.listaTodos()).thenReturn(lista);

		c = new CanalPrivado(equipe, "teste");
	}

	@Test
	void adicionaFiliado() {
		c.adicionaMembro(usuarioCom("usuario1@teste.com"));
		List<Usuario> membros = c.getMembros();
		assertEquals(1, membros.size());
		assertEquals("usuario1@teste.com", membros.get(0).getEmail());
	}

	@Test
	void tentaAdicionarNaoFiliado() {
		c.adicionaMembro(usuarioCom("usuario2@teste.com"));
		List<Usuario> membros = c.getMembros();
		assertEquals(0, membros.size());
	}
}
