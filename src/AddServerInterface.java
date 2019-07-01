import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * A Remote Interface
 */
public interface AddServerInterface extends Remote {
    public int sum(int a, int b) throws RemoteException;
}
