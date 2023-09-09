package com.uptc.fwr.entity;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name="MESSAGE")
public class Message {
    @Id
    @Column(name = "MES_ID")
    private Long id;

    @Column(name = "MES_NUM")
    private Double num;

    @Column(name = "MES_TEXT")
    private String text;

    @Column(name = "MES_DATE")
    private Date fecha;

    @Column(name = "AUT_ID",insertable = false, updatable = false)
    private Long idAutor;

    @ManyToOne
    @JoinColumn(name = "AUT_ID")
    private Author author;



    public Message() {
    }

    public Message(Long id, Double num, String text, Date fecha, Long idAutor) {
        this.id = id;
        this.num = num;
        this.text = text;
        this.fecha = fecha;
        this.idAutor = idAutor;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
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
