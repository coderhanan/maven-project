package com.nttdata.maven.Parent_Child_Objects;

public class ChildClass extends ParentClass {
	
	void child () {
		System.out.println("This is Child Class");
	}
	
	void childParent () {
		System.out.println("This Child-Parent Access");
	}

}
