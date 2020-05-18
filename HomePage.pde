PFont f;
private Button b;
private Game g;
private int pagina = 0;
//metodo per la definizione della dimensioen della finestra
public void settings(){
  size(1300, 700);  //dimensione finestra
}

//metodo eseguit sola volta per le inizializzazioni
public void setup() {  
  f = createFont("stocky.ttf", 24);
  textFont(f);
  background(189,183,107);
  b = new Button();
  g = new Game();
}
  
//metodo eseguito finchè non si chiude la finestra  
public void draw(){
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
