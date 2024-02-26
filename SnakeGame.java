
package snakegame;
import javax.swing.*;

public class SnakeGame extends JFrame{

    SnakeGame(){
        super("Snake Game");
        add(new Board());
        pack();
        setResizable(false);

        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new SnakeGame();
    }
    
}
