import java.awt.*;
import java.awt.font.TextAttribute;

/**
 * Created by s1l3xz on 09.09.16.
 */
public class Teacher  {

    public static void main(String[] args) {
        Marker marker = Marker.getMarker("yellow");

        Teacher.writeWithMarkerOnBoard(marker);

    }

    public static void writeWithMarkerOnBoard(Marker marker) {

        marker.writeOnBoard(marker, "bla");

    }

}
