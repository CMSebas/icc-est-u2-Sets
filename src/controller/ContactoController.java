package controller;
import java.util.Set;
import java.util.TreeSet;

import models.*;
import utils.ContactoComparator;
import utils.ContactoComparatorConNumero;

public class ContactoController {

    public ContactoController(){
        runTreeeContacto();
        runTreeeContactoInverso();
    }

    private void runTreeeContacto(){
        ContactoComparator contactoComparator=new ContactoComparator();
        Set<Contacto> contactos=new TreeSet<>(contactoComparator);
        contactos.add(new Contacto("Pedro", "Lopez", "222222222"));
        contactos.add(new Contacto("Luis", "Perez", "111111111"));
        contactos.add(new Contacto("Pedro", "Gonzales", "123456789"));
        contactos.add(new Contacto("Ana", "Perez", "987654321"));
        contactos.add(new Contacto("Pedro", "Lopez","123456789"));

        for(Contacto contacto:contactos){
            System.out.println(contacto);
        }
    }

    private void runTreeeContactoInverso(){
        ContactoComparatorConNumero comparatorConNumero=new ContactoComparatorConNumero();
        Set<Contacto> contactos=new TreeSet<>(comparatorConNumero);
        contactos.add(new Contacto("Pedro", "Lopez", "222222222"));
        contactos.add(new Contacto("Luis", "Perez", "111111111"));
        contactos.add(new Contacto("Pedro", "Gonzales", "123456789"));
        contactos.add(new Contacto("Ana", "Perez", "987654321"));
        contactos.add(new Contacto("Pedro", "Lopez","123456789"));

        for(Contacto contacto:contactos){
            System.out.println(contacto);
        }
    }

    
}