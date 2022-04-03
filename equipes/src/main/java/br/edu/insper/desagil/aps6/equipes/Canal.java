package br.edu.insper.desagil.aps6.equipes;

import java.util.ArrayList;
import java.util.List;

public class Canal {
	private Equipe equipe;
	private String nome;
	private List<Mensagem> mensagens;

	public Canal(Equipe equipe, String nome) {
		this.equipe = equipe;
		this.nome = nome;
		this.mensagens = new ArrayList<>();
	}

	public Equipe getEquipe() {
		return equipe;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Mensagem> getMensagens() {
		return mensagens;
	}

	public void adicionaMensagem(Usuario autor, String mensagem) {
		mensagens.add(new Mensagem(autor, mensagem));
	}
}
