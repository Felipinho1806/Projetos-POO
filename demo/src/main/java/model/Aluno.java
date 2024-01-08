package model;

import java.util.ArrayList;

import model.interfaces.Conclusao;

public class Aluno extends Pessoa implements Conclusao {
    private int matricula;
    private ArrayList<Apontamento> historicos = new ArrayList<Apontamento>();
    private Grade grade;

    public Aluno() {

    }

    public Aluno(String nome, String apelido, String numeroFiscal, int matricula, ArrayList<Apontamento> historicos, Grade grade) {
        super(nome, apelido, numeroFiscal);
        this.matricula = matricula;
        this.historicos = historicos;
        this.grade = grade;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public ArrayList<Apontamento> getHistoricos() {
        return historicos;
    }

    public void setHistoricos(ArrayList<Apontamento> historicos) {
        this.historicos = historicos;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
    
    public void imprimirHistorico() {
        System.out.println("Grade: ");
        this.grade.imprimirGrade();
        System.out.println("Historico: ");
        for(Apontamento historico : historicos) {
            historico.imprimirRegistro();
        }
    }

    @Override public void imprimirPessoa() {
        System.out.println("Aluno -> Nome: " + getNome() + "| Apelido: " + getApelido() + "| Numero fiscal: " + getNumeroFiscal() + "| Matricula: " + getMatricula());
    }

    @Override public boolean estaIntegralizado() {
        if(this.grade.getDisciplinas().size() > this.historicos.size()) {
            return false;
        }

        int contador = 0;
        for(Apontamento apontamento : this.historicos) {
            for(Disciplina disciplina : this.grade.getDisciplinas()) {
                if(disciplina.getNome() == apontamento.getDisciplina().getNome()) {
                    contador++;     
                }
            }
        }   
        if(contador >= this.getGrade().getDisciplinas().size()) {
            return true;
        } 
        return false;
    }

    @Override public ArrayList<Disciplina> getDisciplinasFaltantes() {
        ArrayList<Disciplina> disciplinasFaltantes = new ArrayList<Disciplina>();

        for(Disciplina disciplinas : this.grade.getDisciplinas()) {
            boolean fez = false;

            for(Apontamento apontamentos : this.historicos) {
                if(apontamentos.getDisciplina().getNome() == disciplinas.getNome()) {
                    fez = true;
                }
            }

            if(!fez) {
                disciplinasFaltantes.add(disciplinas);
            }
        }

        return disciplinasFaltantes;
    }

}
