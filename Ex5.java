class FractionException extends Exception {
    public FractionException (String str) {
        super(str);
    }
}

class FractionDivideByZeroException extends Exception {
    public FractionDivideByZeroException (String str) {
        super(str);
    }
}

public class Ex5 {
    private int numerator;
    private int denominator;
    public Ex5(int num1, int num2) throws FractionException, FractionDivideByZeroException {
        if (num2 == 0) throw new FractionException("Loi do mau so = 0");
        this.numerator = num1;
        this.denominator = num2;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    public static Ex5 divide(Ex5 frac1, Ex5 frac2) throws FractionDivideByZeroException,FractionException {
        if (frac2.numerator == 0) {
            throw new FractionDivideByZeroException("Loi do chia cho 0");
        }
        return new Ex5(frac1.numerator*frac2.denominator, frac1.denominator*frac2.numerator);
    }
    public static void main(String[] args) throws FractionDivideByZeroException {
        Ex5 fr1, fr2;
        try {
            fr1 = new Ex5(1,2);
            fr2 = new Ex5(0,1);
            Ex5 tmp = divide(fr1, fr2);
            System.out.println(tmp);
        } catch (FractionException e) {
            System.out.println(e.getMessage());
        }
    }

}
