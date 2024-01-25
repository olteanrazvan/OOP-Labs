import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class XOView extends JFrame{

    private JLabel turnsMessage = new JLabel("Turn: ");
    public JLabel turns = new JLabel();
    public JLabel winner = new JLabel();
    public JButton topLeft = new JButton();
    public JButton topCenter = new JButton();
    public JButton topRight = new JButton();
    public JButton midLeft = new JButton();
    public JButton midCenter = new JButton();
    public JButton midRight = new JButton();
    public JButton botLeft = new JButton();
    public JButton botCenter = new JButton();
    public JButton botRight = new JButton();
    private boolean over;
    private JButton clear = new JButton("Start");
    private XOModel model;
    XOView(XOModel model){
        this.model = model;
        model.setValue();
        JPanel boss = new JPanel();
        JPanel top = new JPanel();
        JPanel mid = new JPanel();
        JPanel bot = new JPanel();
        JPanel interm = new JPanel();
        setSize(200,300);

        top.add(topLeft);
        top.add(topCenter);
        top.add(topRight);
        mid.add(midLeft);
        mid.add(midCenter);
        mid.add(midRight);
        bot.add(botLeft);
        bot.add(botCenter);
        bot.add(botRight);
        interm.add(clear);
        interm.add(turnsMessage);
        interm.add(turns);
        boss.add(interm);
        boss.add(top);
        boss.add(mid);
        boss.add(bot);
        boss.add(winner);
        boss.setLayout(new BoxLayout(boss,BoxLayout.Y_AXIS));
        add(boss);

        this.setContentPane(boss);

        this.setTitle("X si 0");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void clearTable(){
        topLeft.setText("");
        topCenter.setText("");
        topRight.setText("");
        midLeft.setText("");
        midCenter.setText("");
        midRight.setText("");
        botLeft.setText("");
        botCenter.setText("");
        botRight.setText("");
        turns.setText("1");
        winner.setText("");
        over = false;
    }
    public void addTopLeftButtonListener(ActionListener act){
        topLeft.addActionListener(act);
    }
    public void addTopCenterButtonListener(ActionListener act){
        topCenter.addActionListener(act);
    }
    public void addTopRightButtonListener(ActionListener act){
        topRight.addActionListener(act);
    }
    public void addMidLeftButtonListener(ActionListener act){
        midLeft.addActionListener(act);
    }
    public void addMidCenterButtonListener(ActionListener act){
        midCenter.addActionListener(act);
    }
    public void addMidRightButtonListener(ActionListener act){
        midRight.addActionListener(act);
    }
    public void addBotLeftButtonListener(ActionListener act){
        botLeft.addActionListener(act);
    }
    public void addBotCenterButtonListener(ActionListener act){
        botCenter.addActionListener(act);
    }
    public void addBotRightButtonListener(ActionListener act){
        botRight.addActionListener(act);
    }
    public void addStartButtonListener(ActionListener act){
        clear.addActionListener(act);
    }
}
