package tesztelos;

import java.util.Scanner;

public class Password {
	
	public static void main(String args[]){ 
		@SuppressWarnings("resource")
		Scanner login = new Scanner(System.in); 
		String idInput;
		System.out.print("Felhasználónév: "); 
		idInput = login.nextLine(); 
		String passwordInput; 
		System.out.print("Jelszó: "); 
		passwordInput = login.nextLine(); 


		if (idInput.equals("David") && (passwordInput.equals("qawsed"))){ 

		System.out.println("Belépés..."); 

		}else{
		System.out.println("Hibás Felhasználónév vagy Jelszó"); 


		}
}
}
//windov builder, listás keresés id és jelszóra 
//https://www.webotlet.hu/?p=775                  // Arraylist használata