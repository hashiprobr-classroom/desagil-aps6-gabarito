package br.edu.insper.desagil.aps6.cooktop;

import java.util.List;

public class ItemComposto extends Item {
	private List<ItemSimples> itens;

	public ItemComposto(List<ItemSimples> itens, String codigo, String nome) {
		super(codigo, nome);
		this.itens = itens;
	}

	public List<ItemSimples> getItens() {
		return itens;
	}

	@Override
	public void decrementa() {
		for (ItemSimples item : itens) {
			item.decrementa();
		}
	}
}
