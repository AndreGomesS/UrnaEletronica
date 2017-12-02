package util;

/**
 *
 * @author Elias
 * Thanks https://drive.google.com/drive/folders/0ByW8n089ZISVeGlDRDItWERtNGc
 */
public class CriptografiaSimples {
    
    // Variáveis
    private static String caracteres = "abcdefghijklmnopqrstuvwxyzáéíóúABCDEFGHIJKLMNOPQRSTUVWXYZÁÉÍÓÚ1234567890.,;_:+-*/ @$#¿?!¡=()[]{}\\\'\"";
    
    // Métodos
    private static String limparTexto(String texto){
        texto = texto.replaceAll("\n", "");  
         
        for(int x = 0; x < texto.length(); x++){
            int posicao = caracteres.indexOf(texto.charAt(x));
            
            if (posicao == -1)
                texto = texto.replace(texto.charAt(x), ' ');
        }        
        return texto;
    }
    
    public static String Criptografar(String texto, int chave) {       
        String textoLimpo = limparTexto(texto);
        String encriptado = "";  
        
        for(int i = 0; i < textoLimpo.length(); i++){
            int posicao = caracteres.indexOf(textoLimpo.charAt(i));

            if((posicao + chave) < caracteres.length())
                encriptado += caracteres.charAt(posicao + chave);
            else
                encriptado +=  caracteres.charAt((posicao + chave) - caracteres.length());       
        }        
        return encriptado;
    }
    
    public static String Descriptografar(String texto, int chave){        
        String textoLimpo = limparTexto(texto);
        String descriptografado = "";   
        
        for(int x = 0; x < textoLimpo.length(); x++){            
            int posicao = caracteres.indexOf(textoLimpo.charAt(x)); 
            
            if ((posicao - chave) < 0)
                descriptografado += caracteres.charAt((posicao - chave) + caracteres.length());
            else
                descriptografado += caracteres.charAt(posicao - chave);
        }        
        return descriptografado;
    }
    
}
