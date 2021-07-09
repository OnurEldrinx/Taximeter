import java.util.Scanner;

public class Taximeter {
    public static void main(String[] args){

        Scanner keyboard =new Scanner(System.in);

        float pricePerKM   = 2.2F;
        float openingPrice = 10F;
        float totalPrice;
        float distance;

        System.out.print("How many kilometers do you want to go: ");
        distance = keyboard.nextFloat();

        totalPrice = openingPrice + (distance*pricePerKM);


        totalPrice = (totalPrice<20) ? 20:totalPrice; // Minimum price is 20 TL.

        System.out.println("Distance     : " + distance + " km");
        System.out.println("Opening      : " + openingPrice + " TL");
        System.out.println("Price per km : " + pricePerKM + " TL");
        System.out.println("Total Price  : " + totalPrice);


    }
}
