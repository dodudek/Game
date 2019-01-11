import java.util.Objects;
import java.util.Random;

public class Game {

    public static void main(String[] args) {

        Random random = new Random();

        int w = 3;
        int [] tab = new int[w];

        System.out.print("Wylosowane przez Ciebie cyfry to: ");

        for(int i=0; i<tab.length; i++){
            tab[i]=random.nextInt(10);
            System.out.print( tab [i]+" ");

        }
        System.out.println(java.util.Arrays.toString(tab));

        int [] tabWin = {7,7,7};
        System.out.println(java.util.Arrays.toString(tabWin));

        public static boolean compareArrays(Object tabWin, Object tab ) {

            if (tab.equals(tabWin){
                System.out.println("Wygrałeś główną nagrodę!");
            }else{
                System.out.println("Spróbuj jeszcze raz!");
            }
        }



    }
}
