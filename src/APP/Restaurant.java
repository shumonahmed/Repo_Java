package APP;
//
///**
// * Set user attribute such as name, age, income, expense
// * 1. Create a method that gets accountSummary which includes, users name, Income, Expense, etc
// * 2. Create a method that gets account balance
// * 3. Create a method that sets userDetails such as name, age
// * 4. Create a method that sets expense
// * 5. Create a method that sets income
// * 6. Create a method that resets account balance which means sets amount to 0
// *
// */
///**
// * Create a restaurant class with attribute name, guestCapacity, guestCount
// * 1. Create a method that tells user if the seats are available
// * 2. Create a method that seatsParty
// * 3. Create a method that removesParty
// * 4. Create a method that allows host open for services by passing restaurant name/guestCapacity
// * 5. Create a method that printsRestaurantSummary
// */
public class Restaurant {
//
//
//    //Create a restaurant class with attribute name, guestCapacity, guestCount
//        private String name;
//        private int guestCapacity;
//        private double guestCount;
//
//        public Restaurant(String name, int guestCapacity){
//            this.name = name;
//            this.guestCapacity = guestCapacity;
//        }
//
//
//    public void printSummary() {
//            System.out.println("Name: " + name);
//            System.out.println("Guest Capacity: " + guestCapacity);
//            System.out.println("Guest Count: " + guestCount);
//
//        }
//        //1. Create a method that tells user if the seats are available
//        public boolean availableSeats(int partySize) {
//         int seatLeft = guestCapacity - guestCount;
//        return partySize <= seatLeft;
//        }
//
//        //2. Create a method that seatsParty
//        public void seatsParty(int partySize) {
//            guestCount = guestCount + partySize;
//        }
//        //3. Create a method that removesParty
//        public void removesParty(int partySize) {
//
//        guestCount = guestCount - partySize;
//        }
////        //4. Create a method that allows host open for services by passing restaurant name/guestCapacity
//        public void openForServices(String name, int guestCapacity) {
//            this.name = name;
//            this.guestCapacity = guestCapacity;
//        }
//
//
//        }
//
//
//
//
//

    private String name;
    private int guestCapacity;
    private int guestCount;
    public Restaurant(String name, int guestCapacity) {
        this.name = name;
        this.guestCapacity = guestCapacity;
    }
    public boolean isSeatAvailable(int partySize) {
        int seatsLeft = guestCapacity - guestCount;
        return partySize <= seatsLeft;
    }
    public void seatParty(int partySize) {
        guestCount = guestCount + partySize;
    }
    public void removeParty(int partySize) {
        guestCount = guestCount - partySize;
    }
    public void printRestaurantSummary(){
        System.out.println("Name: " + name + " Guest Capacity: " + guestCapacity + " GuestCount: " + guestCount);
    }
}
