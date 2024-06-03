
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TutorialButton implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("go to tutorial page");
        GUI.Cards.show(GUI.panelCont, "tutorial");
        GUI.History.push("tutorial");
    }
}
