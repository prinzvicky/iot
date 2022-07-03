import java.util.*;
import java.util.concurrent.TimeUnit;
import java.rmi.*;
public class Client {
    public static void main(String[] args) throws Exception{
        long beforeUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        long startTime=System.nanoTime();
        TimeUnit.SECONDS.sleep(5);
        Addi obj=(Addi)Naming.lookup("rmi://0.0.0.0:1900/cloud");
        System.out.println(obj.add(1,2));
        long endTime=System.nanoTime();
        long elapsedTime=endTime-startTime;
        System.out.println("Time: "+elapsedTime);
        long afterUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        long actualMemUsed=afterUsedMem-beforeUsedMem;
        System.out.println("Memory usage:"+actualMemUsed);
    }
}
