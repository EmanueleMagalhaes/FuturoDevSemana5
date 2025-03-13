package aula1;

import aula1.entity.Aluno;
import aula1.entity.Organizacao;
import aula1.entity.Professor;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // objeto organização
        Organizacao organizacao = new Organizacao();

        Aluno aluno01 = new Aluno("Carlos", "101010");
        Aluno aluno02 = new Aluno("Ana", "101222");

        ArrayList<Aluno> alunos = new ArrayList<>();
        alunos.add(aluno01);
        alunos.add(aluno02);

        organizacao.setAlunos(alunos);

        System.out.println(organizacao.relatorioAlunos());

        Professor pf = new Professor("Davi Saldanha", "10020", "dsaldanha", "123d", 2000);
        System.out.println(pf.toString());

    }
}
