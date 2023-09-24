package ar.edu.unq.po2.tp3;

public class Expresiones {
	String a = "abc";
	String s = a;
	String t;
	
	public void test() {
		s.length(); //Devuelve 1
		t.length(); //Devuelve NullPointerException, debido a que t es un string no inicializado, por lo que es NULL
		//String p = 1 + a; //Devuelve "1abc"
		a.toUpperCase(); //Devuelve ABC
		"Libertad".indexOf("r"); //Devuelve 4
		"Universidad".lastIndexOf('i'); //Devuelve 7
		"Quilmes".substring(2,4); //Devuelve "il"
		(a.length() + a).startsWith("a"); //Devuelve False
		//boolean b = s == a; //Devuelve False
		a.substring(1,3).equals("bc"); //Devuelve True
	}
	
	/* TIPOS PRIMITIVOS
	 * 1. ¿Qué son los tipos primitivos?. Son los datos de un lenguaje de programación que vienen por defecto, o sea, los no referenciados
	 * 2. ¿Cuál es la diferencia entre un int y un Integer?. int es un tipo primitivo de Java, Integer se lo conoce como un wrapper de int, en
	 * si es un tipo objeto
	 * 3.¿Si se define una variable de instancia de tipo int cual sería su valor predeterminado? ¿Y si se define una de tipo Integer?
	 * En el int es 0, en el Integer es null
	 * 4.Ahora en lugar de definir una variable de instancia se define una variable de método. Es el mismo resultado
	 * 
	 
	 * JERARQUIA DE PAQUETES
	 * Los paquetes se ordenan de la siguiente forma.
	 * (package) model
	 * 			 |_____model.gui
	 * 			 |     |_____Clase1.java
	 * 			 |     |_____Clase1.class
	 * 			 |
	 * 			 |_____model.stack
	 * 				   |_____Clase2.java
	 * 				   |_____Clase2.class
	 * 
	 * Si existe una relación directa. Cuando se compila un archivo .java, en la misma carpeta donde este se encuentra, se genera un archivo de tipo
	 * .class (el ejecutable), el porque de que los .class estén en la misma carpeta es importante porque Java utiliza la estructura de paquetes 
	 * para resolver las dependencias de clases y para encontrar las clases durante la ejecución*/
}
