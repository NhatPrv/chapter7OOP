import java.util.Scanner;

class UnsignedIntegerException extends Exception {
    public UnsignedIntegerException(String str) {
        super(str);
    }
}

public class Ex3 {
    public static void Ex3(String s) throws UnsignedIntegerException {
        String numReg = "^\\d+$";
        Boolean b = s.matches(numReg);
        if (b == false) throw new UnsignedIntegerException("Dinh dang chuoi so nguyen duong khong hop le");
    }
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap chuoi so nguyen duong: ");
            String numStr = sc.nextLine();
            Ex3(numStr);
            sc.close();
        } catch (UnsignedIntegerException UIE) {
            System.out.println(UIE.getMessage());
        }
    }
}