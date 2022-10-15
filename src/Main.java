import br.com.sistemaescolar.model.Aluno;
import br.com.sistemaescolar.utils.AlunoInputReader;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            Aluno aluno = AlunoInputReader.createNewAluno();
            System.out.println(aluno);
        } catch (IOException e) {
            System.err.println("Erro ao ler a entrada padrão");
            System.exit(1);
        }
    }
}