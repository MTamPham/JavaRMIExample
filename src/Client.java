import java.rmi.Naming;

public class Client {
    public static void main(String[] args) {
        try {
            AddServerInterface st = (AddServerInterface) Naming.lookup("rmi://" + args[0] + "/AddService");
            System.out.println(st.sum(25, 8));
        } catch (Exception e) {
            System.out.println(String.format("%s", e.getMessage()));
        }
    }
}
