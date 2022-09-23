import java.util.Scanner;

public class Soloution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the dividend please: ");
        int dividend=sc.nextInt();
        System.out.println("Enter the divisor please: ");
        int divisor=sc.nextInt();
        System.out.println(divide(dividend,divisor));


    }
    public static int divide(int dividend, int divisor) {
        if(dividend==divisor)return 1;
        else if (dividend==-divisor || -dividend==divisor)return -1;
        else if (dividend==0) return 0;
        else if (divisor==1) return dividend;
        else if (divisor==-1){
            if (dividend==Integer.MIN_VALUE)return Integer.MAX_VALUE;
            else return -dividend;
            }
        else if(dividend>0 && divisor>0){
            int counter=0;
            while (dividend>divisor){
                dividend-=divisor;
                counter++;
            }
            return counter;
        }
        else if(dividend<0 && divisor<0){
            int counter=0;

            if(dividend==Integer.MIN_VALUE){
                long div=(long) dividend;
                div= -div;
                divisor= -divisor;
                while (div>divisor){
                    div -= divisor;
                    counter++;

                }

                return counter;



            }
            else if(divisor==Integer.MIN_VALUE)return 0;
            else {
                dividend= -dividend;
                divisor= -divisor;

                while (dividend>divisor){
                    dividend-=divisor;
                    counter++;
                }
                return counter;

            }


        }
        else if(dividend<0 && divisor>0){
            int counter=1;
            if (dividend==Integer.MIN_VALUE){
                counter=1;
                long div=(long) dividend;
                div= -div;

                while (div>divisor){
                    div -= divisor;
                    counter++;

                }

                return -counter;

            }
            else  {

                dividend= -dividend;
                while (dividend>divisor){
                    dividend -= divisor;
                    counter++;

                }

                return -counter;


            }


        }
        else if(dividend>0 && divisor<0){
            int counter=0;
            if(divisor==Integer.MIN_VALUE)return 0;
            else {
                divisor = -divisor;
                while (dividend>divisor){
                    dividend -= divisor;
                    counter++;
                }
                return -counter;


            }





        }
        else {return 0;}


    }
}
