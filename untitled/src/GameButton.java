import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class GameButton implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e){
        System.out.println("starting the game");
        GUI.Cards.show(GUI.panelCont, "game");
        GUI.History.push("game");
    }
}
