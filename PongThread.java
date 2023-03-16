public class PongThread extends Thread
{
    @Override
    public void run()  {
        int i = 1;
        while(true)
        {
            System.out.println("Pong " + i);
            i += 1;
            if(i == 11)
            {
                System.out.println("Pong is shutting down now...");
                break;
            }
            try {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();;
            }
        }
    }
}
