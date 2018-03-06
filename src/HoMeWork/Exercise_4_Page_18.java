package HoMeWork;

import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise_4_Page_18 {
    public static void main(String[] args)throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Print:");
        String str = sc.next();
       // C:\Users\as371x\IdeaProjects\Project_1\Alexey.txt
        //C:\Users\as371x\IdeaProjects\Project_1\InAlexey.txt
        Path path = Paths.get(str);
        double size = path.toFile().length();
        System.out.println(path +" = "+size);

    }




    }

