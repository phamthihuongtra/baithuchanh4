package bthuchanh4;

import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileText(String filePath){
        try{
            File file = new File(filePath);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line="";
            int sum = 0;
            while ((line= br.readLine())!=null){
                System.out.println(line);
                sum +=Integer.parseInt(line);
            }
            br.close();
            System.out.println("Tổng="+sum);
        }catch (IOException e) {
            System.err.println("File không tồn tại");
        }
    }
public static void main(String[]args) {
        System.out.println(("Nhâp đường dẫn file:"));
    Scanner scanner = new Scanner(System.in);
    String path = scanner.nextLine();
    ReadFileExample readfilleEx = new ReadFileExample();
    readfilleEx.readFileText(path);
}

}
