package com.labib.railtansportation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

@Entity
public class Passenger {


    @Id
    @GeneratedValue
    @Column(name = "id_PK")
    private int id;

    @Column (name = "name")
    private String name;

    @Column (name = "sure_name")
    private String surname;

    @Column (name = "date_of_birth")
    private Date dateOfBirth;

    public Passenger(){}


    public Passenger(String name, String surname, Date dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    public String dateFormat() {
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return dateFormat.format(dateOfBirth);
    }
}
