package structural.proxy;

class DBExecutorImplementation implements DatabaseExecutor
{
    @Override
    public void executeDBQuery(String query) throws Exception
    {
        System.out.println("Going to execute Query : "+query);
    }
}
