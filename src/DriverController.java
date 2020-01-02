import java.util.Scanner;

public class DriverController {



    public static void main(String[] args) {



     /* 2. Driver Controller
    * I want to be able to put car on P mode, D mode, N mode, R mode
    * If i am on P mode and parking type is parallel then i can park between two cars
    * If i am on D mode I can put drive type to Snow type, Sport Type or Regular type
    * If i am on N mode i can put car in car wash station
    * If i am on R mode I can only reverse the car and car will activate back camera
    * If mode is incorrect then print me invalid mode type, please check your car mode
    * */


                Scanner input = new Scanner(System.in);

                //initialization
                String mode = null;
                String parkingType = null;
                String driveType = null;

                System.out.println("Enter mode: ");
                mode = input.nextLine();

                System.out.println("Enter parking type: ");
                parkingType = input.nextLine();

                if(mode.equalsIgnoreCase("P") && parkingType.equalsIgnoreCase("Parallel")){

                    System.out.println("Park between two cars");
                }
                else if(mode.equalsIgnoreCase("D")){

                    System.out.println("Enter drive type: ");
                    driveType = input.nextLine();

                    if(driveType.equalsIgnoreCase("Snow")){

                        System.out.println("Drive is set to snow");
                    }
                    else if(driveType.equalsIgnoreCase("Sport")){

                        System.out.println("Drive is set to sport");
                    }
                    else if(driveType.equalsIgnoreCase("Regular")){

                        System.out.println("Drive is set to regular");
                    }
                    else {

                        System.out.println("No drive type is set");
                    }
                }
                else if(mode.equalsIgnoreCase("N")){

                    System.out.println("Car in car wash station");
                }
                else if(mode.equalsIgnoreCase("R")){

                    System.out.println("Reverse the car");
                    System.out.println("Activate the back camera");
                }
                else {

                    System.out.println("Your mode " + mode + " is invalid");
                    System.out.println("please check your car mode");
                }
            }

        }









