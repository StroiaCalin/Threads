import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Controller {
    private SimulationManager aux;
    private View view;
    private int nrCozi;
    public Controller(View view)
    {	this.view = view;
        view.addListenerButon(new buton());
    }
    public class buton implements ActionListener{
        public void actionPerformed(ActionEvent arg0) {
            aux=new SimulationManager(view);
            Thread t=new Thread(aux);
            t.start();
        }
    }

    public SimulationManager getAux() {
        return aux;
    }

    public void setAux(SimulationManager aux) {
        this.aux = aux;
    }

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }

    public int getNrCozi() {
        return nrCozi;
    }

    public void setNrCozi(int nrCozi) {
        this.nrCozi = nrCozi;
    }
}
