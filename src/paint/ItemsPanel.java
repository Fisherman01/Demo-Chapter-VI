package paint;

import handling.ButtonListener;
import handling.ComboBoxListener;
import main.DemoChapterVI;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by avisser on 10-8-2015.
 */
public class ItemsPanel extends JPanel {
    DemoChapterVI controller;

    private JLabel guessWord;
    private JLabel outcome;
    private JLabel difficultyLabel;
    private JButton newGame;

    private JComboBox<String> difficulty;

    ButtonListener buttonListener;
    ComboBoxListener boxListener;
    ArrayList<JButton> buttonList;
    Iterator buttonIterator = null;

    /**
     * buttons
     */
    JButton aButt = new JButton("A");
    JButton bButt = new JButton("B");
    JButton cButt = new JButton("C");
    JButton dButt = new JButton("D");
    JButton eButt = new JButton("E");
    JButton fButt = new JButton("F");
    JButton gButt = new JButton("G");
    JButton hButt = new JButton("H");
    JButton iButt = new JButton("I");
    JButton jButt = new JButton("J");
    JButton kButt = new JButton("K");
    JButton lButt = new JButton("L");
    JButton mButt = new JButton("M");
    JButton nButt = new JButton("N");
    JButton oButt = new JButton("O");
    JButton pButt = new JButton("P");
    JButton qButt = new JButton("Q");
    JButton rButt = new JButton("R");
    JButton sButt = new JButton("S");
    JButton tButt = new JButton("T");
    JButton uButt = new JButton("U");
    JButton vButt = new JButton("V");
    JButton wButt = new JButton("W");
    JButton xButt = new JButton("X");
    JButton yButt = new JButton("Y");
    JButton zButt = new JButton("Z");

    public ItemsPanel(DemoChapterVI controller) {
        this.controller = controller;
        this.init();
    }

    private void init() {
        buttonList = new ArrayList();
        buttonListener = new ButtonListener(controller);
        boxListener = new ComboBoxListener(controller);

        newGame = new JButton("New Game");
        newGame.setBounds(390, 260, 100, 30);
        this.add(newGame);
        newGame.addActionListener(buttonListener);

        guessWord = new JLabel();
        guessWord.setBounds(10, 10, 400, 60);
        guessWord.setFont(new Font("Arial", Font.PLAIN, 60));
        this.add(guessWord);

        outcome = new JLabel();
        outcome.setBounds(10, 270, 300, 20);
        this.add(outcome);

        difficultyLabel = new JLabel("Difficulty");
        difficultyLabel.setBounds(430, 10, 100, 20);
        this.add(difficultyLabel);

        difficulty = new JComboBox<>();
        difficulty.setBounds(420, 30, 70, 20);
        difficulty.addItem("");
        difficulty.addItem("Easy");
        difficulty.addItem("Medium");
        difficulty.addItem("Hard");
        difficulty.addActionListener(boxListener);
        this.add(difficulty);

        //buttons
        aButt.setBounds(10, 100, 50, 50);
        aButt.addActionListener(buttonListener);
        buttonList.add(aButt);
        this.add(aButt);
        bButt.setBounds(60, 100, 50, 50);
        bButt.addActionListener(buttonListener);
        buttonList.add(bButt);
        this.add(bButt);
        cButt.setBounds(110, 100, 50, 50);
        cButt.addActionListener(buttonListener);
        buttonList.add(cButt);
        this.add(cButt);
        dButt.setBounds(160, 100, 50, 50);
        dButt.addActionListener(buttonListener);
        buttonList.add(dButt);
        this.add(dButt);
        eButt.setBounds(210, 100, 50, 50);
        eButt.addActionListener(buttonListener);
        buttonList.add(eButt);
        this.add(eButt);
        fButt.setBounds(260, 100, 50, 50);
        fButt.addActionListener(buttonListener);
        buttonList.add(fButt);
        this.add(fButt);
        gButt.setBounds(310, 100, 50, 50);
        gButt.addActionListener(buttonListener);
        buttonList.add(gButt);
        this.add(gButt);
        hButt.setBounds(360, 100, 50, 50);
        hButt.addActionListener(buttonListener);
        buttonList.add(hButt);
        this.add(hButt);
        iButt.setBounds(410, 100, 50, 50);
        iButt.addActionListener(buttonListener);
        buttonList.add(iButt);
        this.add(iButt);
        jButt.setBounds(10, 150, 50, 50);
        jButt.addActionListener(buttonListener);
        buttonList.add(jButt);
        this.add(jButt);
        kButt.setBounds(60, 150, 50, 50);
        kButt.addActionListener(buttonListener);
        buttonList.add(kButt);
        this.add(kButt);
        lButt.setBounds(110, 150, 50, 50);
        lButt.addActionListener(buttonListener);
        buttonList.add(lButt);
        this.add(lButt);
        mButt.setBounds(160, 150, 50, 50);
        mButt.addActionListener(buttonListener);
        buttonList.add(mButt);
        this.add(mButt);
        nButt.setBounds(210, 150, 50, 50);
        nButt.addActionListener(buttonListener);
        buttonList.add(nButt);
        this.add(nButt);
        oButt.setBounds(260, 150, 50, 50);
        oButt.addActionListener(buttonListener);
        buttonList.add(oButt);
        this.add(oButt);
        pButt.setBounds(310, 150, 50, 50);
        pButt.addActionListener(buttonListener);
        buttonList.add(pButt);
        this.add(pButt);
        qButt.setBounds(360, 150, 50, 50);
        qButt.addActionListener(buttonListener);
        buttonList.add(qButt);
        this.add(qButt);
        rButt.setBounds(410, 150, 50, 50);
        rButt.addActionListener(buttonListener);
        buttonList.add(rButt);
        this.add(rButt);
        sButt.setBounds(10, 200, 50, 50);
        sButt.addActionListener(buttonListener);
        buttonList.add(sButt);
        this.add(sButt);
        tButt.setBounds(60, 200, 50, 50);
        tButt.addActionListener(buttonListener);
        buttonList.add(tButt);
        this.add(tButt);
        uButt.setBounds(110, 200, 50, 50);
        uButt.addActionListener(buttonListener);
        buttonList.add(uButt);
        this.add(uButt);
        vButt.setBounds(160, 200, 50, 50);
        vButt.addActionListener(buttonListener);
        buttonList.add(vButt);
        this.add(vButt);
        wButt.setBounds(210, 200, 50, 50);
        wButt.addActionListener(buttonListener);
        buttonList.add(wButt);
        this.add(wButt);
        xButt.setBounds(260, 200, 50, 50);
        xButt.addActionListener(buttonListener);
        buttonList.add(xButt);
        this.add(xButt);
        yButt.setBounds(310, 200, 50, 50);
        yButt.addActionListener(buttonListener);
        buttonList.add(yButt);
        this.add(yButt);
        zButt.setBounds(360, 200, 50, 50);
        zButt.addActionListener(buttonListener);
        buttonList.add(zButt);
        this.add(zButt);
    }

    public void showMessage() {
        JOptionPane.showMessageDialog(new JFrame(), "Please chose a difficulty first", "Warning!", JOptionPane.WARNING_MESSAGE);
    }


    public void enableButtons() {
        buttonIterator = buttonList.iterator();
        while( buttonIterator.hasNext() ) {
            ( (JButton)buttonIterator.next() ).setEnabled( true );
        }
    }

    public void disableButtons() {
        buttonIterator = buttonList.iterator();
        while( buttonIterator.hasNext() ) {
            ( (JButton)buttonIterator.next() ).setEnabled( false );
        }
    }

    public void setGuessWord(String text) {
        this.guessWord.setText(text);
    }

    public void setOutcome(String text) {
        this.outcome.setText(text);
    }
}
