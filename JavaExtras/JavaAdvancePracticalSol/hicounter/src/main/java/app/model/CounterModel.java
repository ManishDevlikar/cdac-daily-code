package app.model;

import app.data.Counter;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class CounterModel {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("app.data");
    EntityManager manager = factory.createEntityManager();
    EntityTransaction transaction = manager.getTransaction();

    public int increaseCounter() {
        transaction.begin();
        Counter counter = manager.find(Counter.class, 1);
        if (counter == null) {
            counter = new Counter();
            counter.setCounterdb(1);
        }
        counter.setCounterdb(counter.getCounter() + 1);
        manager.persist(counter);
        transaction.commit();
        return counter.getCounter();
    }
}
