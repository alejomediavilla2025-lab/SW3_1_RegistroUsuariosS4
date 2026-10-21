import usuario.Usuario;

public class Main {

    public static void main(String[] args) {

        // Mostramos el título en consola.
        System.out.println("=== REGISTRO DE USUARIOS ===");

        // Consultamos el contador antes de crear objetos.
        System.out.println("Total inicial: "
                + Usuario.getTotalUsuarios());


        // CREACIÓN DE USUARIOS

        // Creamos el primer usuario.
        // El constructor le asigna automáticamente ID 1.
        Usuario usuario1 = new Usuario("jpepe", "jperez@correo.com");

        // Creamos el segundo usuario.
        // Obtendrá automáticamente ID 2.
        Usuario usuario2 = new Usuario("mfran", "mlopez@correo.com");

        // Creamos el tercer usuario.
        // Obtendrá automáticamente ID 3.
        Usuario usuario3 = new Usuario("you777", "cgarcia@correo.com");

        // Creamos el cuarto usuario.
        // Obtendrá automáticamente ID 4.
        Usuario usuario4 = new Usuario("arodriguez", "arodriguez@correo.com");


        // MOSTRAR INFORMACIÓN

        // Consultamos los atributos del primer usuario.
        System.out.println("\n--- USUARIO 1 ---");

        System.out.println("ID: " + usuario1.getId());
        System.out.println("Username: " + usuario1.getUsername());
        System.out.println("Correo: " + usuario1.getCorreo());
        System.out.println("Activo: " + usuario1.isActivo());


        // Consultamos los atributos del segundo usuario.
        System.out.println("\n--- USUARIO 2 ---");

        System.out.println("ID: " + usuario2.getId());
        System.out.println("Username: " + usuario2.getUsername());
        System.out.println("Correo: " + usuario2.getCorreo());
        System.out.println("Activo: " + usuario2.isActivo());


        // Mostramos los IDs de los otros usuarios.
        System.out.println("\n--- OTROS USUARIOS ---");

        System.out.println("Usuario 3 ID: " + usuario3.getId());

        System.out.println("Usuario 4 ID: " + usuario4.getId());


        // CONSULTAR CONTADOR FINAL

        // Como se crearon cuatro objetos,
        // el contador debe mostrar 4.
        System.out.println("\nTotal de usuarios: " + Usuario.getTotalUsuarios());
    }
}