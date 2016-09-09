import java.util.Random;

/**
 * Created by s1l3xz on 09.09.16.
 */
public class Marker {

    private String color;
    private int durability;


    public void writeOnBoard(Marker marker, String sentences){
        if(marker.durability >= sentences.length()){
            System.out.println("<" + marker.color + ">" + sentences  + "</" + marker.color + ">" );
        }else {
            System.out.println("<" + marker.color + ">" + sentences.substring(0, marker.durability)  + "</" + marker.color + ">");
        }
    }

    public static int setDurability(){
        Random rand = new Random();
        return rand.nextInt(100);
    }

    public static Marker getMarker(String color){

        Marker marker = new Marker();

        marker.durability = Marker.setDurability();

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
