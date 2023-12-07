import java.util.Scanner;
class WebAddressException extends Exception {
    public WebAddressException(String str) {
        super(str);
    }
}

public class Ex4 {
    public static void Ex4(String s) throws WebAddressException {
        String numReg = "^https?://(\\w-]+\\.)+[\\w-]+(/[\\w-./?%=]*)";
        Boolean b = s.matches(numReg); 
        if (b == false) throw new WebAddressException("Dia chi web khong hop le");
        else System.out.println("Dia chi web hop le");
    }
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap dia chi web: ");
            String webAdd = sc.nextLine();
            Ex4(webAdd);
        } catch (WebAddressException e) {
            System.out.println(e.getMessage());
        }
    }
}
