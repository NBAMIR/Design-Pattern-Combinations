package facadeAccounts;

public class Admin implements Person
{
    private String name;
    public Admin(){
        System.out.println("New Admin created");
    }
    public void SetName(String x)
    {
        name=x;
        System.out.println("Name: "+name);
        System.out.println();
    }
}

