import javax.swing.*;

public class MainWindow extends JFrame {
    public MainWindow() {
        setTitle("Змейка");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocation(320, 345);
        add(new GameField());
        setVisible(true);
    }

    public static void main(String[] args) {
        MainWindow mw = new MainWindow();
    }
}
