package com.labib.railtansportation.model;

import javax.persistence.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


    @Entity
    public class Schedule {
        @Id
        @GeneratedValue
        private int id;

        @Column
        private Date time;


       // @ManyToOne
        //private Station station;

        @ManyToOne
        private Train trainNumber;

        public Schedule(){}

        public Schedule(Date time) {


            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }


        public Date getTime() {
            return time;
        }

        public void setTime(Date time) {
            this.time = time;
        }



        public Train getTrainNumber() {
            return trainNumber;
        }

        public void setTrainNumber(Train trainNumber) {
            this.trainNumber = trainNumber;
        }

        public String timeFormat() {
            DateFormat dateFormat = new SimpleDateFormat("HH:mm");
            return dateFormat.format(time);
        }
    }

