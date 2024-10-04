package com.biblioteca.escolar.modelos;

import java.time.LocalDate;

public class Reserva {
    Long id;
    LocalDate dataReserva;
    String status;

    public Reserva() {
    }

    public Reserva(Long id, LocalDate dataReserva, String status) {
        this.id = id;
        this.dataReserva = dataReserva;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(LocalDate dataReserva) {
        this.dataReserva = dataReserva;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
