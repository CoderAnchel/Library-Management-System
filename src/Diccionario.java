public class Diccionario extends Libro{
    private String idioma;

    public Diccionario(String idioma, String titulo, int ISBN, String autor, boolean disponible) {
        super(titulo, ISBN, autor, disponible);
        this.idioma = idioma;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    @Override
    public String toString() {
        return "Titulo: "+getTitulo()+", ISBN: "+getISBN()+", Autor: "+getAutor()+ ", Disponible: "+getDisponible()+", Idioma: "+idioma;
    }
}
