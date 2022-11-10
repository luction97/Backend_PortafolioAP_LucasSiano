package com.portafolioLS.AP.Service;

import com.portafolioLS.AP.Entity.Persona;
import com.portafolioLS.AP.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portafolioLS.AP.Repository.iPersonaRepository;

@Service
public class ImpPersonaService implements IPersonaService {

    @Autowired iPersonaRepository IPersonaRepository;

    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = IPersonaRepository.findAll();
        return persona;

    }

    @Override
    public void savePersona(Persona persona) {

        IPersonaRepository.save(persona);

    }

    @Override
    public void deletePersona(Long id) {

        IPersonaRepository.deleteById(id);

    }

    @Override
    public Persona findPersona(Long id) {
                                          //busca por id   sino devuelve nulo
        Persona persona = new Persona();
                
    persona = IPersonaRepository.findById(id).orElse(null);
        
        return persona;

    }

    
    
}
