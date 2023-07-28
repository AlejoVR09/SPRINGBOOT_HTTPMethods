package med.voll.api.Paciente;

import med.voll.api.DatosDireccion.Direccion;

public record RegistroPacientes(String nombre, String email, String telefono, String documentoIdentidad, Direccion direccion) {
}
