package Composicao.SalarioFuncionario;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalhador {

    private String nome;
    private double salario;
    private CargoFuncionario level;

    private Departamento departamento;
    private List<ContratoHoras> contratos = new ArrayList<>();

    public Trabalhador() {
    }

    public Trabalhador(String nome, double salario, CargoFuncionario level, Departamento departamento) {
        this.nome = nome;
        this.salario = salario;
        this.level = level;
        this.departamento = departamento;
    }

    // ... getters e setters permanecem os mesmos ...

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public CargoFuncionario getLevel() {
        return level;
    }

    public void setLevel(CargoFuncionario level) {
        this.level = level;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<ContratoHoras> getContratos() {
        return contratos;
    }


    public void adicionarContrato(ContratoHoras contrato) {
        contratos.add(contrato);
    }

    public void removerContrato(ContratoHoras contrato) {
        contratos.remove(contrato);
    }

    public double inCome(int ano, int mes) {
        double soma = salario;
        Calendar calendar = Calendar.getInstance();
        for (ContratoHoras contrato : contratos) {

            calendar.setTime(contrato.getData());
            int contrato_ano = calendar.get(Calendar.YEAR);
            int contrato_mes = 1 + calendar.get(Calendar.MONTH);

            if (ano == contrato_ano && mes == contrato_mes) {
                soma += contrato.valorTotal();
            }
        }
        return soma;
    }
}