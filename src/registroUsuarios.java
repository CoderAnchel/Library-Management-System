import java.util.ArrayList;

public class registroUsuarios {
    private ArrayList<Usuario> usuarios;

    public registroUsuarios() {
        this.usuarios = new ArrayList<>();
    }

    public void addUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public Usuario searchUsuario (String nombre, String apellido,  String password) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNombre().equals(nombre) && usuario.getApellido().equals(apellido) && usuario.getPassword().equals(password)) {
                return usuario;
            }
        }
        return null;
    }

    public boolean checkUsuario(String nombre, String apellido, String password) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNombre().equals(nombre) && usuario.getApellido().equals(apellido) && usuario.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }


    public void showUsuarios() {
        for (Usuario usuario : usuarios) {
            System.out.println(usuario.toString());
        }
    }
}
