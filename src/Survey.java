public class Survey
{
    //instance variables
    private String question;
    //Survey question to send back to driver
    public Survey (String question)
    {
        this.question = question;
    }
    public String toString()
    {
        return question;
    }
}
