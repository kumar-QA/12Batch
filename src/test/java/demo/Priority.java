package demo;

import org.testng.annotations.Test;

public class Priority {

	@Test(priority = 2)
	public void A() {
		System.out.println("A");
	}
	@Test(priority = -1)
	public void B() {
		System.out.println("B");
	}
	@Test(priority = 0)
	public void C() {
		System.out.println("c");
	}
	@Test(priority = -3)
	public void D() {
		System.out.println("D");
	}
}
