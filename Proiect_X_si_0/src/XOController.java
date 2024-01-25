import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class XOController {
    private XOView view;
    private XOModel model;
    XOController(XOView view,XOModel model){
        this.view = view;
        this.model = model;

        view.addTopLeftButtonListener(new ButtonListener());
        view.addTopCenterButtonListener(new ButtonListener());
        view.addTopRightButtonListener(new ButtonListener());
        view.addMidLeftButtonListener(new ButtonListener());
        view.addMidCenterButtonListener(new ButtonListener());
        view.addMidRightButtonListener(new ButtonListener());
        view.addBotLeftButtonListener(new ButtonListener());
        view.addBotCenterButtonListener(new ButtonListener());
        view.addBotRightButtonListener(new ButtonListener());
        view.addStartButtonListener(new ClearListener());
    }
    public String[] makeVector(){
        String[] moves = new String[9];
        moves[0] = view.topLeft.getText();
        moves[1] = view.topCenter.getText();
        moves[2] = view.topRight.getText();
        moves[3] = view.midLeft.getText();
        moves[4] = view.midCenter.getText();
        moves[5] = view.midRight.getText();
        moves[6] = view.botLeft.getText();
        moves[7] = view.botCenter.getText();
        moves[8] = view.botRight.getText();
        return moves;
    }
    class ButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                int turn = Integer.parseInt(view.turns.getText());
                if (e.getSource() instanceof JButton button) {
                    if (button.getText().equals("")) {
                        if (turn % 2 == 1) {
                            button.setText("X");
                        } else {
                            button.setText("0");
                        }

                        view.winner.setText("");
                        model.incrementString(view.turns.getText());
                        view.turns.setText(model.turns);
                        String[] moves = makeVector();
                        model.isWinningMove(moves);
                        if (Integer.parseInt(view.turns.getText()) == 10 || model.over) {
                            view.winner.setText("Winner is '" + model.winner + "'");
                            view.turns.setText("");
                        }
                    }
                }
            } catch(Exception ex){
                view.winner.setText("Press 'Start'");
            }
        }
    }
    class ClearListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            view.clearTable();
        }
    }
}
