import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Lector = new Scanner(System.in);
        Date date = new Date();

        registroPrestamos registroPrestamos = new registroPrestamos();
        registroLibros registro = new registroLibros();

        Libro libro1 = new Libro("El principito", 1323423, "Antoine de Saint-Exupéry", true);
        Libro libro2 = new Libro("Cien años de soledad", 1323424, "Gabriel García Márquez", true);
        Libro libro3 = new Libro("Don Quijote de la Mancha", 1323425, "Miguel de Cervantes", true);
        Libro libro4 = new Libro("El alquimista", 1323426, "Paulo Coelho", true);
        Libro libro5 = new Libro("El código Da Vinci", 1323427, "Dan Brown", true);
        Libro libro6 = new Libro("Harry Potter y la piedra filosofal", 1323428, "J.K. Rowling", true);
        Libro libro7 = new Libro("El Señor de los Anillos", 1323429, "J.R.R. Tolkien", true);

        registro.addLibro(libro1);
        registro.addLibro(libro2);
        registro.addLibro(libro3);
        registro.addLibro(libro4);
        registro.addLibro(libro5);
        registro.addLibro(libro6);
        registro.addLibro(libro7);

        registro.showLibros();

        registroUsuarios registroUsuarios = new registroUsuarios();

        Usuario usuario1 = new Usuario("Juan", "Perez", "juanperez@gmail.com", 123, "1234567890", "Calle 123", "Bogota", "Cundinamarca", "Colombia", "110111", "1234");
        Usuario usuario2 = new Usuario("Maria", "Gomez", "", 124, "0987654321", "Calle 321", "Medellin", "Antioquia", "Colombia", "050505", "1234");
        Usuario usuario3 = new Usuario("Pedro", "Ramirez", "", 125, "0987654321", "Calle 321", "Medellin", "Antioquia", "Colombia", "050505", "1234");
        Usuario usuario4 = new Usuario("Luis", "Gonzalez", "", 126, "0987654321", "Calle 321", "Medellin", "Antioquia", "Colombia", "050505", "1234");
        Usuario usuario5 = new Usuario("Ana", "Martinez", "", 127, "0987654321", "avinguda pedra del diable 21", "Parets del Valles", "Cataluña", "España", "08150", "1234");
        Usuario usuario6 = new Usuario("Sofia", "Hernandez", "", 128, "0987654321", "Calle 321", "Medellin", "Antioquia", "Colombia", "050505", "1234");

        registroUsuarios.addUsuario(usuario1);
        registroUsuarios.addUsuario(usuario2);
        registroUsuarios.addUsuario(usuario3);
        registroUsuarios.addUsuario(usuario4);
        registroUsuarios.addUsuario(usuario5);
        registroUsuarios.addUsuario(usuario6);

        registroUsuarios.showUsuarios();

        System.out.println("Ingrese el nombre del usuario: ");
        String name = Lector.nextLine();
        System.out.println("Ingrese el apellido del usuario: ");
        String apellido = Lector.nextLine();
        System.out.println("Ingrese la contraseña del usuario: ");
        String password = Lector.nextLine();

        if (registroUsuarios.checkUsuario(name, apellido, password)) {
            System.out.println("Usuario validado ✅");
            System.out.println("Ingrese el titulo del libro: ");
            String Titulo = Lector.nextLine();
            System.out.println("Ingrese la fecha de retorno (ejemplo: 2020-06-10): ");
            String fecha = Lector.nextLine();
            try {
                LocalDate fechaDevolucion = LocalDate.parse(fecha);
                Usuario usuario = registroUsuarios.searchUsuario(name, apellido, password);
                if (usuario != null) {
                    Libro libro = registro.searchLibro(Titulo);
                    Prestamo prestamo = new Prestamo(date, fechaDevolucion, libro.getTitulo(), libro.getISBN(), libro.getAutor(), libro.getDisponible(), usuario.getNombre(), usuario.getApellido(), usuario.getCorreo(), usuario.getID(), usuario.getTelefono(), usuario.getDireccion(), usuario.getCiudad(), usuario.getEstado(), usuario.getPais(), usuario.getCodigoPostal(), usuario.getPassword());
                    registroPrestamos.addPrestamo(prestamo);
                    libro.setDisponible(false);
                    System.out.println("Prestamo realizado con exito ✅");
                    System.out.println("Prestamos actuales: ");
                    registroPrestamos.showPrestamos();
                    System.out.println("Estado Libro: "+ libro.getTitulo() + " - Disponible: " + libro.getDisponible());
                }
            } catch (Exception e) {
                System.out.println("Error en la fecha o en otra parte: " + e.getMessage());
            }
        } else {
            System.out.println("Usuario no encontrado ❌");
        }
    }
}