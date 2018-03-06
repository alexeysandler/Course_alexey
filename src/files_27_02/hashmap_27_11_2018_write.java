package files_27_02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

public class hashmap_27_11_2018_write {
    public static void main(String[] args) throws IOException{
        Map<String,Integer> map = new HashMap<>();
        map.put("two", 2);
        map.put("five_hundred", 500);
        map.put("one_thousand", 1000);

        FileOutputStream oS = new FileOutputStream(("C:\\Users\\as371x\\IdeaProjects\\Project_1\\Alexey"));

        ObjectOutputStream obj = new ObjectOutputStream(oS);
            try {
                obj.writeObject(map);
            }catch (IOException e){}
            finally {
                obj.close();
            }

    }
}
