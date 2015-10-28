import java.util.InputMismatchException;
import java.util.Scanner;

import static com.sun.org.apache.xalan.internal.lib.ExsltMath.sqrt;


public class startApplication {



    public static void main(String[]args){
        startApplication app = new startApplication();
        float a=app.inputData("a");
        float b=app.inputData("b");
        float c=app.inputData("c");

        if (app.findMainX(a,b,c).length==0){
            System.out.println("No results, becouse discriminant<0 ");
        }

        if (app.findMainX(a,b,c).length==1){
            System.out.println("1 result ");
            app.outData(app.findMainX(a,b,c));
        }
        if (app.findMainX(a,b,c).length==2){
            System.out.println("2 results");
            app.outData(app.findMainX(a,b,c));

        }
        if (app.findMainX(a,b,c).length==3){
            System.out.println("Infinite set results");
        }
        }

    public float inputData(String koef){
        float k =0;
        boolean condition=false;
        do {
            try {
                System.out.print("Enter "+koef+" = ");
                Scanner cs = new Scanner(System.in);
                k = cs.nextFloat();
                condition=true;
            } catch (InputMismatchException ex) {
                System.out.println("Error");
            }
        }
        while (condition==false);
        return k;
    }


    public void outData(double[]arr){
            for (int i=0;i<arr.length;i++){
                String FormattedDouble=String.format("%.4f",arr[i]);
                System.out.print(FormattedDouble+" ");
            }
        }




    public float discriminant(float a,float b, float c){
        float d;
         d=b*b-(4*a*c);
        return d;
    }

    public double[] findMainX(float a, float b, float c) {
        double[] arr=new double[2];

        if ((a == 0) && (b != 0) && (c != 0)) {
            double[] x=new double[1];
            x[0]=-c/b;
            return x;
        }

        if (a != 0) {
            float d = discriminant(a, b, c);
            if (d >= 0) {
                double[] x=new double[2];
                x[0]=(-b-sqrt(b*b-4*a*c))/(2*a);
                x[1]=(-b+sqrt(b*b-4*a*c))/(2*a);
                return x;

            }
            if (d < 0) {
                double[] x=new double[0];
                return x;
            }
        }


        if ((a==0)&&(b==0)&&(c==0)) {
            double[] x=new double[3];
            return x;
        }

        return arr;
    }



}
