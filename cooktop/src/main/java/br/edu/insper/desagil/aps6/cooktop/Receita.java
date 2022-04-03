package br.edu.insper.desagil.aps6.cooktop;

import java.util.List;

public class Receita {
	private List<Item> ingredientes;

	public Receita(List<Item> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public void retira() {
		for (Item ingrediente : ingredientes) {
			ingrediente.decrementa();
		}
	}
}
