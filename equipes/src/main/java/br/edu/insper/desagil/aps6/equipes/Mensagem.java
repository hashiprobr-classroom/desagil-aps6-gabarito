package br.edu.insper.desagil.aps6.equipes;

import java.util.HashMap;
import java.util.Map;

public class Mensagem {
	private Usuario autor;
	private String texto;
	private Map<String, Boolean> interacoes;

	public Mensagem(Usuario autor, String texto) {
		this.autor = autor;
		this.texto = texto;
		this.interacoes = new HashMap<>();
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Usuario getAutor() {
		return autor;
	}

	public Map<String, Boolean> getInteracoes() {
		return interacoes;
	}

	public void interagir(Usuario usuario, boolean interacao) {
		interacoes.put(usuario.getEmail(), interacao);
	}

	public int popularidade() {
		int popularidade = 0;
		for (boolean interacao : interacoes.values()) {
			if (interacao) {
				popularidade++;
			} else {
				popularidade--;
			}
		}
		return popularidade;
	}
}
