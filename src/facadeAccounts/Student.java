package facadeAccounts;

public class Student implements Person{
    private String name;
    public Student(){
        System.out.println("New Student created");
    }
    public void SetName(String x)
    {
        name=x;
        System.out.println("Name: "+name);
        System.out.println();
    }
}
