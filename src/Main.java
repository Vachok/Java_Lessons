import java.util.Date;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;


public class Main {
    static long numOfOperation = 10_000_000_000L;
    
    static int numOfThreads = Runtime.getRuntime().availableProcessors();
    
    public static void main(String[] args) {
        System.out.println(new Date());
        ForkJoinPool pool = new ForkJoinPool(numOfThreads);
        System.out.println(pool.invoke(new MyFork(0, numOfOperation)));
        System.out.println(new Date());
    }
    static class MyFork extends RecursiveTask<Long> {
        long from, to;
        
        MyFork(long from, long to) {
            
            this.from = from;
            this.to = to;
        }
        @Override
        protected Long compute() {
            
            if(to - from <= numOfOperation / numOfThreads) { //если опер. разбита достаточное кол-во частей, выполняем, если нет - разобьем на части поменьше
                long j = 0;
                for(long i = from;i < to;i++){
                    j += i;
                }
                return j;
            }
            else{
                long middle = (to + from) / 2;
                MyFork firstHalf = new MyFork(from, middle);
                firstHalf.fork();
                MyFork secondHalf = new MyFork(middle + 1, to);
                long secondValue = secondHalf.compute();
                return firstHalf.join() + secondValue;
            }
        }
    }
}



//23.12.2017(10:39)by{Vachok}