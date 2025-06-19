package ar.edu.utn.frc.tup.lc.iv.models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reporte {
    Districto districto;
    Seccion seccion;
    List<Partido> resultados;
}
