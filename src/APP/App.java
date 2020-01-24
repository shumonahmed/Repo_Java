package APP;


public class App {

    public static void main(String[] args) {
//        Restaurant user = new Restaurant(name);
//        user.availableSeats(250,150);
//        user.seatsParty(25);
//        user.removesParty(15);
//        user.openForServices("Kiangsi",250);
//        user.printSummary();

        Restaurant restaurant = new Restaurant("cafe", 20);
        restaurant.printRestaurantSummary();
        restaurant.seatParty(15);
        System.out.println(restaurant.isSeatAvailable(7));
        //After 20 min wait
        restaurant.removeParty(3);
        System.out.println(restaurant.isSeatAvailable(7));
        restaurant.seatParty(6);
        restaurant.printRestaurantSummary();


    }

}
