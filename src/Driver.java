
import java.util.Scanner;
public class Driver extends User {
    public Driver(int user_id,String name) {
              super(user_id,name);
    }
    public boolean AcceptOrRejectOrder(Order order)
    {
        
        // Simulate driver interaction
        Scanner scanner = new Scanner(System.in);
        System.out.println("Driver: " + name);
        System.out.println("Received Order Details:");
        System.out.println("Number of Seats: " + order.getNumSeats());
        System.out.println("Current Location: " + order.getCurrentLocation().getAdress());
        System.out.println("Destination: " + order.getDestinationLocation().getAdress());

        System.out.print("Accept the order? (yes/no): ");
        String response = scanner.nextLine();

        scanner.close();

        return response.equalsIgnoreCase("yes");
    
    }
    
    
    
    // +cancellationMassage( ):void
//ممكن تنعمل  لو تعاملت مع اوبجت اوردر يصير كانه فلاق

    
}