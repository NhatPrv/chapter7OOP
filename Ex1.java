import java.util.*;

public class Ex1 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap chuoi so nguyen: ");
            String s = sc.nextLine();
            int num = Integer.parseInt(s);
            System.out.println(num);
        } catch (NumberFormatException nfe) {
            System.out.println("Chuoi nhap vao khong dung dinh dang");
        }
    }
}