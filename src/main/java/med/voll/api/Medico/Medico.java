package med.voll.api.Medico;

import jakarta.persistence.*;
import lombok.*;
import med.voll.api.DatosDireccion.Direccion;

@Table(name="medicos")
@Entity(name="Medico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String email;
    private String documento;
    @Enumerated(EnumType.STRING)
    private Especialidad especialidad;
    @Embedded
    private Direccion direccion;

    public Medico(RegistroMedicos medico) {
        this.nombre=medico.nombre();
        this.email=medico.email();
        this.documento=medico.documento();
        this.especialidad=medico.especialidad();
        this.direccion=new Direccion(medico.direccion());
    }
}
