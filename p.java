import java.util.*;
public class MovieTickets {
    public static String[][] create_movies() {
        String[][] Movies = {
                { "Avatar2", "A1","9"},
                { "The Good Doctor", "A2","8"},
                { "Den Of Thieves", "A3","7"},
                { "Wednesday", "A4","5"},
                { "Money Heist", "A5","10"},
                { "San Andreas", "B1","13"},
                { "Passengers", "B2","12"},
                { "G.I.Joe", "B3","15"},
                { "Red Notice", "B4","11"},
                { "Peaky Blinders", "B5","18"},
        };
        return Movies;
    }

    public static String[][] create_snacks_drinks() {
        String[][] snacks_drinks = {
            {"Popcorn", "5"},
            {"Soda", "3"},
            {"Candy", "2"},
            {"Nachos", "4"}
        };
        return snacks_drinks;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        String[][] Movies = create_movies();
        // Start interaction
        System.out.println("Wlecome To The AUM Cinema");
        System.out.println("Do you have an account? (yes/no)");
        String account = input.nextLine();
    if (account.equalsIgnoreCase("yes")) {
    System.out.println("Enter your User name:");
    String userName = input.nextLine();
    System.out.println("Enter your Password:");
    String enteredPassword = input.nextLine();
    String expectedPassword = "0000";
    if (enteredPassword.equals(expectedPassword)) {
        System.out.println("Sign in successful!");
    } else {
        System.out.println("Invalid username or password.");
    }
} else {
    System.out.println("Sign up");
System.out.println("Enter your First name:");
String firstName = input.nextLine();
System.out.println("Enter your Last name:");
String lastName = input.nextLine();
System.out.println("Enter your Gender: (Male/Female)");
String gender = input.nextLine();
if (gender.equalsIgnoreCase("male")) {
    System.out.println("Hello Mr. " + firstName);
} else if (gender.equalsIgnoreCase("female")) {
    System.out.println("Hello Mis. " + firstName);
} else {
    System.out.println("Something went wrong, please try again in a few minutes.");
}
System.out.println("Enter your Contact Number:");
int contactNumber = input.nextInt();
System.out.println("Enter Your Email:");
String Email = input.nextLine();
System.out.println("Enter your Password:");
String password = input.nextLine();
System.out.println("Confirm your Password:");
 String confirmPassword = input.nextLine();
while (!password.equals(confirmPassword)) {
    System.out.println("Passwords do not match. Please try again.");
    System.out.println("Enter your Password:");
    password = input.nextLine();
    System.out.println("Confirm your Password:");
    confirmPassword = input.nextLine();
}
System.out.println("Account created successfully!");

System.out.println("Enter your User name:");
String userName1 = input.nextLine();
System.out.println("Enter your Password:");
String enteredPassword1 = input.nextLine();
confirmPassword = enteredPassword1;
if (!enteredPassword1.equals(confirmPassword)) {
    System.out.println("Invalid username or password.");
    return;
}
System.out.println("Sign in successful!");

}
System.out.println("--------------");
// Get number of tickets
System.out.print("How many people are going to watch the movie? ");
int NumOfTickets = input.nextInt();
System.out.println("Which class do you want to choose? (0 for Economic Class , 1 for VIP Class 'It will add 5JD for Each Tickets' )");
int classChoice = input.nextInt();
int vipAddition = 5;
int ticketCost = 0 ;
switch(classChoice){
case 0:
System.out.println("You have chosen class Economic.");
ticketCost = NumOfTickets ;
break;
case 1:
System.out.println("You have chosen class VIP.");
ticketCost = NumOfTickets * vipAddition;
break;
default:
System.out.println("Invalid class choice. Please choose from 0 or 1.");
break;
}
System.out.println("Choose one of the following movies:");
int i = 1;
for (String[] movie : Movies) {
System.out.println(i + ": Name: " + movie[0] + " Theater: " + movie[1] + " Cost: " + movie[2] + " JD");
i++;
}
System.out.println("Enter the movie you want to watch: ");
int movieChoice = input.nextInt();
String[] selectedMovie = Movies[movieChoice-1];
System.out.println("You have selected: " + selectedMovie[0] + ", Theater: " + selectedMovie[1] + ", Cost: " + selectedMovie[2] + " JD");
int totalCost = ticketCost + Integer.parseInt(selectedMovie[2]);
System.out.println("Total cost: " + totalCost + " JD");
String[][] snacks_drinks = create_snacks_drinks();
System.out.println("Would you like to purchase any snacks or drinks? (yes/no)");
String purchase = input.nextLine();
if (purchase.equalsIgnoreCase("yes")) {
System.out.println("Here are the available snacks and drinks:");
for (int j = 0; j < snacks_drinks.length; j++) {
System.out.println((j+1) + ". " + snacks_drinks[j][0] + " - $" + snacks_drinks[j][1]);
}
System.out.println("Enter the snack or drink you want to purchase: ");
int snackChoice = input.nextInt();
String[] selectedSnack = snacks_drinks[snackChoice-1];
    System.out.println("You have selected: " + selectedSnack[0] + " Cost: " + selectedSnack[1] + " JD");
totalCost += Integer.parseInt(selectedSnack[1]);
System.out.println("Total cost including snacks and drinks: " + totalCost + " JD");
} else {
System.out.println("Total cost for movie tickets: " + totalCost + " JD");
}
System.out.println("Thank you for using our service, enjoy the movie!");
}
}