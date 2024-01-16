import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * 입력은 여러 테스트 케이스로 이루어져 있다. 각 테스트 케이스는 10,000이 넘지않는 두 자연수로 이루어져 있다.
         * 마지막 줄에는 0이 2개 주어진다. 두 수가 같은 경우는 없다.
         * 각 테스트 케이스마다 첫 번째 숫자가 두 번째 숫자의 약수라면 factor를, 배수라면 multiple을, 둘 다 아니라면 neither를 출력한다.
         */

        Scanner sc = new Scanner(System.in);
        List<String> result_list = new ArrayList();
        String input = "";
        int a = 0;
        int b = 0;

        while(true) {
            input = sc.nextLine();
            a = Integer.valueOf(input.split(" ")[0]);
            b = Integer.valueOf(input.split(" ")[1]);

            if(a==0 && b==0) {
                break;
            } else if ( a<b && b%a==0) {
                result_list.add("factor");
            } else if ( a>b && a%b==0) {
                result_list.add("multiple");
            } else  {
                result_list.add("neither");
            }

        }

        for( String r : result_list) {
            System.out.println(r);
        }
    }

}
