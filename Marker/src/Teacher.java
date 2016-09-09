import java.awt.*;
import java.awt.font.TextAttribute;
import java.util.Scanner;

/**
 * Created by s1l3xz on 09.09.16.
 */
public class Teacher  {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("choose marker color");
        String MarkerColor = in.next();

        Marker marker = Marker.getMarker(MarkerColor);


        System.out.println("write sentence");
        String sequence = in.next();

        Teacher.writeWithMarkerOnBoard(marker, sequence);

    }

    public static void writeWithMarkerOnBoard(Marker marker, String sequence) {

        marker.writeOnBoard(marker, sequence);

    }

}
