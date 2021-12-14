public class Food
{
    //Instance Variables
    private String foodName;
    private int price;
    private int waitTime;

    //Constructors
    public Food(String foodName, int price, int waitTime)
    {
        this.foodName = foodName;
        this.price = price;
        this.waitTime = waitTime;
    }

    //Getters
    public String getFoodName()
    {
        return foodName;
    }
    public int getPrice()
    {
        return price;
    }
    public int getWaitTime()
    {
        return waitTime;
    }
    //Setters

    public void setFoodName(String newFoodName)
    {
        foodName = newFoodName;
    }
    public void setPrice(int newPrice)
    {
        price = newPrice;
    }
    public void setWaitTime(int newWaitTime)
    {
        waitTime = newWaitTime;
    }

    //toString
    public String toString()
    {
        String output ="You ordered " + foodName +". Please wait " + waitTime + " minutes." +  "This will cost $" + price+ ".";
        return output;
    }
}
