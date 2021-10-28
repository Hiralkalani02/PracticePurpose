package HomePactice;

public class WhileLoop {
    public static void main(String[] args) {
        //To print odd numbers up to 20
        int i = 1;

        System.out.println("Printing odd numbers");

        {
            while (i < 20) {

                System.out.println(i);
                i = i + 2;
            }
            //To print even numbers up to 20
            System.out.println("Printing even numbers");
        }


        {  int j= 0;
            while (j <= 20)
            {

                System.out.println(j);
                j = j + 2;

            }

        }
    }}
