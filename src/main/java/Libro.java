import org.example.Main;

import java.util.Date;

public class Libro {
        private String titulo;
        private String aniopublicacion;
        private String genero;
        private String isbn;
        private String autor;

        //Metodo constructor
   public Libro(String titulo, String aniopublicacion,String genero,String isbn,String autor ){
       this.titulo=titulo;
       this.aniopublicacion=aniopublicacion;
       this.genero=genero;
       this.isbn=isbn;
       this.autor=autor;
   }
   //Metodos GET
   public String getTitulo() {
        return titulo;
   }

    public String getAniopublicacion() {
        return aniopublicacion;
    }

    public String getGenero() {
        return genero;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAutor() {
        return autor;
    }

    //Metodos SET
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAniopublicacion(String aniopublicacion) {
        this.aniopublicacion = aniopublicacion;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    //Metodo principal
    public static void main(String[] args) {
        Libro libro = new Libro ("Cien años de soledad","1680","Novela","ISBN771771321","GABO");
        System.out.println("El titulo del libro es "+ libro.getTitulo());
        System.out.println("El año de publicación "+libro.getAniopublicacion());
        System.out.println("El genero es " + libro.getGenero());
        System.out.println("El código ISBN " + libro.getIsbn());
        System.out.println("El autor es " + libro.getAutor());
        }
    }


