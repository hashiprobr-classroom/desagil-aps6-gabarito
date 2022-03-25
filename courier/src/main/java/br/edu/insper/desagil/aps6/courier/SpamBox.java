package br.edu.insper.desagil.aps6.courier;

import java.util.List;

public class SpamBox extends TemporaryBox {
	public SpamBox(List<Email> emails) {
		super("SpamBox", emails);
	}
}
