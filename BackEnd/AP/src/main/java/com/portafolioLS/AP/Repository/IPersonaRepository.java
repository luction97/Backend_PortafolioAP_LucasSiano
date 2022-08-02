 
package com.portafolioLS.AP.Repository;

import com.portafolioLS.AP.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository                                             //Clase  tipoDeID
public interface IPersonaRepository extends JpaRepository<Persona, Long>{

    
    
}
