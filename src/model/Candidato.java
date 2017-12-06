
package model;

/**
 *
 * @author Pedro
 */

public class Candidato extends Pessoa{
    
    private int QtdVotos;
    private String pathFoto;

    public Candidato(int QtdVotos, String pathFoto, String nome, int matricula, int anoNascimento) {
        super(nome, matricula, anoNascimento);
        this.QtdVotos = QtdVotos;
        this.pathFoto = pathFoto;
    }

    /**
     * @return the QtdVotos
     */
    public int getQtdVotos() {
        return QtdVotos;
    }

    /**
     * @param QtdVotos the QtdVotos to set
     */
    public void setQtdVotos(int QtdVotos) {
        this.QtdVotos = QtdVotos;
    }

    /**
     * @return the pathFoto
     */
    public String getPathFoto() {
        return pathFoto;
    }

    /**
     * @param pathFoto the pathFoto to set
     */
    public void setPathFoto(String pathFoto) {
        this.pathFoto = pathFoto;
    }
    

}
