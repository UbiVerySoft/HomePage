import processing.core.PApplet;
import processing.core.PImage;

import java.util.Random;

public class Monete {
    private float posx;
    private float posy;
    private float changey;
    private float changex;
    private PApplet processing;
    Random rnd = new Random();
    private PImage imgCoins;


    public Monete (PApplet prc) {
        this.processing = prc;
        imgCoins = processing.loadImage("coins.png");
        posx = rnd.nextInt(processing.width/2);
        posy = rnd.nextInt(40);
        changex = 0;
        changey = (float) Math.random();
        posy =-20*10;

    }

    void show() {
        processing.image(imgCoins, (processing.width/2)+posx+100, posy, 100, 100);
        posy = posy + changey;
        posx = posx + changex;
        if (posy > processing.height) {
            posy = -200;
        }
    }
}
