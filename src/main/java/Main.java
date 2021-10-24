import processing.core.PApplet;

public class Main extends PApplet {

    public static final Main main = new Main();
    public static final int height = 400;
    public static final int width = 300;


    public void settings() {
        size(width, height);
    }

    public void draw(){
        background(64);
        main.frameRate(4);

        if(mousePressed){
                Block.newBlock();

        }

                Block.drawBlocks();
        //ellipse(mouseX, mouseY, 20, 20);
    }

    public static void main(String[] passedArgs) {
        String[] appletArgs = {"Main"};

        PApplet.runSketch(appletArgs, main);
    }


    public void square(float x, float y, float size) {
        rect(x,y,size,size);
    }
}