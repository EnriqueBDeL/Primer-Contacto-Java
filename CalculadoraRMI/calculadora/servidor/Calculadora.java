package calculadora.servidor;


//----------------------|
import java.rmi.Remote;
//----------------------|

//-------------------------------|
import java.rmi.RemoteException;
//-------------------------------|



public interface Calculadora extends Remote {
	
	public long add(long a, long b) throws RemoteException;
    public long sub(long a, long b) throws RemoteException;
    public long mul(long a, long b) throws RemoteException;
    public long div(long a, long b) throws RemoteException;
    
    public void conectar(String nombreCliente) throws RemoteException;
    public void desconectar(String nombreCliente) throws RemoteException;
    
}
