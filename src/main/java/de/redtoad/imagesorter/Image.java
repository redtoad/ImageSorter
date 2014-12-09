package de.redtoad.imagesorter;

import com.thebuzzmedia.exiftool.ExifTool;
import com.thebuzzmedia.exiftool.ExifTool.Tag;

import java.io.File;
import java.io.IOException;
import java.util.Map;


/**
 * Created with IntelliJ IDEA.
 * User: basti
 * Date: 13.06.14
 * Time: 21:12
 * To change this template use File | Settings | File Templates.
 */
public class Image {

    File file;


    public Image(String path) throws IOException {

        try {

        } catch (SecurityException e) {
            throw new IOException(e.getMessage());
        }

    }

    public static void main(String[] args) throws IOException {
        ExifTool tool = new ExifTool();
        File image = new File("test.jpg");
        Map<Tag, String> valueMap =
                tool.getImageMeta(image, Tag.MAKE, Tag.AUTHOR, Tag.COMMENT, Tag.DATE_TIME_ORIGINAL, Tag.MODEL);

        System.out.println("Model: " + valueMap.get(Tag.MODEL) +
                ", Lat: " + valueMap.get(Tag.GPS_LATITUDE) +
                ", Long: " + valueMap.get(Tag.GPS_LONGITUDE));
    }

}
