

package com.portafolioLS.AP.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;




@Entity

@Getter @Setter
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @NotNull
    //tamaño máximo de nombre
    @Size(min = 1, max = 50, message = "no cumple la longitud requerida" )
    private String nombre;
    
     @Size(min = 1, max = 50, message = "no cumple la longitud requerida" )
    private String apellido;
    private String img;
    
    
    
    
    
}
