package app.data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Counter {
    
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int counter;
    
    public void setCounter() {
        counter+=1;
    }
    
    public int getCounter() {
        setCounter();
        return counter;
    }

    public void setCounterdb(int count){
        this.counter = count;
    }

}
