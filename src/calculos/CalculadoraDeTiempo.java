package calculos;

import screenmatch.Pelicula;
import screenmatch.Serie;
import screenmatch.Titulo;

public class CalculadoraDeTiempo {
    private int tiempoTotal;

    public int getTiempoTotal() {

        return tiempoTotal;
    }



    public void incluye(Titulo titulo) {
        this.tiempoTotal += titulo.getDuracionEnMinutos();
    }

//    public void incluye(Serie serie) {
//        tiempoTotal += serie.getDuracionEnMinutos();
//    } el codigo esta duplicado se aplica polimorfismo para no repetir mas codigo.


}
