package com.uptc.fwr.entity;

import jakarta.persistence.Column;

import java.util.Date;

public class Message {

    private Long id;

    private Double num;

    private String text;

    private Date fecha;

    private Long idAutor;

    public Message() {
    }

    public Message(Long id, Double num, String text, Date fecha, Long idAutor) {
        this.id = id;
        this.num = num;
        this.text = text;
        this.fecha = fecha;
        this.idAutor = idAutor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getNum() {
        return num;
    }

    public void setNum(Double num) {
        this.num = num;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Long getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(Long idAutor) {
        this.idAutor = idAutor;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", num=" + num +
                ", text='" + text + '\'' +
                ", fecha=" + fecha +
                ", idAutor=" + idAutor +
                '}';
    }
}
