package br.edu.insper.desagil.aps6.courier;

import java.util.List;

public abstract class Box {
	private String name;
	private List<Email> emails;

	public Box(String name, List<Email> emails) {
		this.name = name;
		this.emails = emails;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Email> getEmails() {
		return emails;
	}
}
