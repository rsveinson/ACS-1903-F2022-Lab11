/**
 * ACS-1903 Lab 11 Q8
 * Driver
 */
public class Lab11Q8Driver{
    public static void main(String[] args){
        Food burger = new Food("Burger", 1000);
        Food fries = new Food("Fries", 500);
        Food salad = new Food();

        // print using the updated toString()
        System.out.println(burger);
        System.out.println(fries);
        
        // print id using the getter
        System.out.println("Burger id: " + burger.getFoodId());
    }
}
