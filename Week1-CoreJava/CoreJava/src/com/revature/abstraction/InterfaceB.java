package com.revature.abstraction;

public interface InterfaceB {

	void doSomething();
	
	default void doSomethingElse() {
		System.out.println("InterfaceB is doing something else");
	}
	
}
