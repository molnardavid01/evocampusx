package tesztelos;

import java.util.Scanner;

public class Password {
	
	public static void main(String args[]){ 
		@SuppressWarnings("resource")
		Scanner login = new Scanner(System.in); 
		String idInput;
		System.out.print("Felhaszn�l�n�v: "); 
		idInput = login.nextLine(); 
		String passwordInput; 
		System.out.print("Jelsz�: "); 
		passwordInput = login.nextLine(); 


		if (idInput.equals("David") && (passwordInput.equals("qawsed"))){ 

		System.out.println("Bel�p�s..."); 

		}else{
		System.out.println("Hib�s Felhaszn�l�n�v vagy Jelsz�"); 


		}
}
}
//windov builder, list�s keres�s id �s jelsz�ra 
//https://www.webotlet.hu/?p=775                  // Arraylist haszn�lata