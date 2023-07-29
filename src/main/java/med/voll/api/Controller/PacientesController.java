package med.voll.api.Controller;

import jakarta.validation.Valid;
import med.voll.api.Paciente.Paciente;
import med.voll.api.Paciente.PacienteRepository;
import med.voll.api.Paciente.RegistroPacientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pacientes")
public class PacientesController {
    @Autowired
    private PacienteRepository pacienteRepository;
    @PostMapping
    public void recibirPaciente(@RequestBody @Valid RegistroPacientes paciente){
        pacienteRepository.save(new Paciente(paciente));
        System.out.println(paciente);
    }
}
