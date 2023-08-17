import java.util.*;

enum BusCategory {
    O, F, L
}

class Bus {
    int busNumber;
    String origin;
    String destination;
    int km;
    private BusCategory category;

    public Bus(int busNumber, String origin, String destination, int km, BusCategory category) {
        this.busNumber = busNumber;
        this.origin = origin;
        this.destination = destination;
        this.km = km;
        this.category = category;
    }

    public Bus(int busNumber, String origin, String destination, int km) {
        this(busNumber, origin, destination, km, BusCategory.O);
    }

    public int calculateFare() {
        switch (this.category) {
            case O:
                return 10 * this.km;
            case F:
                return 20 * this.km;
            case L:
                return 24 * this.km;
            default:
                return 0;
        }
    }

    public void display() {
        System.out.println(this.busNumber + " " + this.origin + " " + this.destination + " " + this.km + " " + this.category + " " + calculateFare());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Bus> buses = new ArrayList<>();
        while (true) {
            System.out.println("1-Add details\n2-Show details\n3-Exit");
            System.out.print("Enter choice ");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Enter bus details(Busno,from,to,distance,type)");
                int busNumber = sc.nextInt();
                String origin = sc.next();
                String destination = sc.next();
                int km = sc.nextInt();
                String categoryStr = sc.nextLine().trim();
                BusCategory category = BusCategory.O;
                if (!categoryStr.isEmpty()) {
                    category = BusCategory.valueOf(categoryStr);
                }
                buses.add(new Bus(busNumber, origin, destination, km, category));
            } else if (choice == 2) {
                System.out.println("Bus Details (Busno,from,to,distance,type,fare)");
                for (Bus bus : buses) {
                    bus.display();
                }
            } else if (choice == 3) {
                break;
            }
        }
    }
}
