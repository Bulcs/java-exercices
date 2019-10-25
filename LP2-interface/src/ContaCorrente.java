
public class ContaCorrente implements Tributavel{
	private String agencia;
	private String conta;
	private double saldo;
	
	
	
	public ContaCorrente(String agencia, String conta, double saldo) {
		this.agencia = agencia;
		this.conta = conta;
		this.saldo = saldo;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getConta() {
		return conta;
	}
	public void setConta(String conta) {
		this.conta = conta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void sacar(double valor) {
		this.saldo-=valor;
	}
	public void depositar(double valor) {
		this.saldo+=valor;
	}
	public void transfere(double valor, ContaCorrente cc){
		this.saldo-=valor;
		cc.depositar(valor);
	}
	@Override
	public double calcularTributos() {
		return getSaldo()*0.055;
	}
}
