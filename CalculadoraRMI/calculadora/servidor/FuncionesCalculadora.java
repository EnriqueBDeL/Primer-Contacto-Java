package calculadora.servidor;


import java.rmi.RemoteException;

//-------------------------------------------|
import java.rmi.server.UnicastRemoteObject;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
//-------------------------------------------|

public class FuncionesCalculadora extends UnicastRemoteObject implements Calculadora{

	
	private static final long serialVersionUID = 1L;

	
    public FuncionesCalculadora() throws RemoteException {
        super();
    }


    @Override
    public long add(long a, long b) throws RemoteException { return a + b; }
    @Override
    public long sub(long a, long b) throws RemoteException { return a - b; }
    @Override
    public long mul(long a, long b) throws RemoteException { return a * b; }
    @Override
    public long div(long a, long b) throws RemoteException { return a / b; }


    
    @Override
    public void conectar(String nombreCliente) throws RemoteException {
        System.out.println(">>> [NUEVA CONEXIÓN] El cliente '" + nombreCliente + "' ha iniciado sesión. (" + horaActual() + ")");
    }

    @Override
    public void desconectar(String nombreCliente) throws RemoteException {
        System.out.println("<<< [DESCONEXIÓN] El cliente '" + nombreCliente + "' ha cerrado sesión. (" + horaActual() + ")");
    }

    
    private String horaActual() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }
    
}
