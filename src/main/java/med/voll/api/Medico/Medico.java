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
    private String telefono;
    private String documento;
    private Boolean activo;
    @Enumerated(EnumType.STRING)
    private Especialidad especialidad;
    @Embedded
    private Direccion direccion;

    public Medico(RegistroMedicos medico) {
        this.activo=true;
        this.nombre=medico.nombre();
        this.email=medico.email();
        this.telefono=medico.telefono();
        this.documento=medico.documento();
        this.especialidad=medico.especialidad();
        this.direccion=new Direccion(medico.direccion());
    }

    public void actualizarDatos(ActualizarMedico actualizarMedico) {
        if(actualizarMedico.nombre()!=null){
            this.nombre=actualizarMedico.nombre();
        }
        if(actualizarMedico.email()!=null){
            this.email=actualizarMedico.email();
        }
        if (actualizarMedico.direccion()!=null){
            this.direccion=direccion.actualizarDireccion(actualizarMedico.direccion());
        }
    }

    public void eliminaMedicos(){
        this.activo=false;
    }
}
