package br.edu.insper.desagil.aps6.cooktop;

public class ItemSimples extends Item {
	private int quantidade;

	public ItemSimples(String codigo, String nome, int quantidade) {
		super(codigo, nome);
		this.quantidade = quantidade;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public void decrementa() {
		quantidade--;
	}
}
