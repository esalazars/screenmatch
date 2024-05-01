import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nombrePelicula = "Ralph el Demoledor";
        int fechaDeLanzamiento = 2012;
        double evaluacion = 4.2;
        double evaluacionMediaUsuarios = 0;
        boolean incluidoEnPlanBasico = true;
        String sinopsis = """
                Después de años de perder ante su adversario, Ralph, un personaje de un juego de arcade,
                se cansa de ser el chico malo y toma el asunto en sus propias manos para finalmente 
                convertirse en un héroe, pero un enemigo mortal es liberado.
                """;

        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Has visto la pelicula " + nombrePelicula + "(si/no)?");
        if (entrada.next().equals("no")) {
            System.out.println("Catalogo de Peliculas");
            System.out.println("Pelicula: " + nombrePelicula + " Año lanzamiento: " + fechaDeLanzamiento);
            System.out.println("Puntaje: " + evaluacion);
            System.out.println("Sinopsis: " + sinopsis);
        } else {
            System.out.println("A continuacion por favor califica la pelicula");
            for (int i = 0; i<3 ; i++){
                System.out.println("Ingresa tu calificación:");
                double valorizacion = entrada.nextDouble();
                evaluacionMediaUsuarios += valorizacion;
            }
            evaluacionMediaUsuarios /= 3;
            System.out.println("La pelicula cuenta con una puntuacion promedio de parte de los usuarios de " + evaluacionMediaUsuarios);
        }

    }
}