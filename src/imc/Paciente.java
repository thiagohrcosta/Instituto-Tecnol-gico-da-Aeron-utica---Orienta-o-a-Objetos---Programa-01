package imc;

// -----------------------------------------------------------------------------------------
// Atividade 01 Orientada a Objetos do Instituto de Tecnologia da Aeronáutica
// Implemente no Eclipse uma classe chamada Paciente que possui um construtor 
// que recebe o seu peso em quilos e sua altura em metros, ambos utilizando o 
// tipo double. Crie um método chamado calcularIMC() que calcula o índice de 
// Massa Corporal de acordo com a fórmula IMC = peso (quilos) / (altura * altura (metros)). 
// Crie também um método chamado diagnostico() que utiliza o método calcularIMC() e retorna
// uma String de acordo com as seguintes faixas de valor:
// ----------------------------------------------------------------------------------------

public class Paciente {

    private double peso;
    private double altura;
    public double imc;
    

    public Paciente(double peso, double altura) {
    	this.peso = peso;
    	this.altura = altura;
    }
    
	public double calcularIMC() {
		return this.imc = peso / (altura * altura);
	}
	

	public String diagnostico() {
		double resultado = calcularIMC();
		String diagnostico = null;
		
		if(resultado < 16) {
			// IMC abaixo de 16
			diagnostico = "Baixo peso muito grave";
		}
			else if (resultado >= 16 && resultado <= 16.99) {
				// IMC acima de 16, mas abaixo de 16,99
				diagnostico = "Baixo peso grave";
			} 
			else if (resultado >= 17 && resultado <= 18.49) {
				//IMC acima de 17, mas abaixo de 18.49
				diagnostico = "Baixo peso";
			}
			else if (resultado >= 18.50 && resultado <= 24.99) {
				// IMC acima de 18.50, mas abaixo de 24.99
				diagnostico = "Peso normal";
			}
			else if (resultado >= 25 && resultado <= 29.99) {
				// IMC acima de 25, mas abaixo de 29.99
				diagnostico = "Sobrepeso";
			}
			else if (resultado >=30 && resultado <= 34.99) {
				// IMC acima de 30, mas abaixo de 34.99
				diagnostico = "Obesidade Grau I";
			}
			else if (resultado  >= 35 && resultado <= 39.99) {
				// IMC acima de 35, mas abaixo de 39.99
				diagnostico = "Obesidade Grau II";
			}
			else if (resultado >= 40) {
				// IMC acima de 40
				diagnostico = "Obesidade Grau III (Obesidade mórbida)";
			}
		
			return diagnostico;
				
		}
	}

