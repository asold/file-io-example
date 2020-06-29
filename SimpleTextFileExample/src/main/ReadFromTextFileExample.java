package main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;
//HW
// 1.Reads from file
//2. Write to file: fname, lname, age << de la tastatura
//clase: FileWriter + File >> salvati in fisier
public class ReadFromTextFileExample {

	public static void main(String[] args) {
		//Lucrul cu sistem de fisiere!!! File(clasa)
		File file = new File("data/person.txt");
		// vei introduce date in fisier
		
		try { 
			
            // Open given file in append mode. 
            BufferedWriter out = new BufferedWriter(new FileWriter("data/person.txt", true)); 
            	out.write("Ion ");
                out.write("Costache ");
                out.write(new Integer(46).toString());
                out.write("\r\n");
                out.close(); 
        } 
        catch (IOException e) { 
            System.out.println("Error"); 
        } 
		//vei scana din fisierul indicat
		
		try {
			Scanner in = new Scanner(file);
			String fname, lname;
			int age;
			
			fname = in.next();
			lname = in.next();
			age = in.nextInt();
			
			System.out.println(fname + " " + lname + " "+ age);
			
			
			} 
			
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
		

}
