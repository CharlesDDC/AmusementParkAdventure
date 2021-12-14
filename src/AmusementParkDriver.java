//Charles Dela Cruz
//12/12/21
//Semester 1 Final Project
import java.util.ArrayList;
import java.util.Scanner;

public class AmusementParkDriver implements ColorInterface
{
    public static void main(String [] args)
    {
        //Setting up Scanner and Array List
        ArrayList<String> foodMenuOrder = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        //Variables to use scanner on
        String start,rides, orderMore, end;


        System.out.println(" __  __\n" +
                "                   __ [_|]'_|] __\n" +
                "                  [_|].-'-_-_'-._]\n" +
                "                _.'.'-.-''   '-.-'__\n" +
                "               [_|]-.'.  '   ' .'.-_]\n" +
                "              _/ /_/ '.'. ' ' .  .' -_\n" +
                "             [_|]_'    '.'_'_. .'  '._]\n" +
                "              |_|_| = = (.-_o) = = :-_'\n" +
                "             [_|] _    .//\\/_\\.    .-_]\n" +
                "               \\_\\_\\ .'//_//_\\\\'. .-.\n" +
                "               [_|]_`./.-/.-.-.\\_'-_]\n" +
                "                 '.'.-'-//__.\\.\\\\.'\n" +
                "                  [_|]-/.-_ .-[_\\\\\n" +
                "                   // // [_|]  \\.\\\\\n" +
                "             _____//_//_________\\.\\\\_____");
        System.out.println("<======Amusement Park======>");
        System.out.println("You enter the amusement park and you are hungry." +
                "\nYou see a food stand and everything there is $5."
                +"\nYou also notice that every ride has a long line."+
                "\nDo you go get some" + TEXT_RED + " 'food' " + TEXT_RESET + "or go on the " + TEXT_GREEN + "'rides'" + TEXT_RESET + "?");
        System.out.print(">");
        //Uses scanner in start
        start = scan.nextLine();
        //checks if rides is entered
        if (start.equalsIgnoreCase("rides") )
        {
            Rides rides1 = new Rides("DropTower", 5, 5);
            Rides rides2 = new Rides("Goliath", 3, 9);
            System.out.println("You decided to get food next time and go into the line for the rides");
            System.out.println("You see that there are two rides displayed.");
            System.out.println(rides1.toString());
            System.out.println(rides2.toString());
            System.out.println("Will you choose to ride the " + TEXT_RED + rides1.getRideName()+ TEXT_RESET + " or the " + TEXT_GREEN + rides2.getRideName() + TEXT_RESET + "?");
            System.out.print(">");
            rides = scan.next();
            if (rides.equalsIgnoreCase(rides1.getRideName()) || rides.equalsIgnoreCase(rides2.getRideName()))
            {
                System.out.println("You got on the " + rides + " and had enjoyed it a lot."
                        + "\nAfter the ride you thought that was enough for today and decided to go back home!"
                +"\nThe end!");
            }
        }//end if statement
        //else if statement to check if the user entered "food"
        else if (start.equalsIgnoreCase("food"))
        {
            System.out.println("You decide to go to the food stand to buy something to eat." +
                    "\nYou go in the waiting line and look at the menu." +
                    "\nThe menu has" +TEXT_RED + "'hotdogs'," + TEXT_RESET + TEXT_GREEN +  "'cheeseburgers'," + TEXT_RESET + " and " + TEXT_BLUE  + "'corndogs'" + TEXT_RESET +
                    "\nAfter looking at the menu, you hear the cashier call to you." +
                    "\nIt's your turn to order. What will you get?");
            System.out.print(">");
            //scans for the food order and adds it to ArrayList
            foodMenuOrder.add(scan.nextLine());
            System.out.println("Is that all you like to order?(Yes or No)");
            System.out.print(">");
            orderMore = scan.nextLine();
            //if statement to check if user is done ordering
            //nested if, else if and else
            if (orderMore.equalsIgnoreCase("yes"))
            {
                System.out.println("So your order will be a " + foodMenuOrder.get(0) + ".");
                Food foodOne = new Food(foodMenuOrder.get(0),5,3);
                System.out.println("You recieved the receipt on your phone");
                System.out.println(foodOne.toString());
                System.out.println("Please pay $" + foodOne.getPrice() + ".");
                //variable for how much you pay
                int payment;
                System.out.print(">");
                payment = scan.nextInt();
                if (payment > foodOne.getPrice())
                {
                    int change;
                    change = payment - foodOne.getPrice();
                    System.out.println("Here is your change!" + "\nYou recieved $" + change + " back!");
                    System.out.println("Here is your " + foodOne.getFoodName() + "!");
                }//end of else if statement
                else if (payment < foodOne.getPrice())
                {
                    int undercharge;
                    undercharge = foodOne.getPrice() - payment;
                    System.out.println("You underpayed by $" + undercharge + "!");
                    System.out.println("Please pay the rest!");
                    System.out.print(">");
                    payment = scan.nextInt() + undercharge;
                    while (undercharge < payment)
                    {
                        System.out.println("You underpayed by $" + undercharge + "!");
                        System.out.println("Please pay the rest!");
                        System.out.print(">");
                    }
                    System.out.println("Here is your " + foodOne.getFoodName() + "!");
                }//end of else if statement
                else
                {
                    System.out.println("Here is your " + foodOne.getFoodName());
                }//end else statement
                System.out.println("You eat your food and noticed that the line for the rides is shorter than what you saw last time."
                        + "\nWill you go on the 'rides' or go 'home'?");
                System.out.print(">");
                end = scan.next();
                //if and else if statement to check if user wants to go home or go to the rides.
                if (end.equals("home"))
                {
                    System.out.println("You decided that was enough for today and went home after a long day."+ "\nThe end!");
                }//end of if statement
                else if (end.equalsIgnoreCase("rides"))
                {
                    System.out.println("After eating you decide to go on the rides!");
                    System.out.println("You only see a 2 rides that are still open.");
                    System.out.println("You also see a board displays their information and what ratings they have.");
                    Rides rides1 = new Rides("DropTower",5,5);
                    Rides rides2 = new Rides("Goliath",3,9);
                    System.out.println(rides1.toString());
                    System.out.println();
                    System.out.println(rides2.toString());
                    System.out.println("Which ride do you end up going on?");
                    System.out.print(">");
                    end = scan.next();
                    if (end.equalsIgnoreCase(rides1.getRideName()) || end.equalsIgnoreCase(rides2.getRideName()))
                    {
                        System.out.println("You ended up going on the "+ end + " and enjoyed riding it!" +
                                "\nAfter the ride you ended up feeling nauseous." +
                                "\nYou ended up rushing to the nearest trash can to throw up and decided to go home afterwards" +
                                "\nThe end!");
                    }//end of if statement
                }//end else if statement
            }//end of if statement
            //nested if, else if and else statement inside an else if statement
            else if (orderMore.equalsIgnoreCase("No"))
            {
                System.out.println("What else do you want? There are " +TEXT_RED + "'cheeseburgers',"+ TEXT_RESET+ TEXT_RED + " 'corndogs', " + TEXT_RESET + " and " + TEXT_BLUE+ "'hotdogs'" + TEXT_RESET);
                System.out.print(">");
                foodMenuOrder.add(scan.next());
                System.out.println("So your order will be "  + foodMenuOrder.get(0) + " and " + foodMenuOrder.get(1) + "?");
                Food food1 = new Food(foodMenuOrder.get(0),5,3);
                Food food2 = new Food(foodMenuOrder.get(1),5,3);
                int price = food1.getPrice() + food2.getPrice();
                System.out.println("Your total will be $" + price);
                int payment;
                System.out.print(">");
                payment = scan.nextInt();
                if (payment > price)
                {
                    int change;
                    change = payment - price;
                    System.out.println("Here is your change");
                    System.out.println("You recieved $" + change +"!");
                }//end of if statement
                else if (payment < price)
                {
                 int underpay;
                 underpay = price - payment;
                 System.out.println("Please pay $" + underpay + "!");
                 System.out.print(">");
                 payment = scan.nextInt() + underpay;
                 while (payment < underpay)
                 {
                     System.out.println("Please pay $" + underpay + "!");
                     System.out.print(">");
                     payment = scan.nextInt() + underpay;
                 }
                }//end of else if statement
                else
                {
                 System.out.println("Thank you for ondering!");
                }
                System.out.println("Here is your " + foodMenuOrder.get(0) + " and " + foodMenuOrder.get(1) + "!");
                System.out.println("After you finished eating your food. You noticed the lines for the rides got shorter."
                + "\nDo you decidde to go " + TEXT_RED + "'home'" + TEXT_RESET + " or to go on the " + TEXT_GREEN + "'rides'" + TEXT_RESET + "?");
                System.out.print(">");
                end = scan.next();
                //if and else if statement to check if user wants to go home or go to the rides.
                if (end.equals("home"))
                {
                    System.out.println("You decided that was enough for today and went home after a long day."+ "\nThe end!");
                }//end of if statement
                else if (end.equalsIgnoreCase("rides")) {
                    System.out.println("After eating you decide to go on the rides!");
                    System.out.println("You only see a 2 rides that are still open.");
                    System.out.println("You also see a board displays their information and what ratings they have.");
                    Rides rides1 = new Rides("DropTower", 5, 5);
                    Rides rides2 = new Rides("Goliath", 3, 9);
                    System.out.println(rides1.toString());
                    System.out.println();
                    System.out.println(rides2.toString());
                    System.out.println("Which ride do you end up going on?");
                    System.out.print(">");
                    end = scan.next();
                    if (end.equalsIgnoreCase(rides1.getRideName()) || end.equalsIgnoreCase(rides2.getRideName())) {
                        System.out.println("You ended up going on the " + end + " and enjoyed riding it!" +
                                "\nAfter the ride you ended up feeling nauseous." +
                                "\nYou ended up rushing to the nearest trash can to throw up and decided to go home afterwards" +
                                "\nThe end!");
                    }//end of if statement
                }//end of else if statement
            }//end of else if
        }//end else if statement
    }//end Main method
}//end Main class
