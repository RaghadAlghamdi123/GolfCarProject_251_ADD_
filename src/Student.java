class Student extends User {

    public Student(int user_id, String name)
    {
        super(user_id, name);
        
    }

    public void cancelOrder() {
    }
    
    public Order requestGolfCar(Location currentLocation, Location destinationLocation, int numSeats) {
        currentLocation = currentLocation;
        destinationLocation = destinationLocation;
        numSeats = numSeats;
        Order newOreder= new Order( currentLocation,  destinationLocation,  numSeats);
        return newOreder;
    }

 
    
    
}
   
 
    
    
   
    
    
