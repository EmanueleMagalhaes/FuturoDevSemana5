package aula1.entity;

import java.util.ArrayList;

public class Organizacao {
// atributo
    private String nome;
    private ArrayList<Aluno> alunos;



    //construtor vazio
    public Organizacao() {
    }

    // construtor parametrizado

    public Organizacao(String nome, ArrayList<Aluno> alunos) {
        this.nome = nome;
        this.alunos = alunos;
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
            resultado += aluno.exibirDetalhes() + "\n";
        }
        return resultado;
    }

}
