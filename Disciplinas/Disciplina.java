package Disciplinas;

public class Disciplina {

	
private String nome;
private Professor professor;
private ListaEstudantes estudante;

public Disciplina( String nome, Professor professor) {
	
}



public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public Professor getProfessor() {
	return professor;
}

public ListaEstudantes getEstudantes() throws ListaVaziaException {
	 if (!estudante.toString().equals("")) {
		 throw new ListaVaziaException()
	 } else {
		 return estudante; 
	 }
	
}

public void setEstudantes(ListaEstudantes estudantes) {
	this.estudante = estudantes;
}

}







