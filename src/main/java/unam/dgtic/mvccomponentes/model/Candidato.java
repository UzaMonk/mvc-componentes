package unam.dgtic.mvccomponentes.model;

import jakarta.validation.constraints.*;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "candidatos")
public class Candidato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int  id;

    @NotBlank(message = "Nombre no puede ser vacio")
    String nombre;

    @NotBlank(message = "Apellido páterno no puede ser vacio")
    @Column(name = "apellido_paterno")
    String apellidoPaterno;

    @NotBlank(message = "Apellido materno no puede ser vacio")
    @Column(name = "apellido_materno")
    String apellidoMaterno;

    @Min(value = 15, message = "Debe tener al menos 15 años")
    @Max(value = 30, message = "Debe tener menos de 30 años")
    int edad;

    @Email(message = "Correo debe ser válido")
    String correo;

    @Pattern(regexp = "^\\d{2}-\\d{8}$", message = "El teléfono debe tener el formato XX-XXXXXXXX")
    String telefono;

    Date fecha;
}
