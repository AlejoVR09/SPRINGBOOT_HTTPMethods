package med.voll.api.Paciente;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.Controller.PacientesController;
import med.voll.api.DatosDireccion.Direccion;

@Table(name="pacientes")
@Entity(name="Paciente")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Paciente {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String email;
    private String documento;
    @Embedded
    private Direccion direccion;

    public Paciente(RegistroPacientes  paciente) {
        this.nombre=paciente.nombre();
        this.email=paciente.email();
        this.documento=paciente.documento();
        this.direccion=new Direccion(paciente.direccion());
    }
}
