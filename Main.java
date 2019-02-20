/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5tpo_de_datos;

/**
 *
 * @author BRAYANHERNANDEZ
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        byte entero = 12; //128 a 128 8 bits
         short entero2 =12456;// 16 bits
         int entero3=133;//32 bits
         long largo=223432453; //64 bits
         float flotante=23.456f;//Se tiene que ponerle f al ultimo ara que identfique quees un numero flotante
         double doble=2.243252;//NUmero doble para mayores digitos
         char caracter= 'a'; //caracteres
         boolean decision=true;
         System.out.println("Entero" +entero +"\nentero2" + entero2);
         System.out.println("entero"+entero3+ "\nLong"+ largo);
         System.out.println("\nFlotante "+ flotante+"\nDouble"+ doble);
         System.out.println("Caracter es : "+caracter);
         System.out.println("\nDecision  "+ decision);
         
    }
    
}
