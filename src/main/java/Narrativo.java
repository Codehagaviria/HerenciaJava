public class Narrativo extends Libro{
    private String Tema;

    //Metodo constructor
    public Narrativo(String titulo, String aniopublicacion,String genero,String isbn,String autor, String tema) {

        super(titulo, aniopublicacion, genero, isbn, autor);

        //Metodo constructor
        this.Tema = tema;
    }
        // Metodos GET
        public String getTema() {
            return Tema;
        }

        //Metodos SET
        public void setTema(String tema){
            this.Tema = tema;
        }

  }

