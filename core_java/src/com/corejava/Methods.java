package com.corejava;

public class Methods {
      void method1() {
    	  System.out.println("method1"); 
    	 Methods m=new Methods();
    	m.method2();
    	
 }

     void method2() {
    	 System.out.println("method2");
    	 method3();
    	 
     }
     void method3() {
    	 System.out.println("method3 ");
    	 method4();
     }
     void method4() {
    	 System.out.println("method4");
    	 method5();
     }
       void method5() {
    	 System.out.println("method5");
    	 method6();
     }
     void method6() {
    	 System.out.println("method6");
    	 method7();
     }
     void method7() {
    	 System.out.println("method7");
    	 method8();
     }
      void method8() {
    	 System.out.println("method8");
    	 method9();
     }
     void method9() {
    	 System.out.println("method9");
    
     }
	public static void main(String[] args) {
	Methods m1=new Methods();
	m1.method1();
	}

}
