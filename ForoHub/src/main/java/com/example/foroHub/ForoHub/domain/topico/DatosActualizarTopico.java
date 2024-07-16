package com.example.foroHub.ForoHub.domain.topico;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record DatosActualizarTopico(@NotNull Long id, String titulo, String mensaje, LocalDate fecha, Boolean status, String autor, String curso) {
}
