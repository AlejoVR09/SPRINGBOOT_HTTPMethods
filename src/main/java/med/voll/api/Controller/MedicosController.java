package med.voll.api.Controller;

import med.voll.api.Medico.RegistroMedicos;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class MedicosController {

    @PostMapping
    public void recibirMedico(@RequestBody RegistroMedicos medico){
        System.out.println(medico);
    }
}
