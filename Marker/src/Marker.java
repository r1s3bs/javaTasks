/**
 * Created by s1l3xz on 09.09.16.
 */
public class Marker {

    public String color;
    public Marker() {
        String color;
        int durability;
    }

    public void writeOnBoard(Marker marker, String sentences){
        System.out.println("<" + marker.color + ">" + sentences  + "</" + marker.color + ">" );
    }


    public static Marker getMarker(String color){

        Marker marker = new Marker();

        switch (color){
            case "red":
                marker.color = "red";
                break;
            case "yellow":
                marker.color = "yellow";
                break;
            default:
                throw new IllegalArgumentException("no such marker color");
        }

        return marker;
    }
}
