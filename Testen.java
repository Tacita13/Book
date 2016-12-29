/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

public class Testen {
//To test if Buch class works
    public static void main(String[] args) {

 //Book a and its four attributes    
        Buch a = new Buch("\"Crónica de una muerte anunciada\"", "-- Gabriel García Márquez, ");
        a.setIsbn(" ISBN:13264 ");
        a.setPreis(20.00);
        System.out.println("\n" + a.toString());
        
 //Book b and its four attributes  
        Buch b = new Buch("\"Divina Commedia\"", "-- Dante Alighieri, ", " ISBN:80502 ", 13.99);
        System.out.println("\n" + b.toString());
       
 //Gives result of comparison: different or same authors       
        if(a.compareAutor(b))
            System.out.println("\n" + a.getTitel() + " and " + b.getTitel() + " have the same author.");
        else
            System.out.println("\n" + a.getTitel() + " and " + b.getTitel() + " have different authors.");
        
 // Two options to exchange all atributes of the Buch objects a and b 
    System.out.println("_________________________");
    System.out.println("a and b exchanged: ");
//Exchanges all four attributes of a and b at once
    String exA =b.toString();
    String exB =a.toString();
    
//Exchanges all for attributes of a and b individually
   String exAutorA =b.getAutor();
   String exAutorB =a.getAutor();
   String exTitelA =b.getTitel();
   String exTitelB =a.getTitel();
   String exIsbnA =b.getIsbn();
   String exIsbnB =a.getIsbn();
   Double exPreisA =b.getPreis();
   Double exPreisB =a.getPreis();
    
//A print to proof the individual exchange worked
    System.out.println(exAutorA + exTitelA + exIsbnA + exPreisA);
    System.out.println(exAutorB + exTitelB + exIsbnB + exPreisB);
 

    }
    
}  
        

