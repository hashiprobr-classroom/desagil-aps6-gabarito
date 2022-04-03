package br.edu.insper.desagil.aps6.cooktop;

import java.util.List;

public class Receita {
	private List<Object> ingredientes;

	public Receita(List<Object> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public void retira() {
		for (Object ingrediente : ingredientes) {
			if (ingrediente instanceof ItemSimples) {
				ItemSimples item = (ItemSimples) ingrediente;
				int quantidade = item.getQuantidade();
				item.setQuantidade(quantidade - 1);
			} else {
				ItemComposto itemComposto = (ItemComposto) ingrediente;
				for (ItemSimples item : itemComposto.getItens()) {
					int quantidade = item.getQuantidade();
					item.setQuantidade(quantidade - 1);
				}
			}
		}
	}
}
