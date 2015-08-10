package handling;

import main.DemoChapterVI;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by avisser on 10-8-2015.
 */
public class ButtonListener implements ActionListener {
    private final DemoChapterVI main;

    public ButtonListener(DemoChapterVI main ) {
        this.main = main;
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("New Game") ) {
            main.setNewGame();

        } else {
            JButton buttonPushed = (JButton) e.getSource();
            buttonPushed.setEnabled(false);
            main.processAnswer(buttonPushed.getText());
        }
    }
}
