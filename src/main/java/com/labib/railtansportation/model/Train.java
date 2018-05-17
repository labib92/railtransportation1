package com.labib.railtansportation.model;

import javax.persistence.*;

@Entity
public class Train {

    @Id
    @GeneratedValue
    private int id;

    @Column (name = "train_name")
    private String trainNumber;

    @Column(name = "follow_up_station")
    private String route;

    @Column(name = "number_of_seats")
    private int numberOfSeats;

    @ManyToOne
    private  Schedule schedule;

    public Train(){}
    public Train(String trainNumber,String route, int numberOfSeats){
        this.trainNumber = trainNumber;
        this.route =route;


    }

    public Train(String route, int numberOfSeats, Schedule schedule, String trainNumber) {
        this.route = route;
        this.numberOfSeats = numberOfSeats;
        this.schedule = schedule;
        this.trainNumber = trainNumber;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }
}

