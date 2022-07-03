import java.rmi.*;
public interface Addi extends Remote{
    public int add(int a, int b) throws Exception;
}
