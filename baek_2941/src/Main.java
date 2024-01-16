import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * 단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
         * č	c=
         * ć	c-
         * dž	dz=
         * đ	d-
         * lj	lj
         * nj	nj
         * š	s=
         * ž	z=
         */

        Scanner sc = new Scanner(System.in);
        String cral = sc.next();

        String [] list = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for(String i : list) {
            cral = cral.replaceAll(i,"a");
        }

        System.out.println(cral.length());

    }
}
