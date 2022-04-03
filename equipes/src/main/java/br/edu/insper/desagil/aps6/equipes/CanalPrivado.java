package br.edu.insper.desagil.aps6.equipes;

import java.util.ArrayList;
import java.util.List;

public class CanalPrivado extends Canal {
	private List<Usuario> membros;

	public CanalPrivado(Equipe equipe, String nome) {
		super(equipe, nome);
		this.membros = new ArrayList<>();
	}

	public List<Usuario> getMembros() {
		return membros;
	}

	public void adicionaMembro(Usuario usuario) {
		String email = usuario.getEmail();
		for (Usuario filiado : getEquipe().listaTodos()) {
			if (filiado.getEmail().equals(email)) {
				membros.add(usuario);
				return;
			}
		}
	}
}
