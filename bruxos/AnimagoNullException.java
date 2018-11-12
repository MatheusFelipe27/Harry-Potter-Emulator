package bruxos;

public class AnimagoNullException extends Exception {
	
	private String nome;
	private String sobrenome;
	
	public AnimagoNullException(String nome, String sobrenome) {
		super(nome + " " + sobrenome + " não é um animago!");
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getSobrenome() {
		return this.sobrenome;
	}
}
