package br.edu.insper.desagil.aps6.courier;

import java.util.List;

public class TrashBox extends TemporaryBox {
	public TrashBox(List<Email> emails) {
		super("TrashBox", emails);
	}
}
