package detection;

import magick.DrawInfo;
import magick.ImageInfo;
import magick.MagickImage;
import magick.MagickException;
import magick.PixelPacket;
import java.awt.Dimension;

public class BubbleDetection {
   public static void main(String[] args) {
      try {
      ImageInfo ii = new ImageInfo("./TrainingSet/images/d0101.jpg");
      MagickImage image = new MagickImage(ii);
      MagickImage flipped = image.flipImage();
      flipped.setFileName("test.jpg");
      flipped.writeImage(new ImageInfo());
      Dimension d = image.getDimension();
      System.out.println("Dimension width=" + d.width + " height=" + d.height);
      } catch (MagickException e) {
         e.printStackTrace();
      }
   }
}


