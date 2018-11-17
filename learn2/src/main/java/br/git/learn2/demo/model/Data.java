package br.git.learn2.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "DATA")
public class Data {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String data;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(final String data) {
        this.data = data;
    }

    @Override
    public String toString(){
        return "Id: "+getId()+" - Data: "+getData()+"   ";
    }
}
