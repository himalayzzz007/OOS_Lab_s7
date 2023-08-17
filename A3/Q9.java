import java.util.*;

class Film {
    private String title;
    private boolean rented;

    public Film(String title) {
        this.title = title;
        this.rented = false;
    }

    public String getTitle() {
        return title;
    }

    public boolean isRented() {
        return rented;
    }

    public void rent() {
        rented = true;
    }

    public void returnFilm() {
        rented = false;
    }
}

class VideoRental {
    private HashMap<String, Film> films;

    public VideoRental() {
        films = new HashMap<>();
    }

    public void addFilm(String title) {
        films.put(title, new Film(title));
    }

    public boolean checkAvailability(String title) {
        if (!films.containsKey(title)) {
            return false;
        }
        return !films.get(title).isRented();
    }

    public void rentFilm(String title) {
        if (checkAvailability(title)) {
            films.get(title).rent();
        }
    }

    public void returnFilm(String title) {
        if (films.containsKey(title)) {
            films.get(title).returnFilm();
        }
    }

    public void listAvailableFilms() {
        for (Film film : films.values()) {
            if (!film.isRented()) {
                System.out.println(film.getTitle());
            }
        }
    }
}

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VideoRental rental = new VideoRental();

        while (true) {
            System.out.println("1. Add film\n2. Check availability\n3. Rent a film\n4. Return\n5. List available films\n6. Exit");
            System.out.print("Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Number of films: ");
                int n = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Titles: ");
                for (int i = 0; i < n; i++) {
                    String title = scanner.nextLine();
                    rental.addFilm(title);
                }
            } else if (choice == 2) {
                System.out.print("Title: ");
                String title = scanner.nextLine();
                if (rental.checkAvailability(title)) {
                    System.out.println("Available");
                } else {
                    System.out.println("Not Available");
                }
            } else if (choice == 3) {
                System.out.print("Title: ");
                String title = scanner.nextLine();
                rental.rentFilm(title);
            } else if (choice == 4) {
                System.out.print("Title: ");
                String title = scanner.nextLine();
                rental.returnFilm(title);
            } else if (choice == 5) {
                rental.listAvailableFilms();
            } else if (choice == 6) {
                break;
            }
        }

        scanner.close();
    }
}
