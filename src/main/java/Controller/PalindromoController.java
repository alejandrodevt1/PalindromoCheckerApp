/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author Alexa
 */
public class PalindromoController {
    
    
    public String normalizarTexto(String palabra){
       palabra = palabra.trim().replaceAll("[\\p{Punct}\\s]", "").toLowerCase();
       palabra = palabra.replaceAll("[áÁ]","a")
               .replaceAll("[éÉ]", "e")
               .replaceAll("[íÍ]", "i")
               .replaceAll("[óÓ]", "o")
               .replaceAll("[úÚ]", "u");
      
       return palabra;
    }
    
    
    public String obtenerPalabraInvertida(char[] arrayCaracteres){
        StringBuilder invertido = new StringBuilder();
          for (int i = arrayCaracteres.length-1; i >= 0; i--) {
            invertido.append(arrayCaracteres[i]);
        }
          return invertido.toString();
    }
    
    public boolean verificarPalindromo(String palabra1,String palabra2){
        if(palabra1.compareTo(palabra2) == 0){
            return true;
        }
        return false;
    }
}
