import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BackButton implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        GUI.History.pop();
        GUI.Cards.show(GUI.panelCont, GUI.History.peek());
    }
}
