package com.uptc.fwr.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="AUTHOR")
public class Author {

    @Id
    @Column(name = "AUT_ID")
    private Long id;
    @Column(name = "AUT_NAME")
    private String name;
    @Column(name = "AUT_EMAIL")
    private String email;


    @OneToMany (mappedBy = "author")
    private List<Message> messages;


    public Author() {
    }

    public Author(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }
    @Override
    public String toString() {
        return "Autor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
