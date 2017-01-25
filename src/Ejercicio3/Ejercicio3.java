package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		float kmh=velocidad();
		float ms=velocidad2(kmh);
		
		System.out.println(kmh+" km/h son "+ms+" metros/segundo");
	}
	public static float velocidad()
	{
		
		Scanner aux=new Scanner(System.in);
		String valor="";
		boolean esnumero=false;
		float velocidad=0;
		do{
		System.out.println("Introduzca los km/h a los que circula el vehiculo:");
		valor=aux.nextLine();
		try{
			velocidad=Float.parseFloat(valor);
			esnumero=true;
		}catch(Exception e){
			esnumero=false;
			System.out.println("No has introducido un numero");
		}
		if(velocidad<0){
			System.out.println("No puede ser menor que cero");
		}
		}while(esnumero==false||velocidad<0);
		
		return velocidad;
		
	}
	
	public static float velocidad2(float kmh){
		
		float mpors=(kmh*1000)/3600;
		return mpors;
	}

}
