package Disciplinas;

public class ListaEstudantes {

private Estudante estudante;
private ListaEstudantes proximo;


public ListaEstudantes() {
	this.estudante = "";
	this.proximo = new ListaEstudantes();
	
}

public void inserir(Estudante estudante) {
	if (this.estudante == ""){
		this.estudante = estudante;
		this.proximo = new ListaEstudantes();
	}
	else {
		this.proximo.inserir(estudante);
	}
	
}



public void remover (Estudante estudante) {
	if (this.estudante == estudante) {
		this.estudante = this.proximo.estudante;
		this.proximo = this.proximo.proximo;
	}
	else {
		this.proximo.remover(estudante);
	}
}


public Estudante checar(Estudante estudante) {
	if (this.estudante = estudante) {
		return estudante;
	}
	else if (this.estudante!= estudante) {
		return this.proximo.checar(estudante);
	}
	else return null;
}



public String toString() {
	String resposta = "" + this.estudante;
	if (this.proximo!=null) {
		if (this.proximo.proximo!= null)
			resposta = resposta + "\n" + this.proximo.toString();
	}
	else {
		return resposta;
	}
	return resposta;
} 





}


