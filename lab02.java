package lab02;

import java.util.ArrayList;
import java.util.Random;
import java.util.List;


public class lab02 {
	static int students_count = 10;

	

	public static void main(String[] args) {
		ArrayList<String> students = new ArrayList<String>();
		
		for(int i = 0; i < students_count; i++) {
			students.add(getRandomStudentNumber());
		}
		
		List<String> lista = new ArrayList<String>();
		lista.add("Asia Kowalska");
 		lista.add("Basia Koniarska");
 		lista.add("Krzysiek Krawczyk");
 		lista.add("Mateusz Janowski");
 		lista.add("Wojtek Antkiewicz");
 		lista.add("Bogdan Bożydar");
 		lista.add("Stasiek Staszkowski");
 		lista.add("Włodzimierz Wojerski");
 		lista.add("Ania Anielska");
 		lista.add("Bożena Boczkowa");
 		
 				
		
		System.out.println("Students group have been filled.");
	
		for(int i = 0; i < students.size(); i++) 
		{
			Random aktyw = new Random();
			int aktywny = aktyw.nextInt(2);
			
			Random imie = new Random();
			int imiona = imie.nextInt(10);
			
			if(aktywny == 1)
			{
			System.out.println(lista.get(imiona) +" (" + students.get(i) + ") " );
			}
			
		}
	}

	protected static String getRandomStudentNumber() {
		Random rand = new Random();
		return String.valueOf(rand.nextInt(2000) + 38000);
	}

}
	
