package med.voll.api.Medico;

import med.voll.api.DatosDireccion.DatosDireccion;

public record ListadoMedico(String nombre, String email,String documento , Especialidad especialidad) {
    public ListadoMedico(Medico medico){
        this(medico.getNombre(), medico.getEmail(), medico.getDocumento(), medico.getEspecialidad());
    }
}
