package com.vishnu;

   class one {
	   public void print_one() {
		   System.out.println(" on a sky");
	   }
   }
   class two extends one {
	   public void print_two() {
		   System.out.println("on a beach");
		   
		 }
   }
    class three extends two {
    	public void print_three() {
    		System.out.println("on a star");
    	}
    }
	  public class Hierarchical_inheritance {
		  public static void main(String[] args) {
		  
		  three g = new three();
		  g.print_three();
		  g.print_two();
		  g.print_one();    // single & multiple inheritance
	  }
	  }
	  
  
