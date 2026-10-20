public class Usuario {
    private String username;
    private String correo;
    private int nivel;
    private boolean activo;

    public void setUsername(String username) {
        if (username != null && !username.isEmpty()) {
            this.username = username;
        }
    }

    public String getUsername() {
        return username;
    }

    public void setCorreo(String correo) {
        if (correo != null && !correo.isEmpty()) {
            this.correo = correo;
        }
    }

    public String getCorreo() {
        return correo;
    }

    public void setNivel(int nivel) {
        if (nivel >= 0) {
            this.nivel = nivel;
        }
    }

    public int getNivel() {
        return nivel;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public boolean getActivo() {
        return activo;
    }

    public void activar() {
        this.activo = true;
        System.out.println("\nEl usuario " + this.username + " ha sido activado.");
    }

    public void desactivar() {
        this.activo = false;
        System.out.println("\nEl usuario " + this.username + " ha sido desactivado.");
    }
}
