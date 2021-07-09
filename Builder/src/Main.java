import java.lang.System;

public class Main {
    public static void main(String[] args) {
        try {
            Client client1 = new Client.ClientBuilder().clientId(101).clientName("Alex.").build();
            System.out.println(client1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            Client client2 = new Client.ClientBuilder().clientName("Alex.").build();
            System.out.println(client2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            Client client3 = new Client.ClientBuilder().clientId(383).clientName("Masha").departName("Regions").build();
            System.out.println(client3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
