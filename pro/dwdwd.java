package src;

import java.util.Scanner;

/**
 * clase de prueba
 * @author PC
 *
 */

public class dwdwd {

	 public static void main(String[] args) {

		 boolean seguir = true;
		 
		    Scanner teclado = new Scanner(System.in);
		    int alto = 0, ancho = 0, area = 0, perimetro = 0;
		    
		    System.out.print("Programa que calcula el area y perimetro de un rectangulo.");
		   
		    
		    
		    while(seguir) {
		        System.out.println("introduce el alto");
		    alto = teclado.nextInt();
		    
		    System.out.println("introduce el ancho");
		    ancho = teclado.nextInt();
		    	 
		    
		 
		    if (alto>=0) {
		    	
		    seguir = false;
		    }
		   
		    }
		   
		    
		    area = 2*alto+2*ancho;
		    perimetro = alto * ancho;
		   
		      System.out.println("el area del rectangulo es: "+area);
		      System.out.println("el perimetro del rectangulo es: "+perimetro);

		    
		    
		  
		  		    
		    
		    
		    }
		}	
	

