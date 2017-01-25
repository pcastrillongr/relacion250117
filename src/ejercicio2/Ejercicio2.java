package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	final static float pi=(float) Math.PI;
	
	public static void main(String[] args) {

		float radio=leeradio();
		float longitud=longitudcirculo(radio);
		float area=areacirculo(radio);
		
		System.out.println("La longitud del circulo es:"+longitud);
		System.out.println("El area del circulo es:"+area);
	}
	
	public static float leeradio(){
		Scanner aux=new Scanner(System.in);
		String valor="";
		float radiocirculo=0;
		boolean esnumero=false;
		
		
		do{
			System.out.println("Introduzca el radio del circulo:");
			valor=aux.nextLine();
			try
			{
				radiocirculo=Float.parseFloat(valor);
				esnumero=true;
			}catch(Exception e)
			{
				esnumero=false;
				System.out.println("No has introducido un numero");
				
			}
			if(radiocirculo<0)
			{
				System.out.println("El radio no puede ser menor que cero");
			}
			}while(esnumero==false || radiocirculo<0);
		
		return radiocirculo;
		
	}
	
	public static float longitudcirculo(float radio){
		
		
		
		float longitudcirculo=2*pi*radio;
		
		return longitudcirculo;
	}
	
	public static float areacirculo(float radio){
		
		float areacirculo=pi*radio*radio;
		return areacirculo;
	}

}
