package med.voll.api.Controller;

import med.voll.api.Medico.Medico;
import med.voll.api.Medico.MedicoRepository;
import med.voll.api.Medico.RegistroMedicos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class MedicosController {
    @Autowired
    private MedicoRepository medicoRepository;
    @PostMapping
    public void recibirMedico(@RequestBody RegistroMedicos medico){
        medicoRepository.save(new Medico(medico));
        System.out.println(medico);
    }
}
