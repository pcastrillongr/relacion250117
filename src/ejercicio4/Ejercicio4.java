package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		double cateto1=longitudcateto1();
		double cateto2=longitudcateto2();
		double hipotenusa=calculohipotenusa(cateto1,cateto2);
		
		System.out.println("La longitud de la hipotenusa es:" + hipotenusa);
	}
	
	public static double longitudcateto1(){
			Scanner aux=new Scanner(System.in);
			String valor="";
			boolean esnumero=false;
			double lcateto = 0;
			
		do{
			System.out.println("Introduzca la longitud del primer cateto:");
			valor=aux.nextLine();
			try{
				lcateto=Double.parseDouble(valor);
				esnumero=true;
			}catch(Exception e){
				esnumero=false;
				System.out.println("No has introducido un numero");
				
			}
			if(lcateto<0){
				System.out.println("No puede ser menor que cero:");
			}
		}while(esnumero==false||lcateto<0);
		
		return lcateto;
			
		
	}
	public static double longitudcateto2(){
		Scanner aux=new Scanner(System.in);
		String valor="";
		boolean esnumero=false;
		double lcateto = 0;
		
	do{
		System.out.println("Introduzca la longitud del segundo cateto:");
		valor=aux.nextLine();
		try{
			lcateto=Double.parseDouble(valor);
			esnumero=true;
		}catch(Exception e){
			esnumero=false;
			System.out.println("No has introducido un numero");
			
		}
		if(lcateto<0){
			System.out.println("No puede ser menor que cero:");
		}
	}while(esnumero==false||lcateto<0);
	
	return lcateto;
	}
	
	public static double calculohipotenusa(double cateto1,double cateto2){
		
		
		return Math.hypot(cateto1, cateto2);
	}
		

}
