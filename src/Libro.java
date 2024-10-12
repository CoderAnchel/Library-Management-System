public class Libro {

    private String titulo;
    private int ISBN;
    private String autor;
    private boolean disponible;

    public Libro(String titulo, int ISBN, String autor, boolean disponible) {
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.autor = autor;
        this.disponible = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Titulo: "+titulo+", ISBN: "+ISBN+", Autor: "+autor+ ", Disponible: "+disponible;
    }
}
