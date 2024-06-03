import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class RestartButton implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("restarted");
        GUI.Cards.show(GUI.panelCont, "game");
        if(!Objects.equals(GUI.History.peek(), "game")){
            GUI.History.push("game");
        }
    }
}
