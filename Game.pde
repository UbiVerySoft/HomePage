 public class Game{
    int rectX, rectY;      // Position of square button
    int rectSizeX = width+30;
    int rectSizeY = height+30;
    
    public Game () {
        rectX = -10;
        rectY = -10;
    }
 
    public void show(){
        fill(169,169,169);
        rect(rectX, rectY, rectSizeX, rectSizeY);
    }
}
