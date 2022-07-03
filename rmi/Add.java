import java.rmi.*;
import java.rmi.server.*;
public class Add extends UnicastRemoteObject implements Addi {
    private static final long serialVersionUID = 1L;
    public Add() throws Exception{
        super();
    }
    public int add(int x, int y){
        return x + y;
    }
}
