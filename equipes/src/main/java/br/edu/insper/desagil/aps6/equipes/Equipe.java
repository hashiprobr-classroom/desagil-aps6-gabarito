package br.edu.insper.desagil.aps6.equipes;

import java.util.ArrayList;
import java.util.List;

public class Equipe {
	private List<Filiacao> filiacoes;

	public Equipe(List<Filiacao> filiacoes) {
		this.filiacoes = filiacoes;
	}

	public void filia(Usuario usuario) {
		filiacoes.add(new Filiacao(usuario));
	}

	public void altera(String email, boolean proprietario) {
		for (Filiacao filiacao : filiacoes) {
			if (filiacao.getUsuario().getEmail().equals(email)) {
				filiacao.setProprietario(proprietario);
				return;
			}
		}
	}

	public List<Usuario> listaComuns() {
		List<Usuario> lista = new ArrayList<>();
		for (Filiacao filiacao : filiacoes) {
			if (!filiacao.isProprietario()) {
				lista.add(filiacao.getUsuario());
			}
		}
		return lista;
	}

	public List<Usuario> listaProprietarios() {
		List<Usuario> lista = new ArrayList<>();
		for (Filiacao filiacao : filiacoes) {
			if (filiacao.isProprietario()) {
				lista.add(filiacao.getUsuario());
			}
		}
		return lista;
	}

	public List<Usuario> listaTodos() {
		List<Usuario> lista = new ArrayList<>();
		for (Filiacao filiacao : filiacoes) {
			lista.add(filiacao.getUsuario());
		}
		return lista;
	}
}
