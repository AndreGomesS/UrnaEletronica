
package model;

import IO.Manipulador;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import view.TelaInicial;

/**
 *
 * @author agome
 */

public class Urna {
    private  int nSerie;
    private  List<Candidato> listaCandidatos = new ArrayList<>();
    private List<Eleitor> listaEleitores = new ArrayList<>();
    private List<Eleitor> eleitoresQueVotaram = new ArrayList<>();
    private int votosNulos, votosBrancos, votosValidos;
    private boolean urnaPronta;
    
    public Urna(int nSerie) {
        this.nSerie = nSerie;
        this.votosBrancos = 0;
        this.votosValidos = 0;
        this.urnaPronta = false;
        this.listaCandidatos = null;
        this.listaEleitores = null;
    }
    public void validaUrna(){
        if(!(this.listaEleitores.isEmpty() && this.listaCandidatos.isEmpty()))
            setUrnaPronta(true);
    }
    public static void lerArquivos(){
        
        //Manipulador.lerArquivoCandidato(this.listaCandidatos);
        //System.out.println(listaCandidatos.size());
    }
    public static void validaEleitor(int matricula, List<Eleitor> listaEleitores, List<Eleitor> eleitoresQueVotaram) {
        int i, temNaListaEleitores = 0, temNaListaEleitoresQueVotaram = 0;

//        listaEleitores.forEach((obj) -> {//percorre List
//            if (obj.getMatricula() == matricula) {
//
//            }
//        });
        for (i = 0; i < listaEleitores.size(); i++) { // verifica se o eleitor foi cadastrado
            if (listaEleitores.get(i).getMatricula() == matricula) {
                temNaListaEleitores = 1;
            }
        }
        for (i = 0; i < eleitoresQueVotaram.size(); i++) { // verifica se o eleitor ja votou
            if (eleitoresQueVotaram.get(i).getMatricula() == matricula) {
                temNaListaEleitoresQueVotaram = 1;
            }
        }
        if (temNaListaEleitores == 1 && temNaListaEleitoresQueVotaram == 0) { // se o eleitor estiver cadastrado e não ter votato ainda, abre a tela da Urna para que ele posso votar
            //pode votar
            //TelaInicial tela = new TelaInicial(this);
           // tela.setVisible(true);
        } else {
            //nao pode votar
            JOptionPane.showMessageDialog(null, "Cada eleitor pode votar somente uma vez\nOtario");
        }

    }

    public static void confirmarVoto(int matricula, List<Eleitor> listaEleitores, List<Eleitor> eleitoresQueVotaram, int matriculaCandidato, List<Candidato> listaCandidatos) {
        int i = 0;
        listaEleitores.forEach((obj) -> {//Adiciona o eleitor a eleitoresQueVotaram
            if (obj.getMatricula() == matricula) {
                eleitoresQueVotaram.add(obj);
            }
        });

        for (i = 0; i < listaCandidatos.size(); i++) { // imcrementa 1 voto para o candidato
            if (listaCandidatos.get(i).getMatricula() == matriculaCandidato) {
                listaCandidatos.get(i).setQtdVotos(listaCandidatos.get(i).getQtdVotos() + 1);
            }
        }
    }
    public static void votoNulo (int matricula,List<Eleitor> listaEleitores,List<Eleitor> eleitoresQueVotaram){
        listaEleitores.forEach((obj) -> {//Adiciona o eleitor a eleitoresQueVotaram
            if (obj.getMatricula() == matricula) {
                eleitoresQueVotaram.add(obj);
            }
        });
        
    }
    public void iterarlistas(){
        this.listaEleitores.forEach(obj ->{
            System.out.println("Iterandooo - - "+obj.getNome());
        });
    }
    public void addListaEleitores(Eleitor eleitor){
        this.listaEleitores.add(eleitor);
    }
    public void addListaCandidatos(Candidato candidato){
        this.listaCandidatos.add(candidato);
    }
//    public Eleitor validaEleitor ( int matricula, ArrayList<Integer> listaEleitor){
//	for ( Integer eleitor : listaEleitor){
//		if( eleitor.equals(matricula)){
//			system.out.println( “OK”);
//			return eleitor;
//		}
//	}
//else system.out.println (“Eleitor não encontrado”);
//}

    /**
     * @return the nSerie
     */
    public int getnSerie() {
        return nSerie;
    }

    /**
     * @param nSerie the nSerie to set
     */
    public void setnSerie(int nSerie) {
        this.nSerie = nSerie;
    }

    /**
     * @return the listaCandidatos
     */
    public List<Candidato> getListaCandidatos() {
        return listaCandidatos;
    }

    /**
     * @param listaCandidatos the listaCandidatos to set
     */
    public void setListaCandidatos(List<Candidato> listaCandidatos) {
        this.listaCandidatos = listaCandidatos;
    }

    /**
     * @return the listaEleitores
     */
    public List<Eleitor> getListaEleitores() {
        return listaEleitores;
    }

    /**
     * @param listaEleitores the listaEleitores to set
     */
    public void setListaEleitores(List<Eleitor> listaEleitores) {
        this.listaEleitores = listaEleitores;
    }

    /**
     * @return the eleitoresQueVotaram
     */
    public List<Eleitor> getEleitoresQueVotaram() {
        return eleitoresQueVotaram;
    }

    /**
     * @param eleitoresQueVotaram the eleitoresQueVotaram to set
     */
    public void setEleitoresQueVotaram(List<Eleitor> eleitoresQueVotaram) {
        this.eleitoresQueVotaram = eleitoresQueVotaram;
    }

    /**
     * @return the votosNulos
     */
    public int getVotosNulos() {
        return votosNulos;
    }

    /**
     * @param votosNulos the votosNulos to set
     */
    public void setVotosNulos(int votosNulos) {
        this.votosNulos = votosNulos;
    }

    /**
     * @return the votosBrancos
     */
    public int getVotosBrancos() {
        return votosBrancos;
    }

    /**
     * @param votosBrancos the votosBrancos to set
     */
    public void setVotosBrancos(int votosBrancos) {
        this.votosBrancos = votosBrancos;
    }

    /**
     * @return the votosValidos
     */
    public int getVotosValidos() {
        return votosValidos;
    }

    /**
     * @param votosValidos the votosValidos to set
     */
    public void setVotosValidos(int votosValidos) {
        this.votosValidos = votosValidos;
    }

    /**
     * @return the urnaPronta
     */
    public boolean isUrnaPronta() {
        return urnaPronta;
    }

    /**
     * @param urnaPronta the urnaPronta to set
     */
    public void setUrnaPronta(boolean urnaPronta) {
        this.urnaPronta = urnaPronta;
    }

}
