import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
public class View extends JFrame {
    private JFrame frame;
    private JLabel rez;
    private JLabel rez1;
    private JLabel rez2;
    private JLabel rez3;
    private JLabel rez4;
    private JLabel rez5;
    private JLabel rez6;
    private JLabel rez7;
    private JLabel rez8;
    private JLabel rez9;
    private JLabel rez10;

   // private JTextArea avg;
    private JTextArea titlu=new JTextArea("Assignment 2");
    private JTextArea arrivalTime=new JTextArea("Arrival Time");

    private JTextArea serviceTime=new JTextArea("Service Time");

    private JTextArea nrClients=new JTextArea("Number of clients");
    private JTextArea simTime=new JTextArea("Simulation Time:");
    private JTextArea nrQueue=new JTextArea("Numbers  of queue:");
    private JButton start = new JButton("start");
    private JTextField txt1=new JTextField();
    private JTextField serviceTimeMax=new JTextField();
    private JTextField txt2=new JTextField();
    private JTextField arrivalTimeMax=new JTextField();
    private JTextField txt3=new JTextField();
    private JTextField txt4=new JTextField();
    private JTextField txt5=new JTextField();
    public View()
    {
        frame = new JFrame();
        frame.getContentPane().setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1500, 1500);
        titlu.setBounds(150,50,100,50);
        titlu.setBackground(getBackground());
        JPanel panel = new JPanel(null);
        panel.setPreferredSize(new Dimension(1500, 1500));
        panel.add(titlu);
        arrivalTime.setBounds(50,110,315,35);
        arrivalTime.setEditable(false);
        arrivalTime.setBackground(getBackground());
        panel.add(arrivalTime);
        txt1.setBounds(250,100,80,30);
        txt1.setBackground(Color.white);
        panel.add(txt1);
        arrivalTimeMax.setBounds(330,100,85,30);
        panel.add(arrivalTimeMax);

        serviceTime.setBounds(50,155,315,35);
        serviceTime.setEditable(false);
        serviceTime.setBackground(getBackground());
        panel.add(serviceTime);


        txt2.setBounds(250,145,80,30);
        serviceTimeMax.setBounds(330,145,80,30);
        panel.add(serviceTimeMax);
        panel.add(txt2);

        nrClients.setBounds(50,200,315,35);
        nrClients.setEditable(false);
        nrClients.setBackground(getBackground());
        panel.add(nrClients);

        txt3.setBounds(250,190,80,30);
        panel.add(txt3);

        simTime.setBounds(50,245,315,35);
        simTime.setBackground(getBackground());
        simTime.setEditable(false);
        panel.add(simTime);

        txt4.setBounds(250,235,80,30);
        panel.add(txt4);

        nrQueue.setBounds(50,290,315,35);
        nrQueue.setEditable(false);
        nrQueue.setBackground(getBackground());
        panel.add(nrQueue);

        txt5.setBounds(250,280,80,30);
        panel.add(txt5);

        start.setBounds(150,330,75,50);
        start.setBackground(Color.WHITE);
        panel.add(start);

        rez = new JLabel("View");
        rez.setBounds(800, 10, 100, 100);
        panel.add(rez);

        rez1 = new JLabel(" Queue1: ");
        rez1.setBounds(600, 70, 900, 70);
        panel.add(rez1);

        rez2 = new JLabel(" Queue2: ");
        rez2.setBounds(600, 140, 900, 70);
        panel.add(rez2);

        rez3 = new JLabel(" Queue3: ");
        rez3.setBounds(600, 210, 900, 70);
        panel.add(rez3);

        rez4 = new JLabel(" Queue4: ");
        rez4.setBounds(600, 280, 900, 70);
        panel.add(rez4);

        rez5 = new JLabel(" Queue5: ");
        rez5.setBounds(600, 350, 900, 70);
        panel.add(rez5);

        rez6 = new JLabel(" Queue6: ");
        rez6.setBounds(600, 420, 900, 70);
        panel.add(rez6);

        rez7 = new JLabel(" Queue7: ");
        rez7.setBounds(600, 490, 900, 70);
        panel.add(rez7);

        rez8 = new JLabel(" Queue8: ");
        rez8.setBounds(600, 560, 900, 70);
        panel.add(rez8);

        rez9 = new JLabel(" Queue9: ");
        rez9.setBounds(600, 630, 900, 70);
        panel.add(rez9);

        rez10 = new JLabel(" Queue10: ");
        rez10.setBounds(600, 700, 900, 70);
        panel.add(rez10);

        frame.add(panel);
        frame.setVisible(true);
    }

    public JLabel getRez() {
        return rez;
    }

    public void setRez(JLabel rez) {
        this.rez = rez;
    }

    public String getRez1() {
        return rez1.toString();
    }
    public String getRez2() {
        return rez2.toString();
    }
    public String getRez3() {
        return rez3.toString();
    }

    public void setRez2(String rez2) {
        this.rez2.setText(this.rez2.getText().toString()+rez2);
    }
    public void setRez1(String rez1) {
        this.rez1.setText(this.rez1.getText()+rez1);
    }

    public void eraseRez1() {
        this.rez1.setText(this.rez1.getText().substring(0,8)+this.rez1.getText().substring(15));
    }
    public void eraseRez4() {
        this.rez4.setText(this.rez4.getText().substring(0,8)+this.rez4.getText().substring(15));
    }
    public void eraseRez5() {
        this.rez5.setText(this.rez5.getText().substring(0,8)+this.rez5.getText().substring(15));
    }
    public void eraseRez6() {
        this.rez6.setText(this.rez6.getText().substring(0,8)+this.rez6.getText().substring(15));
    }
    public void eraseRez7() {
        this.rez7.setText(this.rez7.getText().substring(0,8)+this.rez7.getText().substring(15));
    }
    public void eraseRez8() {
        this.rez8.setText(this.rez8.getText().substring(0,8)+this.rez8.getText().substring(15));
    }
    public void eraseRez9() {
        this.rez9.setText(this.rez9.getText().substring(0,8)+this.rez9.getText().substring(15));
    }
    public void eraseRez10() {
        this.rez10.setText(this.rez10.getText().substring(0,8)+this.rez10.getText().substring(15));
    }
    public void eraseRez2() {
        this.rez2.setText(this.rez2.getText().substring(0,8)+this.rez2.getText().substring(15));
    }
    public void eraseRez3() {
        this.rez3.setText(this.rez3.getText().substring(0,8)+this.rez3.getText().substring(15));
    }

    public JLabel getRez4() {
        return rez4;
    }

    public void setRez4(String rez4) {
        this.rez4.setText(this.rez4.getText()+rez4);
    }

    public JLabel getRez5() {
        return rez5;
    }

    public void setRez5(String rez5) {
        this.rez5.setText(this.rez5.getText()+rez5);
    }

    public JLabel getRez6() {
        return rez6;
    }

    public void setRez6(String rez6) {
        this.rez6.setText(this.rez6.getText()+rez6);
    }

    public JLabel getRez7() {
        return rez7;
    }

    public void setRez7(String rez7) {
        this.rez7.setText(this.rez7.getText()+rez7);
    }

    public JLabel getRez8() {
        return rez8;
    }

    public void setRez8(String rez8) {
        this.rez8.setText(this.rez8.getText()+rez8);
    }

    public JLabel getRez9() {
        return rez9;
    }

    public void setRez9(String rez9) {
        this.rez9.setText(this.rez9.getText()+rez9);
    }

    public JLabel getRez10() {
        return rez10;
    }

    public void setRez10(String rez10) {
        this.rez10.setText(this.rez10.getText()+rez10);
    }

    public void setRez3(String rez3) {
        this.rez3.setText(this.rez3.getText()+rez3);
    }

    public void addListenerButon(ActionListener listenerStart) {
        // TODO Auto-generated method stub
        start.addActionListener(listenerStart);
    }

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame1) {
        this.frame = frame1;
    }
//    public void setAvg(float avg) {
//        this.avg.setText(Float.toString(avg));
//    }
    public JTextArea getTitlu() {
        return titlu;
    }

    public void setTitlu(JTextArea titlu) {
        this.titlu = titlu;
    }

    public JTextArea getArrivalTime() {
        return arrivalTime;
    }

    public int getTxt1() {

        return Integer.parseInt(txt1.getText());
    }

    public void setTxt1(JTextField txt1) {
        this.txt1 = txt1;
    }

    public int getTxt2() {

        return Integer.parseInt(txt2.getText());
    }

    public void setTxt2(JTextField txt2) {
        this.txt2 = txt2;
    }

    public int getTxt3() {

        return Integer.parseInt(txt3.getText());
    }

    public int getArrivalTimeMax() {

        return Integer.parseInt(arrivalTimeMax.getText());
    }
    public int getServiceTimeMax() {

        return Integer.parseInt(serviceTimeMax.getText());
    }

    public void setTxt3(JTextField txt3) {
        this.txt3 = txt3;
    }

    public int getTxt4() {

        return Integer.parseInt(txt4.getText());
    }

    public void setTxt4(JTextField txt4) {
        this.txt4 = txt4;
    }

    public int getTxt5() {

        return Integer.parseInt(txt5.getText());
    }

    public void setTxt5(JTextField txt5) {
        this.txt5 = txt5;
    }

    public void setArrivalTime(JTextArea arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public JTextArea getServiceTime() {
        return serviceTime;
    }

    public void setServiceTime(JTextArea serviceTime) {
        this.serviceTime = serviceTime;
    }

    public JTextArea getNrClients() {
        return nrClients;
    }

    public void setNrClients(JTextArea nrClients) {
        this.nrClients = nrClients;
    }

    public JTextArea getSimTime() {
        return simTime;
    }

    public void setSimTime(JTextArea simTime) {
        this.simTime = simTime;
    }

    public JTextArea getNrQueue() {
        return nrQueue;
    }

    public void setNrQueue(JTextArea nrQueue) {
        this.nrQueue = nrQueue;
    }

    public JButton getStart() {
        return start;
    }

    public void setStart(JButton start) {
        this.start = start;
    }
}
