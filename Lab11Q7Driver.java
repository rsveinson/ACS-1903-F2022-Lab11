/**
 * ACS-1903 Lab 11 Q7
 * Driver
 */
public class Lab11Q7Driver{
    public static void main(String[] args){
        Food burger = new Food("Burger", 1000);
        Food fries = new Food("Fries", 500);
        Food salad = new Food();

        // print the name and calories of the following objects
        System.out.println(burger);
        System.out.println(fries);
        
        // change some instance values
        salad.setName("Salad");
        salad.setCalories(150);
        
        // print using getters
        System.out.println("\nNew lunch item: " + salad.getName());
        System.out.println("Calories: " + salad.getCalories());
    }
}
