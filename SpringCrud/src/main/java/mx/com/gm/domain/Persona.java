package mx.com.gm.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.*;

@Data
@Entity
@Table(name = "persona")
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long idPersona;
    @Getter
    @Setter
    private String nombre;
    @Getter
    @Setter
    private String apellido;
    @Getter
    @Setter
    private String email;
    @Getter
    @Setter
    private String telefono;
}
