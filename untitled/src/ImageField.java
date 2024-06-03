import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.util.Objects;

public class ImageField extends JLabel {
    private String imagePath;

    //default constructor, create uninitialized JLabel
    public ImageField(){
        imagePath = null;
    }

    //parameterized constructor, create JLable with image from path
    public ImageField(String path){
        imagePath = path;
        URL url = Objects.requireNonNull(getClass().getResource(path));
        this.setIcon(new ImageIcon(url));
    }

    public ImageField(String path, String description){
        imagePath = path;
        URL url = Objects.requireNonNull(getClass().getResource(path));
        ImageIcon imageIcon = new ImageIcon(url, description);
        this.setIcon(resizeImage(imageIcon));
        //this.setMaximumSize(new Dimension(100, 100));

    }

    //getter
    public String getImagePath(){
        return imagePath;
    }

    //change image, unchanged if failed
    public void changeImage(String newPath){
        ImageIcon newImage = new ImageIcon(newPath);
        if(newImage.getImage() != null){
            this.setIcon(resizeImage(newImage));
            imagePath = newPath;
            return;
        }
        return;
    }

    private ImageIcon resizeImage(ImageIcon image){
        Image newimg = image.getImage(); // transform it
        newimg = newimg.getScaledInstance(200, 200, Image.SCALE_SMOOTH); // scale it the smooth way
        return (new ImageIcon(newimg));
    }


}
