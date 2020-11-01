package structural.proxy;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        DBExecutorProxy dbForAdmin = new DBExecutorProxy("admin");
        dbForAdmin.executeDBQuery("DELETE");
        
        DBExecutorProxy dbForUser = new DBExecutorProxy("non-admin");
        dbForUser.executeDBQuery("HELLO");
        dbForUser.executeDBQuery("DELETE"); //Exception is raised here
    }
}
