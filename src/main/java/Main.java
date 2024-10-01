import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //TRAER UNA DE LAS CLASES HIJA EMPEZAMOS POR NARRATIVO
        Narrativo narrativo;

        //INSTANCIAR
        System.out.print("Ingrese el titulo del libro: ");
        String titulo= sc.nextLine();
        System.out.print("Ingrese el año del libro: ");
        String aniopublicacion =sc.nextLine();
        System.out.print("Cual es el genero es: ");
        String genero=sc.nextLine();
        System.out.print("Ingrese el isbn del libro: ");
        String isbn=sc.nextLine();
        System.out.print("Ingrese el autor del libro: ");
        String autor =sc.nextLine();
        System.out.print("Ingrese el tema: ");
        String tema = sc.nextLine();
        System.out.println();
        System.out.println();
        narrativo = new Narrativo(titulo, aniopublicacion, genero, isbn, autor,tema);
        System.out.println(" Titulo del libro " + narrativo.getTitulo()) ;
        System.out.println(" El año de publicación " + narrativo.getAniopublicacion());
        System.out.println(" El genero es " + narrativo.getGenero());
        System.out.println(" Su ISBN es " + narrativo.getIsbn());
        System.out.println(" El autor " + narrativo.getAutor());
        System.out.println(" El tema " + narrativo.getTema());

        }
    }


