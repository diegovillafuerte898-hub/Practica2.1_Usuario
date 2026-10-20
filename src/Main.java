//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Usuario usuario1 = new Usuario();
    usuario1.setUsername("Pepe");
    usuario1.setCorreo("Pepe@gmail.com");
    usuario1.setNivel(3);

    usuario1.activar();
    System.out.println("Usuario: " + usuario1.getUsername());
    System.out.println("Correo: " + usuario1.getCorreo());
    System.out.println("Nivel: " + usuario1.getNivel());
    System.out.println("Activo: " + usuario1.getActivo());
    usuario1.desactivar();
    System.out.println("Activo: " + usuario1.getActivo());
}
