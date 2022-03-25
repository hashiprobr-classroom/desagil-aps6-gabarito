package br.edu.insper.desagil.aps6.cooktop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class ReceitaTest {
	@Test
	void test() {
		Item a = new Item("a", "A", 1);

		Item b = new Item("b", "B", 2);

		Item c = new Item("c", "C", 3);

		Item d = new Item("d", "D", 4);

		List<Item> itens = new ArrayList<>();
		itens.add(c);
		itens.add(d);
		ItemComposto cd = new ItemComposto(itens, "cd", "CD");

		List<Object> ingredientes = new ArrayList<>();
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
