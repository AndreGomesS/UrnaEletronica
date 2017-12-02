package model;

/**
 *
 * @author Elias
 * 
 * Essa classe é só de teste. É como se fosse a classe Eleitor ou Candidato.
 * Apenas para ter um objeto a ser criptografado como exemplo.
 * 
 */
public class Teste {
   
    // Variáveis de instância:
    private String nome;
    private int idade;

    // Construtores:
    public Teste(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public Teste(){}
    
    // Acessores e Modificadores:
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}
