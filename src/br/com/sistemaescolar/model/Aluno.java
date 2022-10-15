package br.com.sistemaescolar.model;

import br.com.sistemaescolar.MediaCalculavel;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa implements MediaCalculavel {
    private List<Double> notas;

    public Aluno(int id, String nome, List<Double> notas) {
        super(id, nome);
        this.notas = notas;
    }

    public Aluno(int id, String nome) {
        super(id, nome);
        this.notas = new ArrayList<>();
    }

    @Override
    public double getMedia() {
        if (this.notas.size() == 0) {
            System.err.println(this.getNome() + " não tem nenhuma nota cadastrada");
            return 0;
        }

        double somaDasNotas = 0;

        for (Double nota : this.notas) {
            somaDasNotas += nota;
        }

        return somaDasNotas / this.notas.size();
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "notas=" + notas +
                "} " + super.toString();
    }
}
