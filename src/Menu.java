public class Menu {

        /* 1.
         Menu
         boolean isGuestOneVegan = true;
         boolean isGuestTwoVegan = true;
         Are both vegan? only offer up vegan dishes.
         At least one vegan? make sure offer up some vegan options.
         Else, offer anything on the menu */


    public static void main(String[] args) {


        boolean isGuestOneVegan = true;
        boolean isGuestTwoVegan = true;
        if (isGuestOneVegan && isGuestTwoVegan) {

            System.out.println("Only offer vegan dishes");

        } else if (isGuestOneVegan || isGuestTwoVegan) {
            System.out.println("make sure to offer some vegan options");

        } else {

            System.out.println("Offer anything on the menu");
        }

    }
}
