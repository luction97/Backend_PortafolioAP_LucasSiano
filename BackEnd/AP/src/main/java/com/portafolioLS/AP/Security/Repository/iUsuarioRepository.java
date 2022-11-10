
package com.portafolioLS.AP.Security.Repository;

import com.portafolioLS.AP.Security.Entity.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface iUsuarioRepository extends JpaRepository<Usuario, Integer> {
    
    Optional<Usuario> findByNombreUsuario(String nombreUsuario);
    
    boolean existByNombreUsuario(String nombreUsuario);
    boolean existByEmail(String email);
    
    
    
    
}
