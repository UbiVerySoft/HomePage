import processing.core.PApplet;
import processing.core.PFont;

public class Sketch extends PApplet {
    PFont f;
    private Button b;
    private Game g;
    private int pagina = 0;

    public static void main(String[] args) {
        PApplet.main("Sketch");
    }

    public void settings() {
        size(1300, 700);  //dimensione finestra
    }

    public void setup() {
        f = createFont("stocky.ttf", 24);
        textFont(f);
        background(189,183,107);
        b = new Button(this);
        g = new Game(this);
    }

    public void draw() {
        if(pagina == 0){
            println("Pagina 0");
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
