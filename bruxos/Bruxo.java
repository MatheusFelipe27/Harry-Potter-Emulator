package bruxos;

public abstract class Bruxo {
	
	private String nome;
	private String sobrenome;
	private String caracVarinha;
	private String animago;
	private boolean prisioneiro;
	private int idade;
	
	public Bruxo(String nome, String sobrenome, String caracVarinha, String animago, boolean prisioneiro, int idade) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.caracVarinha = caracVarinha;
		this.animago = animago;
		this.prisioneiro = prisioneiro;
		this.idade = idade;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getSobrenome() {
		return this.sobrenome;
	}
	
	public String getCaracVarinha() {
		return this.caracVarinha;
	}
	
	public String getAnimago() throws AnimagoNullException {
		if (this.animago != null)
			return this.animago;
		else
			throw new AnimagoNullException(this.nome, this.sobrenome);
	}
}
