package utils;

import java.util.Comparator;
import models.Contacto;

public class ContactoComparatorConNumero implements Comparator<Contacto> {

    @Override
     public int compare(Contacto c1, Contacto c2) {
        
        int result = c1.getApellido().compareToIgnoreCase(c2.getApellido());

       
        if (result == 0) {
            result = c1.getNombre().compareToIgnoreCase(c2.getNombre());
        }

        if (result == 0) {
            result = c1.getTelefono().compareToIgnoreCase(c2.getTelefono());
        }

        return result;
    }
}
