import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the inmate details: ");
        String details = scanner.nextLine();
        
        String[] tokens = details.split(" ");
        String name = tokens[0];
        String status = tokens[1];
        String mealType = tokens[2];
        
        System.out.print("Enter the number of days: ");
        int days = scanner.nextInt();
        
        double perDayRate = mealType.equals("veg") ? 100 : 120;
        double totalBill = days * perDayRate;
        
        if (status.equals("employee")) {
            totalBill *= 1.05; 
        }
        
        System.out.println(totalBill);

        scanner.close();
    }
}
