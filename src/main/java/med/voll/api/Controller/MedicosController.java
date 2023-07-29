package med.voll.api.Controller;

import jakarta.validation.Valid;
import med.voll.api.Medico.ListadoMedico;
import med.voll.api.Medico.Medico;
import med.voll.api.Medico.MedicoRepository;
import med.voll.api.Medico.RegistroMedicos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import org.springframework.data.domain.Pageable;
import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicosController {
    @Autowired
    private MedicoRepository medicoRepository;
    @PostMapping
    public void recibirMedico(@RequestBody @Valid RegistroMedicos medico){
        medicoRepository.save(new Medico(medico));
        System.out.println(medico);
    }

    //@GetMapping
    //public List<Medico> listaMedicos(){
    //    return medicoRepository.findAll();
    //}

    @GetMapping
    public Page<ListadoMedico> listaMedicos(@PageableDefault(size = 2, sort = "nombre") Pageable paginacion){

        //return medicoRepository.findAll().stream().map(ListadoMedico::new).toList();

        return medicoRepository.findAll(paginacion).map(ListadoMedico::new);
    }

}
