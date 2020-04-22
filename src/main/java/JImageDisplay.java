import javax.swing.JComponent;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class JImageDisplay extends JComponent {

    private BufferedImage image;

    public JImageDisplay(int width, int height) {
        this.image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        super.setPreferredSize(new Dimension(width, height));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, image.getWidth(), image.getHeight(), null);
    }

    public void clearImage() {
        System.out.println(image.getWidth()*image.getHeight());
        for (int i=0;i < image.getHeight(); i++)
            for (int j=0; j< image.getWidth(); j++)
                image.setRGB(i, j, 0);
    }

    public void drawPixel(int x, int y, int rgbColor) {
        image.setRGB(x, y, rgbColor);
    }
}
