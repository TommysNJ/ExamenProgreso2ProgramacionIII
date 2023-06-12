import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Plato> lista = new ArrayList<>();
    private Ordenamiento orden = new Ordenamiento();

    public void agregarPlato (Plato plato){
        lista.add(plato);
        /*if (orden.busquedaSecuencialNombre(nombre,lista)!=null){
            lista.add(plato);
            return 0;
        }
        return 1;*/
    }
    public String quemarPlatos (){
        List<Plato> platos = new ArrayList<>();
        Plato plato1 = new Plato("Plato01", 49.50, 2000, 40);
        Plato plato2 = new Plato("Plato02", 8.50, 200, 25);
        Plato plato3 = new Plato("Plato03", 10.00, 300, 40);
        Plato plato4 = new Plato("Plato04", 20.50, 1000, 12);
        Plato plato5 = new Plato("Plato05", 4.50, 250, 25);
        lista.add(plato1);
        lista.add(plato2);
        lista.add(plato3);
        lista.add(plato4);
        lista.add(plato5);

        platos.add(plato1);
        platos.add(plato2);
        platos.add(plato3);
        platos.add(plato4);
        platos.add(plato5);

        return platos.toString();
    }
    public int eliminarPlato (String nombre){
        if (orden.busquedaSecuencialNombre(nombre,lista)!=null){
            lista.remove(orden.busquedaSecuencialNombre(nombre,lista));
            return 0;
        }
        return 1;
    }
    public Plato imprimir (String nombre){
        return orden.busquedaSecuencialNombre(nombre,lista);
    }

    public void modificar (String nombre, int calorias, int minutos, double precio){
        Plato plato = orden.busquedaSecuencialNombre(nombre,lista);
        plato.setCalorias(calorias);
        plato.setMinutos(minutos);
        plato.setPrecio(precio);
    }

    public List<Plato> mostrarLista (){
        return lista;
    }

    @Override
    public String toString() {
        return "***MENU***" + lista;
    }
}
