package med.voll.api.Paciente;

public record ListadoPacientes(String nombre, String email, String documento) {

    public ListadoPacientes(Paciente paciente) {
        this(paciente.getNombre(),paciente.getEmail(),paciente.getDocumento());
    }


}
