package com.designpattern.observateur;

public class BinaryObserver extends Observer {
	private static final String MESSAGE_BINARY = "Binary String : ";

	public BinaryObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println(MESSAGE_BINARY +Integer.toBinaryString(subject.getState()));

	}
}
