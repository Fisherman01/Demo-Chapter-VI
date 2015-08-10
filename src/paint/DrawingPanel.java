package paint;

import main.DemoChapterVI;
import javax.swing.*;
import java.awt.*;

/**
 * Created by avisser on 10-8-2015.
 */
public class DrawingPanel extends JPanel {
    private final DemoChapterVI controller;

    public DrawingPanel(DemoChapterVI controller) {
        this.controller = controller;
    }


    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.drawGallows(g);

        if(controller.isHead){
            this.drawHead(g);
        }
        if(controller.isBody) {
            this.drawBody(g);
        }
        if(controller.isLeftArm) {
            this.drawLeftArm(g);
        }
        if(controller.isRightArm) {
            this.drawRightArm(g);
        }
        if(controller.isLeftLeg) {
            this.drawLeftLeg(g);
        }
        if(controller.isRightLeg) {
            this.drawRightLeg(g);
        }

    }

    private void drawGallows(Graphics g){
        g.setColor(Color.black);
        g.drawRect(10, 10, 25, 300);
        g.drawRect(10, 10, 200, 25);
        g.setColor(Color.darkGray);
        g.fillRect(11, 11, 24, 300);
        g.fillRect(11, 11, 199, 24);
    }

    private void drawHead(Graphics g){
        g.setColor(Color.black);
        g.fillRect(200, 35, 2, 40);
        g.fillOval(180, 75, 40, 40);
    }

    private void drawBody(Graphics g){
        g.setColor(Color.black);
        g.fillOval(180, 115, 40, 80);
    }

    private void drawLeftArm(Graphics g){
        g.setColor(Color.black);
        g.fillRect(150, 120, 40, 2);
    }

    private void drawRightArm(Graphics g){
        g.setColor(Color.black);
        g.fillRect(210, 120, 40, 2);
    }

    private void drawLeftLeg(Graphics g){
        g.setColor(Color.black);
        g.fillRect(190, 190, 2, 45);
    }

    private void drawRightLeg(Graphics g){
        g.setColor(Color.black);
        g.fillRect(208, 190, 2, 45);
    }
}
