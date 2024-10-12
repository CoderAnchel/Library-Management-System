import java.util.ArrayList;

public class registroPrestamos {
    ArrayList<Prestamo> prestamos;

    public registroPrestamos() {
        prestamos = new ArrayList<>();
    }

    public void addPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);
    }

    public void showPrestamos() {
        for (Prestamo prestamo : prestamos) {
            System.out.println(prestamo.toString());
        }
    }
}
