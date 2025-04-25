package Main;

import javax.swing.JFrame;

public class man {
    
    public static void main(String[] args) {

        JFrame window = new JFrame("Piercetris");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
    
        
        GamePanel gp = new GamePanel();
        window.add(gp);
        window.pack();


        window.setLocationRelativeTo(null);
        window.setVisible(true);



    }

}
