package med.voll.api.Medico;

import med.voll.api.DatosDireccion.DatosDireccion;

public record RegistroMedicos(String nombre, String email, String documento, Especialidad especialidad, DatosDireccion direccion) {

}

