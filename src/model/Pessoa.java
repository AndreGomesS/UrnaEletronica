
package model;

/**
 *
 * @author Raiminson
 */

public abstract class Pessoa {
    private String nome;
    private int matricula;
    private int anoNascimento;

    public Pessoa(String nome, int matricula, int anoNascimento) {
        this.nome = nome;
        this.matricula = matricula;
        this.anoNascimento = anoNascimento;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the matricula
     */
    public int getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the anoNascimento
     */
    public int getAnoNascimento() {
        return anoNascimento;
    }

    /**
     * @param anoNascimento the anoNascimento to set
     */
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    
}
