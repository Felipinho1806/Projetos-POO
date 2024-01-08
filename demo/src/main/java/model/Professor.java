package model;

public class Professor extends Pessoa {
    private int id;
    private double salario;
    private int contrato;

    public Professor() {

    }

    public Professor(int id, double salario, int contrato, String nome, String apelido, String numeroFiscal) {
        super(nome, apelido, numeroFiscal);
        this.id = id;
        this.salario = salario;
        this.contrato = contrato;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getContrato() {
        return contrato;
    }

    public void setContrato(int contrato) {
        this.contrato = contrato;
    }
 
    @Override public void imprimirPessoa() {
        System.out.println("Professor -> Nome: " + getNome() + "| Apelido: " + getApelido() + "| Numero fiscal: " + getNumeroFiscal() + "| Id: " + getId() + "| Salario: " + getSalario() + "| Contrato: " + getContrato()); 
    }

}
