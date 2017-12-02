package controller;

import java.util.Map;
import model.Teste;
import util.CriptografiaSimples;

/**
 *
 * @author Elias
 * 
 * Essa classe é só de teste. É como se fosse a classe EleitorController ou 
 * CandidatoController.
 * Apenas para ter um objeto a ser criptografado como exemplo.
 * 
 */
public class TesteController {
    
    /*
      Nesse caso poderia estar escrevendo no arquivo já;
      Aqui vou só imprimir os dados do objeto criptografados 
      e descriptografados, usando a classe CriptografiaSimples;
    */
    public static boolean criarTeste(Map dadosView){
    
        // Prepara os dados para atualizar o modelo;
        String nome = (String) dadosView.get("nome");
        Integer idade = (Integer) dadosView.get("idade");
        
        // Cria e atualiza o modelo:
        Teste teste = new Teste(nome, idade);
        
        // Senha para criptografar:
        int minhaSenha = 123; // Super segura kk, aqui só aceita int, "Simples";
        
        // Criptografa:
        String nomeCriptografado = CriptografiaSimples.Criptografar(teste.getNome(), minhaSenha);
        System.out.println("Nome criptografado: " + nomeCriptografado);
        
        // O "" + é para transformar o int (idade) em String:
        String idadeCriptografada = CriptografiaSimples.Criptografar("" + teste.getIdade(), minhaSenha); 
        System.out.println("Idade criptografada: " + idadeCriptografada);
        
        // Descriptografa:
        String nomeDescriptografado = CriptografiaSimples.Descriptografar(nomeCriptografado, minhaSenha);
        System.out.println("Nome descriptografado: " + nomeDescriptografado);
        
        // O "" + é para transformar o int (idade) em String:
        String idadeDescritografada = CriptografiaSimples.Descriptografar(idadeCriptografada, minhaSenha); 
        System.out.println("Idade descriptografada: " + idadeDescritografada);
        
        /*
         Notifica a View: 
         true = modelo atualizado; 
         false = modelo não atualizado;
        */
        return teste != null;
        
    }
    
}
