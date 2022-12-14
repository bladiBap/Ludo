package loaders;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

public class ResourceLoader {

    public static BufferedImage loadGraphics(String path) {

        InputStream input = ResourceLoader.class.getResourceAsStream("/"+path);
        BufferedImage image = null;

        try {
            image = ImageIO.read(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return image;
    }

    public static InputStream loadSounds(String path) {
        InputStream input = ResourceLoader.class.getResourceAsStream(path);
        if(input == null) {
            input = ResourceLoader.class.getResourceAsStream("/" + path);
        }
        return input;
    }

}
