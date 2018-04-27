package tesztelos;

import java.util.ArrayList;
import java.util.Scanner;

public class listateszt {
	
	private static ArrayList<String> nevek = new ArrayList<String>();
	private static ArrayList<String> jelszo = new ArrayList<String>();
	
	public static void main(String[] args) {
		nevek.add("David");
		nevek.add("Gabor");
		nevek.add("Dezso");
		jelszo.add("qwert");
		jelszo.add("asdfg");
		jelszo.add("íyxcv");
	
	
	@SuppressWarnings("resource")
	Scanner login = new Scanner(System.in); 
	String idInput;
	System.out.print("Felhasználónév: "); 
	idInput = login.nextLine(); 
	String passwordInput; 
	System.out.print("Jelszó: "); 
	passwordInput = login.nextLine(); 
	
	int b=0;
	for(int i = 0; i < nevek.size(); i++) {
		if (idInput.equals(nevek.get(i)) && (passwordInput.equals(jelszo.get(i)))){ 
			System.out.println("Belépés...");
			b=1;
		}
	}
	if(b==0) System.out.println("Hibás Felhasználónév vagy Jelszó");
	}
}
