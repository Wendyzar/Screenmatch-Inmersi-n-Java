import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a la Inmersión en Java");
        //System.out.println ("Película Matrix");

        //Declaracion de variables
        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        String nombre = "Matrix";

        String Sinopsis = """
                Sinopsis: Un experto en computadoras descubre que su mundo es una simulación total creada
                 con maliciosas intenciones por parte de la ciberinteligencia.
                """;

        double mediaEvaluacionUsuario= 0;
        System.out.println("película: " + nombre);
        System.out.println("Fecha de Lanzamiento " + fechaDeLanzamiento);
        System.out.println("Evaluación " + evaluacion);
        System.out.println("¿Está incluida en el plan básico? " + incluidoEnElPlanBasico);

        double mediaEvaluacion= (3.5+5.8+3.5)/3;
        System.out.println ("Media de evaluación de la película Matrix" + mediaEvaluacion);

        if (fechaDeLanzamiento > 2023) {
            System.out.println("Película popular en el momento");
        }else {
            System.out.println("Película retro que vale la pena ver.");

            System.out.println(Sinopsis);
        }

        int i= 0;
        while (i < 3) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingrese la nota (de 1 a 5 puntos) para la película Matrix");
            double nota = teclado.nextDouble();
            if (nota>5.1) {nota=5.0;}
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + nota;
            i=i+1;

        }
        System.out.println("La media de la calificación de la película Matrix calculada por los usuarios es " +
                    mediaEvaluacionUsuario/ 3);


    }
}