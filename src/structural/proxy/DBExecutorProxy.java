package structural.proxy;


public class DBExecutorProxy implements DatabaseExecutor
{
    Boolean isAdmin;
    DBExecutorImplementation dbExecutor;
    
    DBExecutorProxy(String user){
        isAdmin = user.toLowerCase().equals("admin");
        dbExecutor = new DBExecutorImplementation();
    }
    @Override
    public void executeDBQuery(String query) throws Exception
    {
        if(isAdmin){
            dbExecutor.executeDBQuery(query);
        }
        else{
            if(query.contains("DELETE")){
                throw new Exception("Delete is not possible as user is not admin");
            }
            else{
                dbExecutor.executeDBQuery(query);
            }
        }
        
    }
}
