import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
public class SimulationManager implements Runnable {
    private View view;
    private int arrivalTime;
    private int arrivalTimeMax;

    private int serviceTime;
    private int serviceTimeMax;
    private int simulationTime;
    private int nrCozi;
    private int nrClienti;
    private Scheduler scheduler;
    private FileWriter writer;
    private ArrayList<Task>clienti=new ArrayList<Task>(nrClienti);
    public SimulationManager(View view) {
        try {
            // Step 1: Create a File object

            // Step 2: Create a FileWriter object
            writer = new FileWriter("out.txt");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        this.view = view;
        arrivalTime = view.getTxt1();
        arrivalTimeMax=view.getArrivalTimeMax();
        serviceTimeMax=view.getServiceTimeMax();
        serviceTime = view.getTxt2();
        nrClienti = view.getTxt3();
        simulationTime = view.getTxt4();
        nrCozi = view.getTxt5();
        scheduler = new Scheduler(nrCozi, nrClienti, view, writer);
        this.generare_clienti();
    }
    public void generare_clienti()
    {	int contor=nrClienti;
        int id=1;
        for (int i = 0; i < contor; i++) {
            int procesare = (int) (Math.random() * (serviceTimeMax -serviceTime)) + serviceTime;
            int venire = (int) (Math.random() * (arrivalTimeMax - arrivalTime)) + arrivalTime;
            Task auxiliar = new Task(id, venire, procesare);
            clienti.add(auxiliar);
            procesare = 0;
            venire = 0;
            id++;
        }
    }

    public void run() {
        int time=1;
        int cnt=1;
        float avg=0;
        float avg2=0;
        int numarClienti=clienti.size();
        while(time<simulationTime)
        {
            try {
                writer.write("Time:"+String.valueOf(time)+"\n"+"Number of clients:"+numarClienti+"\n");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Time:"+String.valueOf(time)+"\nWaiting clients:");
            System.out.println(clienti.toString());
            for (int i = 0; i < clienti.size(); i++) {
                Task task = clienti.get(i);
                avg+=(float)task.getServiceTime();
                avg2+=(float)time;
                avg/=nrClienti;
                avg2/=nrClienti;
                if (task.getArrivalTime() == time) {
                    scheduler.dipspatchTask(task, view);
                    numarClienti--;
                    cnt++;
                }
            }
            //
            if(time==simulationTime-1)
            {
                try {
                    writer.write("AVG SERVICE TIME="+Float.toString(avg)+"\nAVG WAITING TIME="+Float.toString(avg2));
                    writer.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            time++;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getServiceTime() {
        return serviceTime;
    }

    public void setServiceTime(int serviceTime) {
        this.serviceTime = serviceTime;
    }

    public int getSimulationTime() {
        return simulationTime;
    }

    public void setSimulationTime(int simulationTime) {
        this.simulationTime = simulationTime;
    }

    public int getNrCozi() {
        return nrCozi;
    }
    public ArrayList<Task> getClienti() {
        return clienti;
    }
    public void setNrCozi(int nrCozi) {
        this.nrCozi = nrCozi;
    }

    public int getNrClienti() {
        return nrClienti;
    }

    public void setNrClienti(int nrClienti) {
        this.nrClienti = nrClienti;
    }
    public void setSir_clienti_random(ArrayList<Task> clienti) {
        this.clienti = clienti;
    }
    public Scheduler getScheduler() {
        return scheduler;
    }
    public void setScheduler(Scheduler scheduler) {
        this.scheduler = scheduler;
    }


}
