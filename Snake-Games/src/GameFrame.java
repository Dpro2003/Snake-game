import javax.swing.*;

public class GameFrame extends JFrame {
 GameFrame(){
     this.add(new Gamepanel());
     this.setTitle("Snake");
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     this.setResizable(false);
     this.setVisible(true);
     this.setLocationRelativeTo(null);
     this.pack();
     Gamepanel gn = new Gamepanel();


 }
}
