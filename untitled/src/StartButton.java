import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class StartButton implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("go to main menu page");
        GUI.Cards.show(GUI.panelCont, "menu");
        GUI.History.push("menu");
    }
}
