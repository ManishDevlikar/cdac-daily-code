import java.util.*;

class Program {

    public static void main(String[] args) {
        if(args.length == 0){
            //Collection<Interval> store = new ArrayList<>();
            //Collection<Interval> store = new LinkedList<>();           
            //Collection<Interval> store = new HashSet<>();
            Collection<Interval> store = new TreeSet<>();
            store.add(new Interval(4, 21));
            store.add(new Interval(2, 141));
            store.add(new Interval(7, 32));
            store.add(new Interval(6, 13));
            store.add(new Interval(3, 54));
            store.add(new Interval(5, 45));
            for(Interval i : store)
                System.out.println(i);
        }else{
            //Map<String, Interval> store = new HashMap<>();
            Map<String, Interval> store = new TreeMap<>();
            store.put("monday", new Interval(4, 21));
            store.put("tuesday", new Interval(7, 42));
            store.put("wednesday", new Interval(6, 13));
            store.put("thursday", new Interval(3, 54));
            store.put("friday", new Interval(5, 45));
            store.put("monday", new Interval(2, 21));
            Interval val = store.get(args[0]);
            if(val != null)
                System.out.printf("Value = %s%n", val);
            else{
                for(var pair : store.entrySet()){
                    System.out.printf("%-12s%16s%n", pair.getKey(), pair.getValue());
                }
            }
        }
    }
}