import processing.core.PApplet;

import static javax.swing.SwingConstants.CENTER;

public class Button {
    int rectX, rectY;
    int rectSizeX = 700;
    int rectSizeY = 90;
    PApplet processing;

    public Button(PApplet prc) {
        this.processing = prc;
        rectX = (this.processing.width)-(this.processing.width/2)+(rectSizeX/2);
        rectY = (this.processing.height)-(rectSizeY*2);
    }

    public boolean show(){
        this.processing.fill(255);
        this.processing.ellipse(processing.width/2, processing.height/2+(processing.height/3), rectSizeX, rectSizeY);
        this.processing.fill(255,0,0);
        this.processing.textAlign(CENTER);
        this.processing.text("CLICCA QUI PER INIZIARE", processing.width/2-(rectSizeX/4), processing.height/2+(processing.height/(float)2.9));
        if(this.processing.mouseX>rectX && this.processing.mouseX <rectX+rectSizeX
                && this.processing.mouseY>rectY && this.processing.mouseY <rectY+rectSizeY
                && this.processing.mousePressed) return true;
        return false;
    }
}
