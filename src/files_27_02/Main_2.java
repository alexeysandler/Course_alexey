package files_27_02;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class Main_2 {
    public static void main(String[] args) throws IOException{
        DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("C:\\Users\\as371x\\IdeaProjects\\Project_1\\Alexey"));

        try {
            List<Integer> nums = new ArrayList<>();
            Scanner sc = new Scanner(System.in);
            while (sc.hasNext()) {
                int num = sc.nextInt();
                if (num != -1) {
                    nums.add(num);

                }else {
                    break;
                }
            }
            outputStream.writeInt(nums.size());
            for (int i : nums){
                outputStream.writeInt(i);
            }


        } catch (RuntimeException e) {
        }
        finally {
            outputStream.close();
        }
    }
}
