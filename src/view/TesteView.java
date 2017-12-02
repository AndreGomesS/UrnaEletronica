package view;

import controller.TesteController;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Elias
 * 
 * Essa classe é só de teste. É como se fosse a classe EleitorView ou 
 * CandidatoView.
 * Apenas para ter um objeto a ser criptografado como exemplo.
 * 
 */
public class TesteView {
    
    public static void main(String[] args) {
        
        // Teste da Criptografia usando o MVC:
        /*
          Como essa é a view, ela não conhece o modelo, então preparamos os 
          dados para o controller atualizar o modelo:
        */
        String nome = "Teste"; // Poderia estar pegando de um campo do form;
        int idade = 20; // Também poderia estar vindo do form;
        
        // Agora mapeamos os dados:
        Map dadosView = new HashMap<>();
        dadosView.put("nome", new String(nome));
        dadosView.put("idade", new Integer(idade));
        
        // Chamamos o Controller para atualizar o modelo e notificar essa View:
        System.out.println(
            "Notifica View: " +
            TesteController.criarTeste(dadosView)
        );
        
        // Simular a escrita:
       
        
    }
    
}
