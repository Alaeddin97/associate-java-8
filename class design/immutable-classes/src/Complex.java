public class Complex {

    private  final double real;
    private final double imaginary;

    public Complex(double real,double imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }

    double getReal(){
        return real;
    }
    double getImaginary(){
        return imaginary;
    }

    public Complex plus(Complex a){
        return new Complex(real+a.real,imaginary+a.imaginary);
    }

    @Override
    public String toString() {
        return "Complex{" +
                "real=" + real +
                ", imaginary=" + imaginary +
                '}';
    }

    public static void main(String[] args) {
        Complex complex=new Complex(4.4,4.9);
        Complex complex1=new Complex(3.3,4.4);
         Complex newComplex=complex1.plus(complex);
        System.out.println(newComplex.toString());
    }

}
