import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.xml.validation.Validator;

public class Lab11Main {
public static Scanner scnr = new Scanner(System.in);
public static ArrayList<Movie> movieList = new ArrayList<>();
public static String selected;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//6 categories of movies
		System.out.println("Please enter a category.");
		selected = scnr.next();
		Movie hbo; 
		for (int i = 1; i < 101; i++) {
			hbo = MoviesIO.getMovie(i);
		if (hbo.toString().contains(selected.toLowerCase())) {
			System.out.println(hbo);
	
		}
		}
	}
}
	
	
	
	
	


