import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * A Remote Implementation
 */
public class Adder extends UnicastRemoteObject implements AddServerInterface {
    Adder() throws RemoteException {
        super();
    }

    @Override
    public int sum(int a, int b) {
        return a + b;
    }
}
