public class Player
{
    private String name;
    private int balance;

    public Player(String n, int b)
    {
        name = n;
        balance = b;
    }
    

    public void setName(String n)
    {
        name = n;
    }

    public String getName()
    {
        return name;
    }
    

    public void setBalance(int b) 
    {
        balance = b;
    }

    public int getBalance() 
    {
        return balance;
    }

}