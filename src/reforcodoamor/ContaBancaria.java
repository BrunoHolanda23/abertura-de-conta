package reforcodoamor;

public class ContaBancaria {
	public int idConta;
	public String agencia;
	public String numeroConta;
	public String tipo;
	public double saldo = 0;
	public double limiteCredito;
	
	public void registraDeposito(double valor) {
		this.saldo += valor;
		System.out.println("Saldo: " + this.saldo);
	}
	
	public boolean registraSaque(double valor) {
		if (valor > this.saldo) {
			double disponivel = this.saldo + this.limiteCredito;
			if(this.tipo == "E" && valor <= disponivel){
				this.saldo -= valor;
				System.out.println("Saldo: " + this.saldo);
				return true;
			}
			else {
				System.out.println("Saldo insuficiente\nSaldo atual: " + this.saldo);
				return false;
			}
		}
		this.saldo -= valor;
		System.out.println("Saldo: " + this.saldo);
		return true;
	}
	
	public void exibeDados() {
		System.out.println("Agência: " + this.agencia);
		System.out.println("Nº da conta: " + this.numeroConta);
		System.out.println("Tipo: " + this.tipo);
		System.out.println("Saldo: " + this.saldo);
		System.out.println("Limite de crédito: " + this.limiteCredito);
	}
}
