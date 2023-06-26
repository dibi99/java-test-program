package com.vishnu;
 
class makeup {
void makeup (String makeup) {
	System.out.println(makeup);
}
}

class highlighter {
	void highlighter (String makeup, String colour, String brand) {
		System.out.println(makeup + "-" + colour + "-" + brand + ".");
	}
}
public class polymorphism {

	public static void main(String[] args) {
//     makeup mkup = new makeup();
//     mkup.makeup("plum");
		highlighter hl = new highlighter ();
				hl.highlighter("shade", "pk, black, green", "mac,sugar,lakme");
	}

}
