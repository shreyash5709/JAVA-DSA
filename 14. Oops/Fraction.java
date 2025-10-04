public class Fraction {

    public static int GCD(int num, int den){
        if(den%num==0) return num;
        return GCD(den%num, num);
    }

    public static fraction add(fraction f1, fraction f2){
        int numerator = f1.num*f2.den + f2.num*f1.den;
        int denominator = f1.den*f2.den;
        f1.num = numerator;
        f1.den = denominator;
        return f1;
    }
    public static fraction mul(fraction f1, fraction f2){
        int numerator = f1.num*f2.num;
        int denominator = f1.den*f2.den;
        fraction f3 = new fraction(numerator, denominator);
        return f3;
    }

    public static class fraction{
        int num;
        int den;
        public fraction(){}
        public fraction(int num, int den){
            this.num = num;
            this.den = den;
            simplify();
        }
        public void simplify(){
            int hcf = GCD(num, den);
            den /= hcf;
            num /= hcf;
        }
    }
    public static void main(String[] args) {
        fraction f1 = new fraction(35 , 21);
        System.out.println(f1.num + "/" + f1.den);
        fraction f2 = new fraction(7, 3);
        System.out.println(f2.num + "/" + f2.den);
        add(f1, f2);
        f1.simplify();
        System.out.println(f1.num + "/" + f1.den);
    }
}
