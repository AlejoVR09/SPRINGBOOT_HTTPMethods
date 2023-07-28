package med.voll.api.Medico;

import med.voll.api.DatosDireccion.Direccion;

public record RegistroMedicos(String name, String email, String documento, Especialidad especialidad, Direccion direccion) {

}

