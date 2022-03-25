package br.edu.insper.desagil.aps6.courier;

import java.util.List;

public class InBox extends PermanentBox {
	public InBox(List<Email> emails) {
		super("InBox", emails);
	}
}
