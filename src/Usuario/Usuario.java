public class Usuario {

    // ATRIBUTOS PRIVADOS

    // Identificador único de cada usuario.
    private int id;

    // Nombre de usuario dentro del sistema.
    private String username;

    // Correo electrónico del usuario.
    private String correo;

    // Indica si el usuario está activo.
    private boolean activo;

    // Contador compartido por todos los usuarios.
    // Comienza en cero.
    private static int contadorUsuarios = 0;


    // CONSTRUCTOR

    // Se ejecuta cada vez que creamos un usuario.
    // Recibe únicamente el username y el correo.
    public Usuario(String username, String correo) {

        // Incrementamos el contador en una unidad.
        contadorUsuarios++;

        // Asignamos el número generado al ID.
        this.id = contadorUsuarios;

        // Inicializamos los atributos con setters.
        // Los setters validan los datos recibidos.
        setUsername(username);
        setCorreo(correo);

        // Todos los usuarios comienzan activos.
        this.activo = true;
    }


    // GETTERS

    // Devuelve el identificador del usuario.
    public int getId() {
        return id;
    }

    // Devuelve el nombre de usuario.
    public String getUsername() {
        return username;
    }

    // Devuelve el correo electrónico.
    public String getCorreo() {
        return correo;
    }

    // Devuelve el estado del usuario.
    public boolean isActivo() {
        return activo;
    }


    // SETTERS CON VALIDACIONES

    // Permite cambiar el nombre de usuario.
    public void setUsername(String username) {

        // Comprobamos que no sea null ni esté vacío.
        if (username != null && !username.trim().isEmpty()) {

            // Guardamos el nombre sin espacios externos.
            this.username = username.trim();
        }
    }

    // Permite cambiar el correo electrónico.
    public void setCorreo(String correo) {

        // Comprobamos que contenga texto y un @.
        // Esta es una validación básica de práctica.
        if (correo != null && !correo.trim().isEmpty() && correo.contains("@")) {

            // Guardamos el correo sin espacios externos.
            this.correo = correo.trim();
        }
    }


    // METODO STATIC

    // Devuelve la cantidad total de usuarios creados.
    // Se llama usando el nombre de la clase Usuario.
    public static int getTotalUsuarios() {

        return contadorUsuarios;
    }
}
