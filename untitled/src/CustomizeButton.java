import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class CustomizeButton implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("go to customize page");
        GUI.Cards.show(GUI.panelCont, "customize");
        GUI.History.push("customize");
    }
}
