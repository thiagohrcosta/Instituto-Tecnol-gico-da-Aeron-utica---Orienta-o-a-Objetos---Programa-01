package imc;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println(" Opera��o realizada com sucesso. Analise os resultados abaixo:");
		System.out.println(" ---------------------------------------------------------------------------- ");
		
		Paciente p1 = new Paciente(90, 1.60);
		System.out.println("O Resultado do IMC do Paciante P1 �: " + p1.calcularIMC());
		System.out.println("Diagn�stico do Paciente P1: " + p1.diagnostico());
		
		System.out.println(" ---------------------------------------------------------------------------- ");
		
		Paciente p2 = new Paciente (80, 1.80);
		System.out.println("O Resultado do IMC do Paciante P2 �: " + p2.calcularIMC());
		System.out.println("Diagn�tico do Paciente P2: " + p2.diagnostico());
		
		System.out.println(" ---------------------------------------------------------------------------- ");
		
		Paciente p3 = new Paciente (48, 1.56);
		System.out.println("O Resultado do IMC do Paciante P3 � " + p3.calcularIMC());
		System.out.println("Diagn�stico do Paciente P3: " + p3.diagnostico());
		
		System.out.println(" ---------------------------------------------------------------------------- ");	

	}

}
