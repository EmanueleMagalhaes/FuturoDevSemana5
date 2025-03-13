package aula1.entity;

public class Aluno extends Usuario{
    private String nome;
    private String matricula;

    //CONSTRUTOR VAZIO
    public Aluno() {
    }

    //CONSTRUTOR PARAMETRIZADO
    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    // GET E SET
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    //metodo relatorio INDIVIDUAL do aluno (do objeto auluno

    public String exibirDetalhes(){
        return String.format("Nome do aluno: %s\nMatricula do aluno: %s", nome, matricula);

    }
}
