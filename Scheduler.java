
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Scheduler {
    private ArrayList<Server> servers;
    private int nrCozi;
    private int nrClienti;
    private Strategy strategy;
    private View view;
    private FileWriter writer;

    public Scheduler(int nrCozi, int nr_clienti, View view,FileWriter writer) {
        this.writer=writer;
        this.view=view;
        this.nrClienti =nr_clienti;
        this.nrCozi = nrCozi;
        servers = new ArrayList<Server>(nrCozi);
        int i=0;
        while(i< nrCozi)
        {	Server c=new Server(nr_clienti,i+1,view,writer);
            servers.add(c);
            Thread t=new Thread(c);
            t.start();
            i++;
        }
        strategy =new Strategy();
    }

    public void  dipspatchTask(Task client,View view)
    {
        int d= strategy.Finder(servers, client);

        try {
            writer.write("Clientul " +  client.toString() + "a intrat in coada a " + d+ "\n");
        } catch (IOException e) {
            System.out.println("WRITING ERROR");
            e.printStackTrace();
        }
        switch (d) {
            case 1:
                view.setRez1(client.toString());
                break;
            case 2:
                view.setRez2(client.toString());
                break;
            case 3:
                view.setRez3(client.toString());
                break;
            case 4:
                view.setRez4(client.toString());
                break;
            case 5:
                view.setRez5(client.toString());
                break;
            case 6:
                view.setRez6(client.toString());
                break;
            case 7:
                view.setRez7(client.toString());
                break;
            case 8:
                view.setRez8(client.toString());
                break;
            case 9:
                view.setRez9(client.toString());
                break;
            case 10:
                view.setRez10(client.toString());
                break;
            default:
                // handle invalid case
                break;
        }
        System.out.println("Clientul " +  client.toString() + "a intrat in coada a " + d+ "\n");
    }

    public int getNrCozi() {
        return nrCozi;
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

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }

    public ArrayList<Server> getServers() {
        return servers;
    }
}
