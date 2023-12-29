import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class Server implements Runnable {
    private ArrayBlockingQueue<Task> clienti;
    private View view;
    private AtomicInteger waitingPeriod=new AtomicInteger();
    private int aux;
    private FileWriter writer;
    private int nrClienti;
    private int contor=0;
    public Server(int nrClienti, int numar, View view, FileWriter writer) {
        this.writer=writer;
        this.view= view;
        this.nrClienti = nrClienti;
        waitingPeriod.set(0);
        this.aux = numar;
        clienti = new ArrayBlockingQueue<Task>(nrClienti);
    }
    public void run() {

        while(true)
        {
            try {
                contor++;
                Task task=clienti.take();
                Thread.sleep((task.getServiceTime()+1)*1000);
                waitingPeriod.set(waitingPeriod.intValue()-task.getServiceTime());
                System.out.println("Clientul "+task.getNumar()+" a iesit din coada a "+aux+"\n");
                try {
                    writer.write("Clientul "+task.getNumar()+" a iesit din coada a "+aux+"\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                switch (aux) {
                    case 1:
                        view.eraseRez1();
                        break;
                    case 2:
                        view.eraseRez2();
                        break;
                    case 3:
                        view.eraseRez3();
                        break;
                    case 4:
                        view.eraseRez4();
                        break;
                    case 5:
                        view.eraseRez5();
                        break;
                    case 6:
                        view.eraseRez6();
                        break;
                    case 7:
                        view.eraseRez7();
                        break;
                    case 8:
                        view.eraseRez8();
                        break;
                    case 9:
                        view.eraseRez9();
                        break;
                    case 10:
                        view.eraseRez10();
                        break;
                    default:
                        // handle invalid case
                        break;
                }
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
    public int adaugare(Task c)
    {   clienti.add(c);
        this.setWaitingPeriod(c.getServiceTime());
        return this.aux;
    }
    public void setNrClienti(int nr)
    {
        this.nrClienti =nr;
    }

    public AtomicInteger getWaitingPeriod() {
        return waitingPeriod;
    }
    public void setWaitingPeriod(int waitingPeriod) {
        this.waitingPeriod.addAndGet(waitingPeriod);
    }
    public BlockingQueue<Task> getClienti() {
        return clienti;
    }
    public void setClienti(ArrayBlockingQueue<Task> clienti) {
        this.clienti = clienti;
    }
    public int getAux() {
        return aux;
    }
    public void setAux(int aux) {
        this.aux = aux;
    }
}
