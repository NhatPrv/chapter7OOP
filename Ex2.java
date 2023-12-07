import java.util.Scanner;

class EmailAddressException extends Exception {
    EmailAddressException(String str) {
        super(str);
    }
}
public class Ex2 {
    public static void check(String str) throws EmailAddressException {
        int place = str.indexOf('@');
        if (place == -1) {
            throw new EmailAddressException("Khong hop le do khong chua '@'");
        }
        if (place == 0) {
            throw new EmailAddressException("Khong hop le do '@' khong duoc phep o vi tri dau tien");
        }
        if (place != -1) {
            throw new EmailAddressException("Khong hop le do co hon 1 '@'");
        }
        System.out.println("Dia chi email hop le");
    }
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap dia chi email: ");
            String email = sc.nextLine();
            check(email);
        } catch (EmailAddressException e) {
            System.out.println(e.getMessage());
        }
    }
}

