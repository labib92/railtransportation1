package com.labib.railtransportation.model;

import com.labib.railtansportation.model.Passenger;
import com.labib.railtansportation.model.Schedule;
import com.labib.railtansportation.model.Train;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class EntityTest {

    private EntityManagerFactory emf;
    private EntityManager em;


    @Before
    public void setup(){

        emf = Persistence.createEntityManagerFactory("TestPersistenceUnit");
        em = emf.createEntityManager();

    }

    @After
    public void end(){
        em.close();
        emf.close();

    }

    @Test
    public void testCreateTrain(){

        Train train1 = new Train("4554","Moscow to St.petersburg", 101);
        Train train2 = new Train("5445","St.petersburg to Moscow",202);

        em.getTransaction().begin();

        try{
            em.persist(train1);
            em.persist(train2);
        }catch (Throwable t){
            em.getTransaction().rollback();
            throw t;
        }finally {
            em.getTransaction().commit();
        }
    }

    @Test
    public void  testCreatePassanger() throws Throwable{


        Passenger passenger1 = new Passenger("Labib", "Saleh",new SimpleDateFormat("dd-MM-yyyy").parse("21-08-1992"));
        Passenger passenger2 = new Passenger("Mazen","Yahia", new SimpleDateFormat("dd-MM-yyyy").parse("4-06-1994"));

        em.getTransaction().begin();

        try{
            em.persist(passenger1);
            em.persist(passenger2);

        }catch (Throwable t){
            em.getTransaction().rollback();
            throw t;
        }finally {
            em.getTransaction().commit();
        }


    }

    @Test
    public void testCreateSchedule() throws Throwable {

        Schedule schedule1 =new Schedule(new SimpleDateFormat("HH:mm").parse("10:15"));

        em.getTransaction().begin();

        try{

            em.persist(schedule1);

        }catch (Throwable t){
            em.getTransaction().rollback();
            throw t;
        }finally {
            em.getTransaction().commit();
        }
    }
    //@Test
   // public  void testCreateStation() throws  Throwable{

      //  Schedule schedule = new Schedule("5555", new SimpleDateFormat("HH:mm").parse("10:15"));

       // Station station1 = new Station("Moskovski vokzal");


//    }








}
