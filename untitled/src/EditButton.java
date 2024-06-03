import javax.swing.*;
//import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileFilter;
//import java.util.ArrayList;


public class EditButton implements ActionListener{

    private static class fileIsImage implements FileFilter{
        @Override
        public boolean accept(File pathname) {
            String filename = pathname.getName();
            return (filename.contains(".png") || filename.contains(".jpg"));
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        JFileChooser chooser = new JFileChooser();
//        FileNameExtensionFilter filter = new FileNameExtensionFilter(
//                "Folders", "jpg");
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int returnVal = chooser.showOpenDialog(null);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            File selectedFile = chooser.getSelectedFile();

            System.out.println("You chose to open this folder: " +
                    chooser.getSelectedFile());

            File[] listOfFiles = selectedFile.listFiles(new fileIsImage());
            if(listOfFiles == null){
                return;
            }
            int i = 0;

            JPanel panel = (JPanel) GUI.panelCont.getComponent(2);
            for(Component label : panel.getComponents()){
                if(label instanceof ImageField && i < listOfFiles.length){
                    ((ImageField) label).changeImage(listOfFiles[i].getAbsolutePath());
                    i++;
                }
            }
        }
    }
}
