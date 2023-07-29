package med.voll.api.Medico;

import jakarta.validation.constraints.NotNull;
import med.voll.api.DatosDireccion.DatosDireccion;

public record ActualizarMedico(@NotNull Long id, String nombre, String email, DatosDireccion direccion) {

}
