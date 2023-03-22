public class Aluno {
  private String nome;
  private String email;
  private String curso;
  private String faculdade;

  public Aluno (String nome, String email, String curso, String faculdade) {
    this.nome = nome;
    this.email = email;
    this.curso = curso;
    this.faculdade = faculdade;
  }

  public String getNome() {
		return this.nome;
	}

  public String getEmail() {
		return this.email;
	}

  public String getCurso() {
		return this.curso;
	}

  public String getFaculdade() {
		return this.faculdade;
	}
}
