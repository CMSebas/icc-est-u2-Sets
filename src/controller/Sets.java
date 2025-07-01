package controller;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.LinkedHashSet;

public class Sets {

    public Sets(){

    }

    public void construirHashSet(){
        Set<String> palabras=new HashSet<>();
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Pera");
        palabras.add("Laptop");

        for (String palabra:palabras){
            System.out.println(palabra);
        }


    }

    public void construirLinkedHashSet(){
        Set<String> palabrasLinkeadas=new LinkedHashSet<>();
        palabrasLinkeadas.add("Laptop");
        palabrasLinkeadas.add("Manzana");
        palabrasLinkeadas.add("Pera");
        palabrasLinkeadas.add("Celular");
        palabrasLinkeadas.add("Laptop");
        palabrasLinkeadas.add("Pera");
        palabrasLinkeadas.add("Laptop");

        for (String palabra:palabrasLinkeadas){
            System.out.println(palabra);
        }

    }

    public void construirTreeSet(){
        //crear construcctor

   
        Set<String> palabrasTreSet=new TreeSet<>();
        palabrasTreSet.add("Laptop");
        palabrasTreSet.add("Manzana");
        palabrasTreSet.add("Pera");
        palabrasTreSet.add("Celular");
        palabrasTreSet.add("Laptop");
        palabrasTreSet.add("Pera");
        palabrasTreSet.add("Laptop");

        for (String palabra:palabrasTreSet){
            System.out.println(palabra);
        }
    }

    public void construirTreeSetConComparador(){
        Comparator<String> miComparator = new Comparator<String>() {
        @Override
        public int compare(String s1, String s2) {
            
            int result = Integer.compare(s1.length(), s2.length());
           if (result == 0) {
                // Si tienen la misma longitud, comparar alfabéticamente
                return s1.compareTo(s2);
            }
            return result;
        }
    };
    
    
        Set<String> palabrasTreSetCompare = new TreeSet<>(miComparator);        palabrasTreSetCompare.add("Laptop");
        palabrasTreSetCompare.add("Manzana");
        palabrasTreSetCompare.add("Pera");
        palabrasTreSetCompare.add("Celular");
        palabrasTreSetCompare.add("Laptop");
        palabrasTreSetCompare.add("Pera");
        palabrasTreSetCompare.add("Laptop");

        for (String palabra:palabrasTreSetCompare){
            System.out.println(palabra);
        }
    }

    
}
