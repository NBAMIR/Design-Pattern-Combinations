package facadeAccounts;

public class Outsider implements Person
{
    private String name;
    public Outsider(){
        System.out.println("New Outsider created");
    }
    public void SetName(String x)
    {
        name=x;
        System.out.println("Name: "+name);
        System.out.println();
    }
}
