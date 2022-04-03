package br.edu.insper.desagil.aps6.cooktop;

public class ItemSimples {
	private String codigo;
	private String nome;
	private int quantidade;

	public ItemSimples(String codigo, String nome, int quantidade) {
		this.codigo = codigo;
		this.nome = nome;
		this.quantidade = quantidade;
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

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
