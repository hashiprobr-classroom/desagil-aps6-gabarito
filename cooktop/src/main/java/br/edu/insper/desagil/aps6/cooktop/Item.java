package br.edu.insper.desagil.aps6.cooktop;

public abstract class Item {
	private String codigo;
	private String nome;

	public Item(String codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
