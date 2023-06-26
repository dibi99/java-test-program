//package com.vishnu;


    class dog{
    	void dg() {
    		System.out.println("dog method");
    	}
    } 
    
    class beagle extends dog {
    	void begle( ) {
    		System.out.println("beagle method");
    	}
    }
    
    class puppy extends beagle{
    	void pupy() {
    		System.out.println("puppy method");
    	}
    }
    
    class siz extends dog{
    	void pupy() {
    		System.out.println("siz method");
    	}
    }
    
    
public class Inheritance {

	public static void main(String[] args) {
//	 dog anime = new dog();
//		 anime.dg();
		 
//		 beagle cute = new beagle();
//		 cute.begle();
//		 anime.dg();
		puppy pupp = new puppy();
		pupp.dg();
		pupp.begle();
		pupp.pupy();	
		siz pupp2 = new siz();
		dog dog1 = (dog) pupp;
		dog1.dg();
		puppy p1 = (puppy) dog1;
		dog dog2 = (dog) pupp2;
		dog1.dg();
	}		 
}	
	
		  
		 

	


