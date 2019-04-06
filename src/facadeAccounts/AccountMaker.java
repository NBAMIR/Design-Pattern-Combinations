package facadeAccounts;

public class AccountMaker
{
    Person admin;
    Person outsider;
    Person student;
    
    public AccountMaker(){
        System.out.println("Account Maker initialized \n");
    }

    public Person makeAdmin(String name)
    {
        admin = new Admin();
        admin.SetName(name);
		return admin;
    }

    public Person makeStudent(String name)
    {
        student = new Student();
        student.SetName(name);
		return student;
    }
    
    public Person makeOutsider(String name)
    {
        outsider = new Outsider();
        outsider.SetName(name);
		return outsider;
    }
}