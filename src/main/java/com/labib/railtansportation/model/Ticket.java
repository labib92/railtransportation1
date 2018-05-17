package com.labib.railtansportation.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

public class Ticket {

    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    private Train train;

    @OneToOne
    private Passenger passenger;

    public Ticket() {
    }

    public Ticket(Train train, Passenger passenger) {
        this.train = train;
        this.passenger = passenger;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
