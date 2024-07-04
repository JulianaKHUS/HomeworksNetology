import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class Manicure {
    public static void main(String[] args) {
        List<String> firstClients = List.of("Anya", "Sveta", "Olya", "Alexandra", "Ruslana", "Olesya", "Vika");
        Queue<String> clients = new ArrayDeque<>(firstClients);

        System.out.println("Порядок приема клиентов: ");
        while (!clients.isEmpty()) {
            String client = clients.poll();
            System.out.printf("%s сделал новый маникюр\n", client);
            if (Math.random() < 0.5) {
                clients.offer("friend of" + client);

            }
        }

    }
}
