package med.voll.api.Paciente;

public record ListadoPacientes(Long id, String nombre, String email, String documento) {

    public ListadoPacientes(Paciente paciente) {
        this(paciente.getId(), paciente.getNombre(),paciente.getEmail(),paciente.getDocumento());
    }


}
