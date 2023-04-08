package reforcodoamor;

public class ContaCorrente {
	public static void main(String[] args) {
		ContaBancaria contaCorrenteEspecial = new ContaBancaria();
		contaCorrenteEspecial.idConta = 1;
		contaCorrenteEspecial.agencia = "123";
		contaCorrenteEspecial.numeroConta = "321";
		contaCorrenteEspecial.limiteCredito = 2000;
		contaCorrenteEspecial.tipo = "E";
		
		contaCorrenteEspecial.exibeDados();
		
		contaCorrenteEspecial.registraDeposito(1000);
		contaCorrenteEspecial.registraDeposito(500);
		
		contaCorrenteEspecial.registraSaque(1000);
		contaCorrenteEspecial.registraSaque(2000);
		contaCorrenteEspecial.registraSaque(800);
		
		System.out.println("\n#################################################\n");
		
		ContaBancaria contaCorrenteNormal = new ContaBancaria();
		contaCorrenteNormal.idConta = 2;
		contaCorrenteNormal.agencia = "123";
		contaCorrenteNormal.numeroConta = "456";
		contaCorrenteNormal.tipo = "N";
		
		contaCorrenteNormal.exibeDados();
		
		contaCorrenteNormal.registraDeposito(1000);
		contaCorrenteNormal.registraDeposito(2000);
		
		contaCorrenteNormal.registraSaque(2000);
		contaCorrenteNormal.registraSaque(3000);
	}
	
}
