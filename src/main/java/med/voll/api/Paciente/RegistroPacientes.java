package med.voll.api.Paciente;

import med.voll.api.DatosDireccion.DatosDireccion;

public record RegistroPacientes(String nombre, String email, String telefono, String documentoIdentidad, DatosDireccion direccion) {
}
