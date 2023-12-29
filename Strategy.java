import java.util.ArrayList;

public class Strategy {
    public int Finder(ArrayList<Server> servers, Task task)
    {
        int minim=servers.get(0).getWaitingPeriod().intValue();
        int cnt=0;
        for (int i = 0; i < servers.size(); i++) {
            Server aux = servers.get(i);
            if (aux.getWaitingPeriod().intValue() < minim) {
                minim = aux.getWaitingPeriod().intValue();
                cnt = i;
            }
        }
        int val=servers.get(cnt).adaugare(task);
        return val;
    }
}
