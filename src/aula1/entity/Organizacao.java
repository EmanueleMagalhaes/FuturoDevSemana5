package aula1.entity;

import aula1.Interface.Pagamento;

import java.util.ArrayList;

public class Organizacao implements Pagamento {
// atributo
    private String nome;
    private ArrayList<Aluno> alunos;
    private ArrayList<Professor> professores;



    //construtor vazio
    public Organizacao() {
    }

    // construtor parametrizado

    public Organizacao(String nome, ArrayList<Aluno> alunos, ArrayList<Professor> professors) {
        this.nome = nome;
        this.alunos = alunos;
        this.professores = professores;
    }

    // get e Set (para fazer o encapisulamento)
    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
//METODOS
    //Metodo para gerar relatorio de TODOS os alunos cadastrados
    public String relatorioAlunos(){
        String resultado = "";
        for(Aluno aluno : alunos){
            resultado += aluno.toString() + "\n";
        }
        return resultado;
    }

    @Override
    public String realizarPagamento() {
        return "Pagamento efetuado com sucesso!";
    }

}
