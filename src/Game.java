import processing.core.PApplet;

public class Game {
    int rectX, rectY;      // Position of square button
    int rectSizeX;
    int rectSizeY;
    PApplet processing;

    public Game (PApplet prc) {
        this.processing = prc;
        rectSizeX = this.processing.width+30;
        rectSizeY = this.processing.height+30;
        rectX = -10;
        rectY = -10;
    }

    public void show(){
        this.processing.fill(169,169,169);
        this.processing.rect(rectX, rectY, rectSizeX, rectSizeY);
    }
}
