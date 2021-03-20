
import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {

        ArrayList<String> colorList = new ArrayList<String>();
        colorList.add("Red");
        colorList.add("Blue");
        colorList.add("Green");
        colorList.add("Yellow");

        for(String color: colorList) {
            System.out.println(color);
        }

        // use iterator
        Iterator<String> itr = colorList.iterator();

        while(itr.hasNext()) {
            String color = (String) itr.next();
            System.out.println(color);
        }

        //for loop
        for (int i = 0; i < colorList.size(); i++) {
            System.out.println(colorList.get(i));
        }
    }


}
