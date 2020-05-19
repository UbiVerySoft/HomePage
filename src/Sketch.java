import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class Sketch extends PApplet {
    private PFont f;
    private Button b;
    private Game g;
    private int pagina = 0;
    private PImage img;
    private PImage bg;

    public static void main(String[] args) {
        PApplet.main("Sketch");
    }

    public void settings() {
        fullScreen();
    }

    public void setup() {
        f = createFont("stocky.ttf", 24);
        textFont(f);
        b = new Button(this);
        g = new Game(this);
        bg = loadImage("bg.jpg");
        img = loadImage("player.png");
    }

    public void draw() {
        if(pagina == 0){
            println("Pagina 0");
            background(bg);
            image(img, 50, 50);
            if(b.show()){
                println("Click");
                pagina = 1;
            }
        }
        if(pagina == 1){
            println("Pagina Game");
            g.show();
        }
    }
}
