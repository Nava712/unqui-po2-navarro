package ar.edu.unq.po2.tp3;

public class Expresiones {
	String a = "abc";
	String s = a;
	String t;
	
	public void test() {
		s.length(); //Devuelve 1
		t.length(); //Devuelve NullPointerException, debido a que t es un string no inicializado, por lo que es NULL
		String p = 1 + a; //Devuelve "1abc"
		a.toUpperCase(); //Devuelve ABC
		"Libertad".indexOf("r"); //Devuelve 4
		"Universidad".lastIndexOf('i'); //Devuelve 7
		"Quilmes".substring(2,4); //Devuelve "il"
		(a.length() + a).startsWith("a"); //Devuelve False
		boolean b = s == a; //Devuelve False
		a.substring(1,3).equals("bc"); //Devuelve True
	}
}
