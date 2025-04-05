package dev.desktop;
import java.util.HashMap;
/**
 * Class for storing data of users in a hashmap.
 */
public class Data {
    private HashMap<String, HashMap<Integer, String>> data;
    public Data(HashMap<String, HashMap<Integer, String>> d) {
        data = d;
    }
    protected void changeMoney() {
        
    }
}
