
public class Main {
    public static void main(String[] args) {
        Persona newPerson = new Persona();

        newPerson.setEdad(39);
        newPerson.setNombre("José Vicente Falcó");
        newPerson.setTelefono("+34685959113");

        System.out.println(newPerson.getNombre());
        System.out.println(newPerson.getEdad());
        System.out.println(newPerson.getTelefono());
    }
}