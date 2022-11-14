import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Check {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Bai22.txt");
        var readFile = new Scanner(file);
        while(readFile.hasNextInt()) {
            var day = readFile.nextInt();
            var month = readFile.nextInt();
            var result ="" ;
            if( (day >= 21 && month == 3) || (day <= 20 && month == 4)) {
                result = "bach duong";
            } else if((day >= 21 && month == 4) || (day <= 20 && month == 5)) {
                result = "kim nguu";
            } else if((day >= 21 && month == 5) || (day <= 21 && month == 6)) {
                result ="cu giai";
            } else if ((day >= 23 && month == 7) || (day <= 22 && month == 8)) {
                result= "su tu";
            } else if((day >= 23 && month == 8) || (day <= 22 && month == 9)){
                result= "xu nu";
            } else if((day >= 23 && month == 9) || (day <= 23 && month == 10)) {
                result = "thien binh";
            } else if((day >= 24 && month == 10) || (day <= 22 && month == 11)) {
                result = "bo cap";
            } else if((day >= 23 && month == 11) || (day <= 21 && month == 12)) {
                result = "nhan ma";
            } else if((day >= 22 && month == 12) || (day <= 19 && month == 1)) {
                result = "ma ket";
            } else if((day >= 20 && month == 1) || (day <= 18 && month == 2)) {
                result = "bao binh";
            } else if((day >= 19 && month == 2) || (day <= 20 && month == 3)) {
                result = "song ngu";
            } else {
                result = "gia tri khong hop le";
            }
            System.out.println(result);
        }

    }
}