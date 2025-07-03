package controller;

import java.util.HashSet;
import java.util.Set;

public class Ejercicios {

    public Ejercicios(){
        System.out.println("---------------------------------Ejercicios-----------------------------------");
        System.out.println("Ejercicio 1");
        System.out.println("Resultado para{1,2,3,4,5)"+tieneDuplicados(new int[]{1,2,3,4,5}));
        System.out.println(tieneDuplicados(new int[]{1,2,3,4,5,4,3,2,45}));

        System.out.println("\nEjercicio 2: Verificar si una palabra es un isograma");
        System.out.println("Palabra 'murcielago' => " + esIsograma("murcielago")); // true
        System.out.println("Palabra 'camaleon' => " + esIsograma("camaleon"));    

    }

    public boolean tieneDuplicados(int[] numeros){
        Set<Integer> set=new HashSet<>();
        for(int num:numeros){
            if(!set.add(num)){
                return true;
            }
        
        }
        return false;
    }

    //Ejemplos
    //murcielago true(is isograma)
    //camaleon  false(repite 'a')

    public static boolean esIsograma(String palabra){
        Set<Character> letras = new HashSet<>();
        palabra = palabra.toLowerCase(); // ignorar mayúsculas

        for(char c : palabra.toCharArray()){
            if(letras.contains(c)){
                return false; // letra repetida
            }
            letras.add(c);
        }
        return true;
    }
    
}
