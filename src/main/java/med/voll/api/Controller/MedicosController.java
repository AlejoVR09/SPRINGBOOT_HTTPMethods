package med.voll.api.Controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.api.Medico.*;
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
        //return medicoRepository.findAll(paginacion).map(ListadoMedico::new);
        return medicoRepository.findAByActivoTrue(paginacion).map(ListadoMedico::new);
    }

    @PutMapping
    @Transactional
    public void actualizarMedico(@RequestBody @Valid ActualizarMedico actualizarMedico){
        Medico medico=medicoRepository.getReferenceById(actualizarMedico.id());
        medico.actualizarDatos(actualizarMedico);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void eliminarMedico(@PathVariable Long id){
        Medico medico=medicoRepository.getReferenceById(id);
        medico.eliminaMedicos();
    }

    /*
    * public void eliminarMedico(@PathVariable Long id){
        Medico medico=medicoRepository.getReferenceById(id);
        medicoRepository.delete(medico);
    }
    */

}
