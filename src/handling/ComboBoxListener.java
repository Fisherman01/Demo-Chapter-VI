package handling;

import main.DemoChapterVI;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by avisser on 10-8-2015.
 */
public class ComboBoxListener implements ActionListener {
    private final DemoChapterVI main;

    public ComboBoxListener(DemoChapterVI main ) {
        this.main = main;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JComboBox<String> box = (JComboBox<String>)e.getSource();
        String value = (String) box.getSelectedItem();

        switch (value) {
            case "Easy": main.setDifficulty(1); break;
            case "Medium": main.setDifficulty(2); break;
            case "Hard": main.setDifficulty(3); break;
            default: System.out.println("No value was chosen or value was reset to null"); break;
        }

        System.out.println("geselecteerde waarde is:" + value);

    }
}
