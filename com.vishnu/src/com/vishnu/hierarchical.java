package com.vishnu;

class A {
	public void appa() {
		System.out.println("dad's rule");

	}
}

class B extends A {
	public void son() {
		System.out.println("son rule");
	}
}
class C extends A {
	public void daughter() {
		System.out.println("daughters rule");
	}
}
class D extends A {
	public void cousin () {
		System.out.println("cousin rule");
	}
}
public class hierarchical {

	public static void main(String[] args) {
		
		B objb = new B ();
		objb.appa();
		objb.son();
	
    
	   C objc = new C ();
	   objc.appa();
	   objc.daughter();
	
	  D objd = new D ();
	  objd.appa();
	  objd.cousin();
	}

}
