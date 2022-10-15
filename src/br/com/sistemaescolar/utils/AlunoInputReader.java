package br.com.sistemaescolar.utils;

import br.com.sistemaescolar.model.Aluno;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class AlunoInputReader {
    public static Aluno createNewAluno() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return new Aluno(getAlunoId(reader), getAlunoNome(reader), getAlunoNotas(reader));
    }

    private static String getAlunoNome(BufferedReader reader) throws IOException {
        System.out.print("Digite o nome do aluno: ");
        return reader.readLine();
    }

    private static int getAlunoId(BufferedReader reader) throws IOException {
        System.out.print("Digite o id do aluno: ");
        return Integer.parseInt(reader.readLine());
    }

    private static List<Double> getAlunoNotas(BufferedReader reader) throws IOException {
        boolean lerProximaNota = true;
        List<Double> notas = new ArrayList<>();

        while (lerProximaNota){
            System.out.print("Digite a nota do aluno: ");
            notas.add(Double.parseDouble(reader.readLine()));

            System.out.print("Deseja inserir mais uma nota? [S/n]: ");
            String resposta = reader.readLine();

            if (resposta.equalsIgnoreCase("n")) {
                lerProximaNota = false;
            }
        }

        return notas;
    }
}
