import processing.core.PApplet;

/**
 *Draw is a class that draw points as an ellipse on a 2D processing canvas
 */
public class Draw extends PApplet {

    private final int SIZE = 1000; // canvas size

    @Override
    public void settings() {
        size(SIZE, SIZE);
    }

    @Override
    public void setup() {
        background(0);
        for(Float[] coord : Reader.getCoords("cvs.txt")){
            fill(238,184,16);
            try {
                float x = coord[0] * 10;
                float y = coord[1] * 10;
                ellipse(x,y,2,2);
            } catch(Exception e){
                continue;
            }
        }
    }

    public static void main(String[] args) {
        PApplet.main("Draw");
    }
}
