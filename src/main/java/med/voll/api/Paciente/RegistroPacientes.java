package med.voll.api.Paciente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.DatosDireccion.DatosDireccion;

public record RegistroPacientes(
        @NotBlank
        String nombre,
        @NotBlank
        @Email
        String email,
        @NotBlank
        @Pattern(regexp = "\\d{4,6}")
        String documento,
        @NotNull
        @Valid
        DatosDireccion direccion
) {
}
