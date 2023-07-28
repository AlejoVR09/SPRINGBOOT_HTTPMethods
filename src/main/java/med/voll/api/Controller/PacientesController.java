package med.voll.api.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pacientes")
public class PacientesController {

    @PostMapping
    public void recibirPaciente(@RequestBody PacientesController paciente){
        System.out.println(paciente);
    }
}
