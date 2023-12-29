
public class Task implements Comparable {
    private int arrivalTime;
    private int serviceTime;
    private int ID;
    public Task(int ID, int timp_ajungere, int timp_procesare) {
        this.ID=ID;
        this.arrivalTime=timp_ajungere;
        this.serviceTime=timp_procesare;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }
    public void setArrivalTime(int timp_ajungere)
    {
        this.arrivalTime = timp_ajungere;
    }


    public int getServiceTime() {
        return serviceTime;
    }


    public void setServiceTime(int timp_procesare) {
        this.serviceTime = timp_procesare;
    }

    public int compareTo(Object o) {
        Task c1=(Task) o;
        if(this.arrivalTime>c1.getArrivalTime()) return 1;
        else if(this.arrivalTime==c1.getArrivalTime()) return 0;
        else return -1;
    }
    @Override
    public String toString() {
        return "("+ID+"," + arrivalTime + ","+serviceTime+")";
    }
    public int getNumar() {
        return ID;
    }
    public void setNumar(int identificator) {
        this.ID=identificator;
    }


}
