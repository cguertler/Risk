import java.util.Arrays;
import java.util.Collections;

public class Risk {
    static Integer[] red = {0,0,0};
    static Integer[] white = {0,0};
    static int redWin;
    static int whiteWin;
    static int tie;

    public static void main(String[] args){

        for (int r1=1; r1 <= 6; r1++){
            for (int r2=1; r2 <= 6; r2++){
                for (int r3=1; r3 <= 6; r3++){
                    for (int w1=1; w1 <= 6; w1++){
                        for (int w2=1; w2 <= 6; w2++){
                            red[0] = r1;
                            red[1] = r2;
                            red[2] = r3;
                            white[0] = w1;
                            white[1] = w2;
                            if(red[2]< 2){
                                System.out.print("Before Sort: ");
                                System.out.print(white[0]);
                                System.out.println(white[1]);
                                Arrays.sort(white, Collections.reverseOrder());
                                System.out.print("After Sort:  ");
                                System.out.print(white[0]);
                                System.out.println(white[1]);
                            }
                        }
                    }
                }
            }
        }
        System.out.print("Hello!");
    }
}
