package br.edu.insper.desagil.aps6.courier;

import java.util.List;

public class OutBox extends PermanentBox {
	public OutBox(List<Email> emails) {
		super("OutBox", emails);
	}
}
