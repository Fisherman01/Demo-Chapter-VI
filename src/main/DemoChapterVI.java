package main;

import paint.DrawingPanel;
import paint.ItemsPanel;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;


/**
 * Created by avisser on 10-8-2015.
 */
public class DemoChapterVI extends JFrame {
    private JPanel drawPanel;
    private ItemsPanel itemsPanel;

    public boolean isHead    = false;
    public boolean isBody    = false;
    public boolean isRightArm= false;
    public boolean isLeftArm = false;
    public boolean isRightLeg= false;
    public boolean isLeftLeg = false;

    private int numberWrong = 0;
    private int difficulty = 0;
    private int numberOfBodyParts = 6;

    String wordToGuess = "";
    String currentGuess = "";

    // Target words
    String[] wordsArrayEasy = {
            "ball" , "doll", "shell", "pedal", "belt", "smoke",
            "color", "video"
    };
    String[] wordsArrayMedium = {
            "native", "country", "example", "helper",
            "favorite", "charcoal", "interest",
            "language", "drink", "homework", "sympathy",
            "define", "specify", "drawing", "picture", "frame",
            "nutshell", "polygon", "circle", "rectangle", "sphere",
            "sherry", "lotion", "shoes", "trousers",
            "blouse" , "cowboy", "engineer", "waiter",
            "wheel", "engine", "street", "navigate",
            "sailing", "skiing", "outboard", "runner", "dancer",
            "hero", "helpless", "lioness"
    };
    String[] wordsArrayDifficult = {
            "nightgown", "pseudonym", "integrity"
    };


    /**
     * Create the application.
     */
    public DemoChapterVI() {
        initUI();
    }


    /**
     * set up a new game
     */
    public void setNewGame() {
        //determine difficulty level
            String[] wordsArray;
        switch (this.getDifficulty()) {
            case 1: wordsArray = wordsArrayEasy; break;
            case 2: wordsArray = wordsArrayMedium; break;
            case 3: wordsArray = wordsArrayDifficult; break;
            default: wordsArray = new String[0]; break;
        }

        try {
            //get new word
            double wordNumber = Math.random();
            int next =  (int) (wordNumber * wordsArray.length);
            wordToGuess = wordsArray[next];

            numberWrong = 0;

            //Enable alphabet buttons
            itemsPanel.enableButtons();

            //replace the letters of the word with ?
            currentGuess = "";
            for(int i=0; i<wordToGuess.length(); i++) {
                currentGuess = currentGuess.concat("?");
            }

            //set the text in the label
            itemsPanel.setGuessWord(currentGuess);

            isHead = false;
            isBody = false;
            isLeftArm = false;
            isRightArm = false;
            isLeftLeg = false;
            isRightLeg = false;
            drawPanel.repaint();

            itemsPanel.setOutcome("");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Woops! something went wrong: "+ e);
            itemsPanel.showMessage();
        }
    }


    /**
     * initiates the UI
     */
    private void initUI() {

        /**
         * set properties for the JFrame
         */
        this.setTitle("Demo Chapter 6");
        this.setSize(860, 360);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        /**
         * building the drawing panel
         */
        drawPanel = new DrawingPanel(this);
        drawPanel.setBackground(new Color(255, 255, 255));
        drawPanel.setBounds(10, 10, 300, 300);
        drawPanel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        this.getContentPane().add(drawPanel);

        /**
         * building the items panel
         */
        itemsPanel = new ItemsPanel(this);
        itemsPanel.setBounds(330, 10, 500, 300);
        itemsPanel.setLayout(null);
        itemsPanel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        this.getContentPane().add(itemsPanel);

        //Disable alphabet buttons
        itemsPanel.disableButtons();
    }


    /**
     * Main method
     * @param args
     */
    public static void main (String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new  DemoChapterVI().setVisible(true);
                } catch (final NullPointerException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Method that processes the answer given
     */
    public void processAnswer(String letter) {
        char newCharacter = letter.charAt(0);
        String nextGuess    = "";
        boolean foundAMatch = false;
        for( int i=0; i<wordToGuess.length(); i++ ) {
            char characterToMatch = wordToGuess.charAt(i);
            if( String.valueOf(characterToMatch).equalsIgnoreCase(String.valueOf(newCharacter)) ) {
                nextGuess = nextGuess.concat( String.valueOf(newCharacter) );
                foundAMatch = true;
            }
            else {
                nextGuess = nextGuess.concat(String.valueOf( currentGuess.charAt(i) ));
            }
         }//for each character
        currentGuess = nextGuess;
        itemsPanel.setGuessWord(currentGuess);


        // We have a winner?
        if( currentGuess.equalsIgnoreCase( wordToGuess ) ) {

            //Disable alphabet buttons
            itemsPanel.disableButtons();

            itemsPanel.setOutcome("You Win!!!");
        }
        // Wrong Answer
        //   Set out a new body part to be drawn by repaint()
        else {
            if( !foundAMatch ) {
                numberWrong++;
                switch (numberWrong){
                    case 1: { isHead     = true; break; }
                    case 2: { isBody     = true; break; }
                    case 3: { isLeftArm  = true; break; }
                    case 4: { isRightArm = true; break; }
                    case 5: { isLeftLeg  = true; break; }
                    case 6: { isRightLeg = true; break; }
                    default: System.out.println("You should be dead!");
                }
                // Repaint the gallows area JPanel
                drawPanel.repaint();
            }
            // Is the game over?
            if( numberWrong >= numberOfBodyParts ) {
                //Disable alphabet buttons
                itemsPanel.disableButtons();

                itemsPanel.setOutcome("You lose!! the word was: " + wordToGuess);
            }
        }
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

}
