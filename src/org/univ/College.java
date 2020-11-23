package org.univ;

public class College extends University {
@Override
public void ug() {
	System.out.println("Overrided UG");
	super.ug();
}
@Override
	public void pg() {
		System.out.println("Overrided PG");
		//super.pg();
	}
public static void main(String[] args) {
	College c =new College();
	c.pg();
	c.ug();
}
}
