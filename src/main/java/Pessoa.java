// Dupla: Marcus Vinícius Rodrigues da Silva e Nícolas Moraes

public class Pessoa {

    private String nome;

    Pessoa(String nome) {
        if (nome == null) {
            throw new IllegalArgumentException("Nome não informado.");
        }
            else {
                this.nome = nome;
            }
    }
}