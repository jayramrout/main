package com.h2kinfosys.java.abstractinterfaceExample.reliance;

import com.h2kinfosys.java.abstractinterfaceExample.Employee;
import com.h2kinfosys.java.abstractinterfaceExample.interfaces.Jumpable;
import com.h2kinfosys.java.abstractinterfaceExample.interfaces.Singable;

public abstract class RelianceEmployee extends Employee implements Jumpable , Singable {

	public RelianceEmployee(String name, int age, int ssn) {
		super(name, age, ssn);
	}

	public void printPersonBehaviour(){
		System.out.println("I am from ABC Employee" );
	}

	@Override
	public void employeeBehaviour() {
		System.out.println("I am from ABC Employee AND i work on JAVA");
	}
	
	public void employeeBehaviour(String name) {
		System.out.println("I am from ABC Employee AND i work on JAVA");
	}
	/*@Override
	public void employmentType() {
		System.out.println("I am Reliance EMPLOYEE");
	}*/
	
	public abstract void relianceShare();
	
}