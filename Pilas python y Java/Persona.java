public class Persona {
    public void correr() {
        System.out.println("Estoy corriendo.");
    }

    public void caminar() {
        System.out.println("Estoy caminando.");
    }

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.correr();
        persona.caminar();
    }
}
