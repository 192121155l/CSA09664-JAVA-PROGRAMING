import java.io.*;
class threadingjoining
{
public void run()
{
for(int i=0;i<2;i++)
{
try
{
thread.sleep(500);
system.out.println("current thread:"+thread.current thread().get name());
}
catch(excepation ex)
{
system.out.println("exception has"+"been caught"+ex);
}
system.out.println(i);
}
}
}
class threadingjoining{
public static void main(string[]args)
{
threadjoing t1=new thread joining();
threadjoinig t2=new thread joiining();
threadjoining t3=new thread joing();
t1.start();
try{
system.out.println("current thread:"+thread current thread().get name());
t1.join();
}
catch (Exception ex)
{
system.out.println("exception has"+"been caught"+ex);
}
t2.start();
try
{
system.out.println("curerent thrad:".current thread().get name());
}
catch(exception ex){
system.out.println("excepion has been"+"caught"+ex);
}
t3.strat();
}
}
