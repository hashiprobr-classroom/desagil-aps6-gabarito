package br.edu.insper.desagil.aps6.equipes;

public class Filiacao {
	private Usuario usuario;
	private boolean proprietario;

	public Filiacao(Usuario usuario) {
		this.usuario = usuario;
		this.proprietario = false;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public boolean isProprietario() {
		return proprietario;
	}

	public void setProprietario(boolean proprietario) {
		this.proprietario = proprietario;
	}
}
