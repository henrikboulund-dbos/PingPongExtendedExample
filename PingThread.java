public class PingThread extends Thread
{
    @Override
    public void run()  {
        int i = 1;
        while(true)
        {
            System.out.println("Ping " + i);
            i += 1;
            if(i == 15)
            {
                System.out.println("Ping is shutting down now...");
                break;
            }
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();;
            }
        }
    }
}
