
public class Pessoa implements Tributavel{
	private String nome;
	private double salario;
	
	public Pessoa(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public double calcularTributos() {
		return getSalario()*0.11;
	}
	
	
}
