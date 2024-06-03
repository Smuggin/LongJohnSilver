import javax.swing.*;
import java.awt.*;
//import java.io.IOException;
import java.util.Stack;

public class GUI {

    public static JFrame frame;

    public static CardLayout Cards;

    public static JPanel panelCont;

    public static Stack<String> History;
    public GUI() {
        Cards = new CardLayout();
        panelCont = new JPanel();
        panelCont.setLayout(Cards);
        frame = new JFrame();

        CreateStart();
        CreateTutorial();
        CreateCustomize();
        CreateGame();

        History = new Stack<>();
        History.push("menu");

        frame.add(panelCont, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Guess Who");
        frame.pack();
        frame.setVisible(true);

    }

    private void CreateStart(){
        JPanel panel = new JPanel();
        JButton btnStart = new JButton("Start");
        btnStart.addActionListener(new CustomizeButton());
        JButton btnTutorial = new JButton("Tutorial");
        btnTutorial.addActionListener(new TutorialButton());

        panelCont.add(panel, "menu");

        panel.setBorder(BorderFactory.createEmptyBorder(300,500,300,500));
        panel.setLayout(new GridLayout(0, 1));

        JLabel title = new JLabel("Guess Who?");
        title.setBounds(10,20,80,25);
        panel.add(title);
        panel.add(btnStart);
        panel.add(btnTutorial);
    }

    private void CreateTutorial(){
        JPanel panel = new JPanel();
        JLabel label = new JLabel("How to play");
        panel.add(label);
        JButton btnBack = new JButton("Back");
        btnBack.addActionListener(new BackButton());
        panel.add(btnBack);
        panelCont.add(panel, "tutorial");
    }

    private void CreateCustomize() {
        JPanel tutPanel = new JPanel();
        panelCont.add(tutPanel, "customize");
        JLabel label = new JLabel("Customize Your Cards");
        tutPanel.add(label);

        JButton btnBack = new JButton("back");
        btnBack.addActionListener(new BackButton());
        JButton btnStart = new JButton("start");
        btnStart.addActionListener(new GameButton());
//        open folder
        JButton btnEdit = new JButton("edit");
        btnEdit.addActionListener(new EditButton());

        ImageField image = new ImageField("/images/example.jpg", "example");
        ImageField image2 = new ImageField("/images/penguin.png", "example2");

        tutPanel.add(btnEdit);
        tutPanel.add(btnBack);
        tutPanel.add(btnStart);
        tutPanel.add(image);
        tutPanel.add(image2);
    }

    private void CreateGame(){
        JPanel panel = new JPanel();
        panelCont.add(panel, "game");
        JLabel label = new JLabel("Guess Who");
        panel.add(label);

        JButton btnRestart = new JButton("restart");
        btnRestart.addActionListener(new RestartButton());
        panel.add(btnRestart);
        JButton btnBack = new JButton("menu");
        btnBack.addActionListener(new StartButton());
        panel.add(btnBack);
        JButton btnTutorial = new JButton("tutorial");
        btnTutorial.addActionListener(new TutorialButton());
        panel.add(btnTutorial);
    }
}
