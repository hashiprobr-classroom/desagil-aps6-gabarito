package br.edu.insper.desagil.aps6.courier;

import java.util.ArrayList;
import java.util.List;

public class Client {
	private Email draft;
	private List<Box> boxes;

	public Client() {
		this.draft = null;
		this.boxes = new ArrayList<>();
	}

	public Email getDraft() {
		return draft;
	}

	public List<Box> getBoxes() {
		return boxes;
	}

	public void compose() {
	}
}
