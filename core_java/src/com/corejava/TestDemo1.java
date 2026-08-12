package com.corejava;

public class TestDemo1 {
	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("main method started !");
		System.out.println(Class.forName("java.lang.String"));
		System.out.println(Class.forName("java.lang.System"));

		System.out.println(Class.forName("com.corejava.Count"));

		System.out.println(Class.forName("com.corejava.Wellcome"));
		System.out.println(Class.forName("com.mysql.cj.jdbc.Driver"));
	}
}
