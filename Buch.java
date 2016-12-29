/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
//Class designed to store four attributes of two books and compare their authors.
public class Buch {
  public String titel, autor, isbn;
  public double preis; 
  //Two constructors for Buch class
        public Buch (String titel, String autor){
        this.autor=autor;
        this.titel=titel;
        }  
        public Buch (String titel, String autor, String isbn, double preis){
        this.autor=autor;
        this.titel=titel;
        this.isbn=isbn;
        this.preis=preis;
    }
    //The set and gets of all four attributes: author, titel, isbn and price
   public void setAutor(String autor) {
    this.autor=autor;
    }
    public String getAutor() {
    return this.autor;
    }
    public void setTitel(String titel){
    this.titel=titel;
    }
   public String getTitel(){
    return this.titel;
    }
        public void setIsbn(String isbn){
    this.isbn=isbn;
    }
   public String getIsbn(){
    return this.isbn;
    }
        public void setPreis(double preis){
    this.preis=preis;
    }
   public double getPreis(){
    return this.preis;
    }
   //Gives the the info of the book as a String, including currency symbol and complete double
   @Override
   public String toString() {
       double total = this.preis; 
       String total1 = String.format("%.2f",total);
       String total2 = " €" + String.valueOf(total1);
 String bookInfo=autor+titel+isbn+ total2;
    return bookInfo;
   }
   //Compares the authors of books a and b
   public boolean compareAutor(Buch a){
       if(a.autor.equals(autor)){
   return true;   
    }
    else{
     return false;       
    }
   }
}    

           
   
