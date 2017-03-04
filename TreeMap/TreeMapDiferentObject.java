package TreeMap;

import java.util.TreeMap;
import java.io.*;

class TreeMapDiferentObject {
    static TreeMap<String, Integer> map = new TreeMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String str = reader.readLine();
            if(!map.containsValue(str.hashCode()))
                map.put(str, str.hashCode());
        }
    }
}
