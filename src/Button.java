import processing.core.PApplet;

import static javax.swing.SwingConstants.CENTER;

public class Button {
    int rectX, rectY;
    int rectSizeX = 500;
    int rectSizeY = 90;
    PApplet processing;

    public Button(PApplet prc) {
        this.processing = prc;
        rectX = (this.processing.width/2)-(rectSizeX/2);
        rectY = (this.processing.height/2)-(rectSizeY/2);
    }

    public boolean show(){
        this.processing.fill(255);
        this.processing.rect(rectX, rectY, rectSizeX, rectSizeY);
        this.processing.fill(255,0,0);
        this.processing.textAlign(CENTER);
        this.processing.text("CLICCA QUI PER INIZIARE", rectX+((rectSizeX/2)/4), rectY+(rectSizeY/2)+10);
        if(this.processing.mouseX>rectX && this.processing.mouseX <rectX+rectSizeX
                && this.processing.mouseY>rectY && this.processing.mouseY <rectY+rectSizeY
                && this.processing.mousePressed) return true;
        return false;
    }
}
