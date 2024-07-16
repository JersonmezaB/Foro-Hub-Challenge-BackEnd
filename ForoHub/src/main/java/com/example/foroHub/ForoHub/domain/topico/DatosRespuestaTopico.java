package com.example.foroHub.ForoHub.domain.topico;

import java.time.LocalDate;

public record DatosRespuestaTopico(String titulo, String mensaje, LocalDate fecha, Boolean status, String autor, String curso) {
}
