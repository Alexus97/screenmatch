import calculos.CalculadoraDeTiempo;
import calculos.FiltroRecomendacion;
import screenmatch.Episodio;
import screenmatch.Pelicula;
import screenmatch.Serie;

public class Principal {
    public static void main(String[] args) {
//        screenmatch.Pelicula miPelicula = new screenmatch.Pelicula();
//        miPelicula.nombre = "Encanto";
//        miPelicula.fechaDeLanzamiento = 2021;
//        miPelicula.duracionEnMinutos = 120;
//
//
//        miPelicula.muestraFichaTecnica();
//        miPelicula.evalua(10);
//        miPelicula.evalua(10);
//        miPelicula.evalua(7.5);
//
//
//        System.out.println(miPelicula.getTotalDeLasEvaluaciones());// validar que se realice la suma de evaluaciones.
//        System.out.println(miPelicula.calculaMedia());
//
//
//
//        screenmatch.Pelicula otraPelicula = new screenmatch.Pelicula();
//        otraPelicula.nombre = "Matrix";
//        otraPelicula.fechaDeLanzamiento = 1998;
//        otraPelicula.duracionEnMinutos = 180;
//        otraPelicula.muestraFichaTecnica();
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Encanto");
        miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(7.8);
        System.out.println(miPelicula.getTotalDelasEvaluaciones());
        System.out.println(miPelicula.calculaMedia());

        Serie casaDragon = new Serie();
        casaDragon.setNombre("La casa del dragon");
        casaDragon.setFechaDeLanzamiento(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.setNombre("Matrix");
        otraPelicula.setFechaDeLanzamiento(1998);
        otraPelicula.setDuracionEnMinutos(180);


        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println("Tiempo necesario para ver tus titulos favoritos estas vacaciones: "
                + calculadora.getTiempoTotal() + " Minutos.");

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa Targaryen");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(300);

        filtroRecomendacion.filtra(episodio);



    }





}
