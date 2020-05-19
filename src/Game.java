import processing.core.PApplet;


public class Game {
    private int rectX;
    private int rectY;
    private int rectSizeX;
    private int rectSizeY;
    private PApplet processing;

    public Game (PApplet prc) {
        this.processing = prc;
        rectSizeX = this.processing.width+30;
        rectSizeY = this.processing.height+30;
        rectX = -10;
        rectY = -10;
    }

    public void show(){
        this.processing.fill(0,255,255);
        this.processing.rect(rectX, rectY, rectSizeX, rectSizeY);
    }
}
