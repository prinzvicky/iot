
import java.rmi.registry.Registry; 
import java.rmi.registry.LocateRegistry; 
import java.rmi.RemoteException; 
import java.rmi.server.UnicastRemoteObject; 
import java.rmi.*;
public class server{
   public server() {} 
   public static void main(String args[]) { 
       try
        {
            System.setProperty("java.rmi.server.hostname", "192.168.43.153");
            Addi obj = new Add();
            LocateRegistry.createRegistry(1900);
            Naming.rebind("rmi://localhost:1900/cloud",obj);
        }
        catch(Exception ae)
        {
            System.out.println(ae);
        }
   } 
} 