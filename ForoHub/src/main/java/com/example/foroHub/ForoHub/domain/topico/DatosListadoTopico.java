package com.example.foroHub.ForoHub.domain.topico;

import java.time.LocalDate;

public record DatosListadoTopico(String titulo, String mensaje, LocalDate fecha,Boolean status, String autor, String curso) {

    public DatosListadoTopico(Topico topico) {
        this(topico.getTitulo(), topico.getMensaje(), topico.getFecha(),topico.getStatus(), topico.getAutor(),topico.getCurso());
    }
}