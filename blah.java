import java.util.ArrayList;
import java.util.Scanner;
class blah {
    private static Scanner userInput = new Scanner(System.in);
    static String myName;
    static boolean methodLoop = false; //the while loop varialbe for all method while loops
    static int menuAnswer; //the static variable for all menu and submenu selections
    public static void main(String[]args) {
        int mainLoop = -1;
        //list of "tab" names that are used in the program edit to what you want
        String[] optionList = new String[] {"Products","Services","Tools","Support","Contact","Manage Inventory"};
        System.out.println("Welcome to Air-Crazed INC. where you can find everything you will ever need for your aircraft.");
        System.out.println("Please enter your name: ");
        myName = userInput.nextLine();

        while(mainLoop != 0) {
            methodLoop = false;
            System.out.println("Please enter the number of the menu you would like to enter " + myName + ": ");
            for(int i =0; i < optionList.length; i++) { //loop that displays all the indexes from theList array
                System.out.println((i +1) + " - " + optionList[i]);
            }//end for
            System.out.println("0 - Exit");
            System.out.println();

                menuAnswer = my_helper.getInt("Enter your choice here:");

                switch(menuAnswer) {
                    case 0:
                        System.out.println("Have a nice day");
                        mainLoop = 0; //setting mainLoop to 0 to exit the program
                        break;
                    case 1:
                        showProduct();
                        break;

                    case 2:
                        showServices();
                        break;
                    case 3:
                        showTools();
                        break;
                    case 4:
                        showSupport();
                        break;
                    case 5:
                        showContact();
                        break;
                    case 6:
                        manageInventory();
                        break;

                }// end switch

        }//end while

    }//end main

    //method that shows all the products offered by the business
    private static void showProduct() {
        String[] products = new String[]{"Business Jet", "Seaplane", "Taildragger", "Tiltrotor", "Turboprop","Helicopter","Glider","Ultralight","Single-engine Piston", "Stunt Plane"};
        while(!methodLoop) {
            System.out.println("\nSelect one of the following: ");
            System.out.println("1 - View Product List");
            System.out.println("2 - Use product selection tool");
            System.out.println("0 - Back");
            menuAnswer = my_helper.getInt("Enter your choice here: ");
            if(menuAnswer == 0) {
                methodLoop = true;
            }
            else if(menuAnswer == 1) {
                System.out.println("Our list of products: ");
                for(int i = 0; i < products.length; i++) {
                    System.out.println(products[i]);
                }
            }
            else if(menuAnswer == 2) {
                selectionTool();
            }
            else {
                System.out.println("That is an invalid option");
            }
        }
    }//end showProduct()
    //method that shows what services are offered by the business, more can be added/removed as needed
    private static void showServices() {
        String[] services = new String[] {"Repair Service", "Relocation Service"};
        while(!methodLoop) {
            System.out.println("Welcome to the Services Tab");
            System.out.println("What can we do for you today?");
            for(int i = 0; i < services.length; i++) {
                System.out.println((i + 1) + " - " + services[i]);
            }
            System.out.println("0 - Back");
            menuAnswer = my_helper.getInt("Enter your choice here: ");

            if(menuAnswer == 0) {
                methodLoop = true;
            }
            else if(menuAnswer == 1) {
                System.out.println("You have selected our repair service!");
                System.out.println("Please enter what is wrong with your plane/helicopter in the following space");
                userInput.nextLine();
                System.out.println("Thank you, your repair request has been sent to our technician");

            }
            else if(menuAnswer == 2) {
                System.out.println("Thank you for choosing our aircraft relocation service where we move your aircraft for free if you bought it from us!");
                System.out.println("Where would you like it moved to? Please enter in the space below.");
                userInput.nextLine();
                System.out.println("Thank you! One of our pilots will contact you within 24hrs to have your aircraft moved to your desired location");
            }
            else {
                System.out.println("That is an invalid option");
            }

        }
    }//end Services
    //tools that dont actually do anything but are more for show and fun can be removed if necessary
    private static void showTools() {
        String[] tools = new String[] {"Remote Repairs Tool", "Remote Refueling Tool"};
        while(!methodLoop) {
            System.out.println("Welcome to the Tools tab!");
            System.out.println("These are the tools that we offer: ");
            for(int i = 0; i < tools.length; i++) {
                System.out.println((i + 1) + " - " + tools[i]);
            }
            System.out.println("0 - Back");
            menuAnswer = my_helper.getInt("Enter your choice here: ");
            if(menuAnswer == 0) {
                methodLoop = true;
            }
            else if(menuAnswer == 1) {
                System.out.println("Please enter the location of where you need repairs in the space below: ");

                userInput.nextLine();
                System.out.println("Thank you a repair truck will be sent out shortly.");
            }
            else if(menuAnswer == 2) {
                System.out.println("Please enter the location of where you need a fuel truck to be sent in the space below: ");

                userInput.nextLine();
                System.out.println("Thank you a fuel truck will be sent out shortly");
            }
            else {
                System.out.println("That is an invalid option");
            }
        }
    }//end Tools
    //support that doesn't actually exist and more for show again, since the business is made up there is no actual support staff
    private static void showSupport() {
        while(!methodLoop) {
            String[] support = new String[] {"Troubleshooting", "Our wiki"};
            System.out.println("Welcome to the support page!");
            for(int i = 0; i < support.length; i++) {
                System.out.println((i + 1) + " - " + support[i]);
            }
            System.out.println("0 - Back");
            System.out.println("What would you like to access: ");
            menuAnswer = my_helper.getInt("Enter your choice here: ");
            if(menuAnswer == 0) {
                methodLoop = true;
            }
            else if(menuAnswer == 1) {
                System.out.println("Enter the issue below and we will see if we can help you: ");
                userInput.nextLine();
                System.out.println("Sorry that issue does not match our database");
            }
            else if(menuAnswer == 2) {
                System.out.println("Connecting to wiki");
                for(int y = 0; y <=4; y++) {
                    System.out.println("...");
                }
                System.out.println("Connection failed");

            }
            else {
                System.out.println("That is an invalid option");
            }
        }
    }//end Support
    //a method for storing/calling for the contact information of the made up business
    private static void showContact() {
        String[][] contactStuff = new String[][] {{"Email", "Phone-number"},
                {"Air-Crazed@aircrazedinc.com", "410-729-2249"}};
        while(!methodLoop) {
            System.out.println("Welcome to our contact page!");
            System.out.println("How would you like to contact us?");
            for(int i = 0; i < contactStuff[0].length; i++) {
                System.out.println((i +1 ) +" - " +  contactStuff[0][i]);
            }
            System.out.println("0 - Back");
            menuAnswer = my_helper.getInt("Enter your choice here: ");
            if(menuAnswer == 0) {
                methodLoop = true;
            }
            else if(menuAnswer == 1) {
                System.out.println("Our email is: " + contactStuff[1][0]);
            }
            else if(menuAnswer == 2) {
                System.out.println("Our phone number is: " + contactStuff[1][1]);
            }
            else {
                System.out.println("That is an invalid option");
            }
        }
    }//end Contact
    //the tool that helps the user select a plane based on their usage and answers to the questions
    static int answer;
    private static void selectionTool() {
        //array that store all the possible options along with all the prices for each in a seperate array
        //all prices in the price array correspond to each index in the products array
        String[] products = new String[]{"Business Jet", "Seaplane", "Taildragger", "Tiltrotor", "Turboprop","Helicopter","Glider","Ultralight","Single-engine Piston", "Stunt Plane"};
        int[] price = new int[] {800000, 600000, 500000, 700000, 650000, 350000, 150000, 200000, 150000, 300000};
        int totalPrice = 0;
        String finalSelection = "";
        System.out.println("\nOk " + myName + " we will help you select your plane based on use! Please type what you see inside of () it is not case sensitive. Are you ready to continue? (1 - Yes or 2 - No)");
        answer = my_helper.getInt("Enter your choice here: ");
        while(answer==1) {
            System.out.println("Are you using this plane for business and/or luxerious travel? (1 - Yes or 2 - No)");
            answer = my_helper.getInt("Enter your choice here: ");
            if(answer==1) {
                System.out.println("The best suggestion is now the Business Jet option.");
                totalPrice = price[0]; //sets the price to the correct index in the price array
                finalSelection = products[0]; //sets the selected product to the correct index in the products array

            }
            else {
                System.out.println("Will you be taking off and landing in water? (1 - Yes or 2 - No)");
                answer = my_helper.getInt("Enter your choice here: ");
                if(answer==1) {
                    System.out.println("The best suggestion is now the Seaplane option.");
                    totalPrice = price[1];
                    finalSelection = products[1];

                }
                else {
                    System.out.println("Will you be taking off or be towed into the air? (1 - Take Off or 2 - Towed)");
                    answer = my_helper.getInt("Enter your choice here: ");
                    if(answer==2) {
                        System.out.println("The best suggestion is now the Glider option.");
                        totalPrice = price[6];
                        finalSelection = products[6];

                    }
                    else if(answer==1) {
                        System.out.println("Is the airstrip long or short? (1 - Long or 2 - Short)");
                        answer = my_helper.getInt("Enter your choice here: ");
                        if(answer==2) {
                            System.out.println("The best suggestion is now a Turboprop.");
                            totalPrice = price[4];
                            finalSelection = products[4];

                        }
                        else if(answer==1) {
                            System.out.println("Is the airstrip paved or not paved? (1 - Paved or 2 - Not)");
                            answer = my_helper.getInt("Enter your choice here: ");
                            if(answer==2) {
                                System.out.println("The best suggestion is now a Taildragger.");
                                totalPrice = price[2];
                                finalSelection = products[2];

                            }
                            else if(answer==1) {
                                System.out.println("Are you landing in a remote location? (1 - Yes or 2 - No)");
                                answer = my_helper.getInt("Enter your choice here: ");
                                if(answer==1) {
                                    System.out.println("The best option is now a Tiltroter.");
                                    totalPrice = price[3];
                                    finalSelection = products[3];

                                }
                                else {
                                    System.out.println("Will you be using this plane for stunts? (1 - Yes or 2 - No)");
                                    answer = my_helper.getInt("Enter your choice here: ");
                                    if(answer==1) {
                                        System.out.println("The best option is now the Stunt Plane");
                                        totalPrice = price[9];
                                        finalSelection = products[9];

                                    }
                                    else {
                                        System.out.println("Are you SEL certified? (1 - Yes or 2 - No)");
                                        answer = my_helper.getInt("Enter your choice here: ");
                                        if(answer==1) {
                                            System.out.println("The best option is now the Single-Engine Piston.");
                                            totalPrice = price[8];
                                            finalSelection = products[8];

                                        }
                                        else {
                                            System.out.println("Are you going a long or short distance? (1 - Short or 2 - Long)");
                                            answer = my_helper.getInt("Enter your choice here: ");
                                            if(answer==2) {
                                                System.out.println("The best option is now an Ultralight.");
                                                totalPrice = price[7];
                                                finalSelection = products[7];

                                            }
                                            else if(answer==1) {
                                                System.out.println("The best option is now a helicopter.");
                                                totalPrice = price[5];
                                                finalSelection = products[5];

                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            System.out.println("Would you like to buy the default package or the package that comes with extra fuel(+$25,000)? (1 - Default or 2 - Fuel)");
            answer = my_helper.getInt("Enter your choice here: ");
            while(answer != 1 && answer!= 2) {
                System.out.print("That is not a valid option please try again: ");
                answer  = my_helper.getInt("\nEnter your choice here: ");
            }
            if(answer == 1) {
                System.out.println("You chose: " + finalSelection);
                System.out.printf("%s %s %,d","Your total comes to: ","$",totalPrice);
                break;
            }
            else if(answer == 2) {
                totalPrice = totalPrice + 25000;
                System.out.println("You chose: " + finalSelection);
                System.out.printf("%s %s %,d","Your total comes to: ","$",totalPrice);
                break;
            }
        }
    }//end Tool
    //the method that allows the "manager" to go in and edit the inventory of planes password is "Password1"
    private static final String password = "Password1";
    private static void manageInventory() {
        while(!methodLoop) {
            System.out.println("Enter the password: ");
            System.out.println("0 - Go Back");
            String guessPassword = my_helper.getString("");
            if(guessPassword.equalsIgnoreCase("0")) {
                methodLoop = true;
            }
            else if(guessPassword.equals(password)) {
                //five planes added by default
                Planes.planesList.add(new Planes("Red", 8, "AF3D",250000, 100000,"Boeing"));
                Planes.planesList.add(new Planes("Orange", 4, "YU78",750000, 300000,"Piaggio"));
                Planes.planesList.add(new Planes("Green", 8, "OI87",300000, 150000,"Gulfstream"));
                Planes.planesList.add(new Planes("Blue", 12, "PL89",400000, 300000,"Airbus"));
                Planes.planesList.add(new Planes("Blue", 20, "US17",950000, 500000,"Cesna"));
                methodLoop = true;
                boolean nextLoop = false;
                while(!nextLoop) {
                    System.out.println("Select one of the following:");
                    System.out.println("1 - Add item to inventory");
                    System.out.println("2 - Remove item from inventory");
                    System.out.println("3 - Show inventory");
                    System.out.println("4 - Edit inventory");
                    System.out.println("5 - Search");
                    System.out.println("0 - Go back");
                    int answer = my_helper.getInt("");
                    if(answer == 0) {
                        nextLoop = true;
                    }
                    else if(answer == 1) {
                        Planes.planesList.add(new Planes() );
                    }
                    else if(answer == 2) {
                        boolean newloop = false;
                        while(!newloop) {
                            System.out.println("Which item are you going to remove: ");
                            for(int i = 0; i < Planes.planesList.size(); i++) {
                                System.out.print("Plane " + (i+1) + " - " );
                                System.out.print(Planes.planesList.get(i).returnColor());
                                System.out.print(" " + Planes.planesList.get(i).returnManufacturer());
                                System.out.print(" " + Planes.planesList.get(i).returnCall());
                                System.out.println();
                            }
                            System.out.println("0 - Go back");

                            int newAnswer = my_helper.getInt("Enter your choice here: ");
                            if(newAnswer == 0) {
                                newloop = true;
                            }
                            else if(newAnswer > 0 && newAnswer < Planes.planesList.size()) {
                                Planes.planesList.remove(newAnswer - 1);
                                System.out.println("Item removed");
                            }
                        }

                    }
                    else if(answer == 3) {
                        for(int i = 0; i < Planes.planesList.size(); i++) {
                            System.out.println("Plane " + (i+1) + " :");
                            Planes.planesList.get(i).showPlane();
                            System.out.println();

                        }
                    }
                    else if(answer ==4) {
                        boolean newLoop = false;
                        while(!newLoop) {
                            System.out.println("Which plane will you be editing? ");
                            for(int i = 0; i < Planes.planesList.size(); i++) {
                                System.out.println("Plane " + (i+1) + " :");
                                Planes.planesList.get(i).showPlane();
                                System.out.println();
                            }
                            System.out.println("0 - Go back");
                            int theAnswer = my_helper.getInt("Enter your choice here: ");

                            if(theAnswer == 0) {
                                newLoop = true;
                            }
                            else if(theAnswer > 0 && theAnswer < Planes.planesList.size()) {
                                Planes.planesList.get(theAnswer - 1).Edit();
                            }

                        }
                    }
                    else if(answer ==5) {
                        Planes.Search();
                    }
                }
            }
            else {
                System.out.println("Incorrect password");
            }
        }
    }//end Manage


}//end class


class Planes{
    protected static ArrayList<Planes> planesList = new ArrayList<>();
    private String planeColor = "";
    private int totalSeats;
    private String callSign = "";
    private double planePrice;
    private int carryingCapacity;
    private String manufacturer = "";

    private static String[] colorArray = new String[] {"Red","Orange","Green","Blue"};
    private static int[] seatNumberArray = new int[] {4, 8, 12, 20};

    //method that allows for the assignment of values to the encapsulated variables
    private void addPlane() {
        setColor();
        manufacturer = my_helper.getString("Please enter the manufacturer: ");
        setSeats();
        callSign = my_helper.getString("Callsign: ");
        planePrice = my_helper.getInt("Enter price: ");
        carryingCapacity = my_helper.getInt("Enter carrying capacity: ");
        System.out.println("Plane Added");


    }//end Add

    protected void showPlane() {
        System.out.println("Color: " + planeColor);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Total Seats: " + totalSeats);
        System.out.println("Callsign: " + callSign);
        System.out.printf("Total Price: $%,.2f %n", planePrice);
        System.out.printf("Carrying Capacity: %,d lbs",carryingCapacity);
        System.out.println();

    }//end Show

    protected void Edit() {

        System.out.println("What would you like to change " + this.planeColor + " to?");
        this.planeColor = my_helper.getString("Enter the new value here: ");
        System.out.println("What would you like to change " + this.manufacturer + " to?");
        this.manufacturer = my_helper.getString("Enter the new value here: ");
        System.out.println("What would you like to change " + this.totalSeats + " to?");
        this.totalSeats = my_helper.getInt("Enter the new value here: ");
        System.out.println("What would you like to change " + this.callSign + " to?");
        this.callSign = my_helper.getString("Enter the new value here: ");
        System.out.println("What would you like to change " + this.planePrice + " to?");
        this.planePrice = my_helper.getInt("Enter the new value here: ");
        System.out.println("What would you like to change " + this.carryingCapacity + " to?");
        this.carryingCapacity = my_helper.getInt("Enter the new Value here: ");

    }//end Edit
    protected String returnColor() {
        return this.planeColor;
    }

    protected String returnManufacturer() {
        return this.manufacturer;
    }
    protected String returnCall() {
        return this.callSign;
    }

    //constructor for adding planes where user entry is required
    public Planes() {
        this.addPlane();
    }
    //constructor for adding new planes with pre-assigned attributes, no entries from user
    public Planes(String theColor, int theSeats, String theSign, double thePrice, int theCapacity, String theManufacturer) {
        planeColor = theColor;
        totalSeats = theSeats;
        callSign = theSign;
        planePrice = thePrice;
        carryingCapacity = theCapacity;
        manufacturer = theManufacturer;

    }
    //search method for searching by certain attributes that can be changed
    protected static void Search() {

        int selection=-1;
        int searchInt;
        String searchTerm;


        while(selection!=0) {
            System.out.println("What would you like to search?");
            System.out.println("1 - Color");
            System.out.println("2 - Manufacturer");
            System.out.println("3 - Number of Seats");
            System.out.println("4 - Callsign");
            System.out.println("5 - Price");
            System.out.println("6 - Carrying Capacity");
            System.out.println("0 - Go Back");

            selection = my_helper.getInt("Enter your choice here: ");

            switch(selection) {
                case 0:
                    break;
                case 1:
                    searchTerm = my_helper.getString("Enter the color you would like to search for: ");
                    for(int i = 0; i < planesList.size(); i++) {
                        if(planesList.get(i).planeColor.equalsIgnoreCase(searchTerm)) {
                            planesList.get(i).showPlane();
                            System.out.println();


                        }
                    }
                    break;
                case 2:
                    searchTerm = my_helper.getString("Enter the manufacturer you would like to search for: ");
                    for(int i = 0; i < planesList.size(); i++) {
                        if(planesList.get(i).manufacturer.equalsIgnoreCase(searchTerm)) {
                            planesList.get(i).showPlane();
                            System.out.println();

                        }
                    }
                    break;
                case 3:
                    searchInt = my_helper.getInt("Enter the number of seats you are searching for: ");
                    for(int i = 0; i < planesList.size(); i++) {
                        if(planesList.get(i).totalSeats == searchInt) {
                            planesList.get(i).showPlane();
                            System.out.println();

                        }
                    }
                case 4:
                    searchTerm = my_helper.getString("Enter the callsign you are searching for: ");
                    for(int i = 0; i < planesList.size(); i++) {
                        if(planesList.get(i).callSign.equalsIgnoreCase(searchTerm)) {
                            planesList.get(i).showPlane();
                            System.out.println();

                        }
                    }
                    break;
                case 5:
                    searchInt = my_helper.getInt("Enter the price you are searching for: ");
                    for(int i = 0; i < planesList.size(); i++) {
                        if(planesList.get(i).planePrice == searchInt) {
                            planesList.get(i).showPlane();
                            System.out.println();


                        }
                    }
                    break;
                case 6:
                    searchInt = my_helper.getInt("Enter the carrying capacity you are searching for: ");
                    for(int i = 0; i < planesList.size(); i++) {
                        if(planesList.get(i).carryingCapacity == searchInt) {
                            planesList.get(i).showPlane();
                            System.out.println();


                        }
                    }
                    break;
                default:
                    System.out.println("Invalid selection");

            }
        }
    }

    protected void setColor() {
        boolean validColor = false;
        while(!validColor) {
            System.out.println("Please select one of the following");
            for(int i = 0; i < colorArray.length; i++) {
                System.out.println((i+1) + " - " + colorArray[i]);
            }
            int selection = my_helper.getInt("Please enter your selection here: ") - 1;
            if(selection >= 0 && selection < colorArray.length) {
                planeColor = colorArray[selection];
                validColor = true;
            }
            else {
                System.out.println("That is not a valid option");
            }

        }
    }

    protected void setSeats() {
        boolean validSeat = false;
        while(!validSeat) {
            System.out.println("Please select one of the following seating options");
            for(int i = 0; i < seatNumberArray.length; i++) {
                System.out.println((i+1) + " - " + seatNumberArray[i]);
            }
            int selection = my_helper.getInt("Please enter your selection here: ") - 1;
            if(selection >= 0 && selection < seatNumberArray.length) {
                totalSeats = seatNumberArray[selection];
                validSeat = true;
            }
            else {
                System.out.println("That is not a valid option");
            }

        }
    }

}

