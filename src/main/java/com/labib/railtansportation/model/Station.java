package com.labib.railtansportation.model;

import javax.persistence.*;

@Entity
    public class Station {

        @Id
        @GeneratedValue
        private int id;

        @Column(name = "name_of_station")
        private String nameOfStation;

        @ManyToOne
        private Schedule schedules;


        public Station() {
        }

        public Station(String nameOfStation, Schedule schedules) {
            this.nameOfStation = nameOfStation;
            this.schedules = schedules;
        }

        public Schedule getSchedules() {
        return schedules;
    }

        public void setSchedules(Schedule schedules) {
        this.schedules = schedules;
    }

    public Station(String nameOfStation) {
            this.nameOfStation = nameOfStation;
        }

        public String getNameOfStation() {
            return nameOfStation;
        }

        public void setNameOfStation(String nameOfStation) {
            this.nameOfStation = nameOfStation;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }


    }


