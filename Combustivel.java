package exercicio;

import java.util.Scanner;

public class Combustivel {
	public static void main(String[] args) {
		double precodesc,valorpg;
		double alcool = 2.90;
		double gasolina = 3.30;
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual tipo de combustivel");
		String combustivel  = teclado.nextLine();
		System.out.println("Quantos Litros vc quer");
		double litros = teclado.nextDouble();
	
		
	if(combustivel.equalsIgnoreCase("alcool")){
			
			if(litros<=20){
			
				precodesc = 2.90-0.08;
				valorpg=litros*precodesc;
				System.out.print("Atencao vc ira pagar  reais"+valorpg);
			
			}else{ precodesc=2.90-0.14;
				  valorpg=litros*precodesc;
				  System.out.print("Atencao vc ira pagar  reais"+valorpg);
				  
			}
			}
	
	if(combustivel.equalsIgnoreCase("gasolina")){
				if(litros<=20) {
			 
				precodesc=3.30-0.132;
				valorpg=litros*precodesc;
				System.out.print("Atencao vc ira pagar  reais" + valorpg);
	}
			
			else{ precodesc=3.30-0.198;
				  valorpg=litros*precodesc;
				  System.out.print("Atencao vc ira pagar  reais"+ valorpg);
			}
	}
	}
}
	

	
