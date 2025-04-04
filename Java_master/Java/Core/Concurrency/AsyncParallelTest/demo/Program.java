import java.util.concurrent.CompletableFuture;
import java.util.stream.IntStream;

class Program {

    static class Computation {

        private long start;

        public long compute(int first, int last) {
            start = System.currentTimeMillis();
            return IntStream.range(first, last + 1)
                .parallel() //split stream into separate streams which can be processed in parallel 
                .mapToLong(Machine::doWork)
                .sum();
        }

        public CompletableFuture<Long> computeAsync(int first, int last) {
            //the supplied operation will be scheduled to execute on another
            //thread allowing the calling thread to resume execution and
            //obtain the result of the operation in future once the other 
            //thread has completed its execution
            return CompletableFuture.supplyAsync(() -> compute(first, last));
        }

        public double time() {
            long current = System.currentTimeMillis();
            return (current - start) / 1000.0;
        }
    }

    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(args[0]);
        System.out.print("Computing...");
        var c = new Computation();
        var job = c.computeAsync(1, n)
            .thenAccept(r -> {
                System.out.println("Done!");
                System.out.printf("Result = %d, computed in %.3f seconds.%n", r, c.time());
            });
        while(!job.isDone()){
            System.out.print('.');
            Thread.sleep(500);
        }
    }
}
