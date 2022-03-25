package br.edu.insper.desagil.aps6.cooktop;

import java.util.List;

public class ItemComposto {
	private List<Item> itens;
	private String codigo;
	private String nome;

	public ItemComposto(List<Item> itens, String codigo, String nome) {
		this.itens = itens;
		this.codigo = codigo;
		this.nome = nome;
	}

	public List<Item> getItens() {
		return itens;
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
