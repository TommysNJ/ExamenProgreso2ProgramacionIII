import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ordenamiento {

    public Plato busquedaSecuencialNombre (String nombre, List<Plato> menu){

        for (int i=0; i< menu.size();i++){
            Plato plato = menu.get(i);
            if (plato.getNombre().equalsIgnoreCase(nombre)){
                return plato;
            }
        }

        return null;
    }
}
