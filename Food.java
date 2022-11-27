/**
 * ACS-1903 Lab 10 Q7
 * @author (enter your name and student number)
 */
public class Food{
    // fields
    private String name;
    private int calories;
    
    // Q8
    private int foodId;
    private static int lastId = 201;

    // constructors
    public Food(){
        name = "Unknown";
        calories = 0;
        foodId = getNextId();
    }// end no-arg
    
    public Food(String name, int calories){
        this.name = name;
        this.calories = calories;
        foodId = getNextId();
    }// end full arg
    
    // getters
    public String getName(){
        return name;
    }
    
    public int getCalories(){
        return calories;
    }
    
    public int getFoodId(){
        return this.foodId;
    }
    
    // setters
    public void setName(String n){
        this.name = n;
    }
    
    public void setCalories(int c){
        this.calories = c;
    }

    // other methods
    private int getNextId(){
        return lastId++;
    }
    
    @Override
    public String toString(){
        return this.foodId + ": " + this.name + ", " + this.calories;
    }


}
