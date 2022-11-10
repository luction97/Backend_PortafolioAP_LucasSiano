
package com.portafolioLS.AP.Security.Repository;

import com.portafolioLS.AP.Security.Entity.Rol;
import com.portafolioLS.AP.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer> {
    
    Optional <Rol> findByRolNombre(RolNombre rolNombre);

    
    
}
