public class Rides
{
    //Instance variables
    private String rideName;
    private int rating;
    private int waitTime;

    //Constructor
    public Rides (String rideName, int rating, int waitTime)
    {
        this.rideName = rideName;
        this.rating = rating;
        this.waitTime = waitTime;
    }
    //Getters
    public String getRideName()
    {
        return rideName;
    }
    public int getRating()
    {
        return rating;
    }
    public int getWaitTime()
    {
        return waitTime;
    }
    //Setters
    public void setRideName(String newRideName)
    {
        rideName = newRideName;
    }
    public void setRating(int newRating)
    {
        rating = newRating;
    }

    public void setWaitTime(int newWaitTime)
    {
        waitTime = newWaitTime;
    }
    //toString
    public String toString()
    {
        String output;
        output = "Ride name: " + rideName + "\nRatings(out of 5): " + rating + "\nWait Time: " + waitTime + " minutes";
        return output;
    }
}
