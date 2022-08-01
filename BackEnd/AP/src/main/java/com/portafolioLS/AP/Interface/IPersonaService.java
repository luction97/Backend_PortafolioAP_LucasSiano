package com.portafolioLS.AP.Interface;

import com.portafolioLS.AP.Entity.Persona;
import java.util.List;

public interface IPersonaService {

//Detalla métodos a utilizar
//Traer lista de personas cuando llame a getPersona
    public List<Persona> getPersona();

    //Guardar objeto de tipo persona
    public void savePersona(Persona persona);

    //Eliminar un objeto pero lo buscamos por id
    public void deletePersona(Long id);

    //Buscar una persona por id
    public Persona findPersona(Long id);

}
