 public class Button{
   int rectX, rectY;
   int rectSizeX = 500;
   int rectSizeY = 90;
   
   public Button() {
     rectX = (width/2)-(rectSizeX/2);
     rectY = (height/2)-(rectSizeY/2);   
   }
   
   public boolean show(){
     fill(255);        
     rect(rectX, rectY, rectSizeX, rectSizeY);
     fill(255,0,0);
     textAlign(CENTER);
     text("CLICCA QUI PER INIZIARE", rectX+(rectSizeX/2), rectY+(rectSizeY/2)+10);
     if(mouseX>rectX && mouseX <rectX+rectSizeX && mouseY>rectY && mouseY <rectY+rectSizeY && mousePressed) return true;
     return false;
   }
}
