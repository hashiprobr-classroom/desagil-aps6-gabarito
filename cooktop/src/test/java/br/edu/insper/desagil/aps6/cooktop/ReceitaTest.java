package br.edu.insper.desagil.aps6.cooktop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class ReceitaTest {
	@Test
	void test() {
		ItemSimples a = new ItemSimples("a", "A", 1);

		ItemSimples b = new ItemSimples("b", "B", 2);

		ItemSimples c = new ItemSimples("c", "C", 3);

		ItemSimples d = new ItemSimples("d", "D", 4);

		List<ItemSimples> itens = new ArrayList<>();
		itens.add(c);
		itens.add(d);
		ItemComposto cd = new ItemComposto(itens, "cd", "CD");

		List<Item> ingredientes = new ArrayList<>();
		ingredientes.add(a);
		ingredientes.add(b);
		ingredientes.add(cd);

		Receita receita = new Receita(ingredientes);
		receita.retira();

		assertEquals(0, a.getQuantidade());
		assertEquals(1, b.getQuantidade());
		assertEquals(2, c.getQuantidade());
		assertEquals(3, d.getQuantidade());
	}
}
