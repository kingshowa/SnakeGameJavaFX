package application;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import java.util.Random;

public class Food {
	
    private Position position;
    //private Rectangle rectangle;
    private Circle circle;
    private Color color = Color.GREEN;
    private Random random = new Random();
    private int size;


    public Food(double xPos, double yPos, Pane pane, double size) {
        this.size = (int) size;
        position = new Position(xPos,yPos);
        //rectangle = new Rectangle(position.getXPos(),position.getYPos(),size,size);
        circle = new Circle(position.getXPos(),position.getYPos(),size/2);
        //rectangle.setFill(color);
        circle.setFill(color);
        pane.getChildren().add(circle);
    }

    public Position getPosition() {
        return position;
    }

    public void moveFood(){
        getRandomSpotForFood();
    }

    public void getRandomSpotForFood(){
        int positionX = random.nextInt(17);
        int positionY = random.nextInt(17);
//        rectangle.setX(positionX * size);
//        rectangle.setY(positionY * size);
        circle.setCenterX(positionX * size + size/2);
        circle.setCenterY(positionY * size + size/2);

        position.setXPos(positionX * size + size/2);
        position.setYPos(positionY * size + size/2);
//        System.out.println((positionX * size + size/2) + "---FOOD---" +(positionY * size + size/2));
    }
}
