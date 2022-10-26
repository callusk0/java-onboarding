package onboarding;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Problem5 {
    public static List<Integer> solution(int money) {
        List<Integer> answer = Collections.emptyList();

        answer = get_answer(money);

        return answer;
    }

    public static List<Integer> get_answer( int money){

        List<Integer> answer = new LinkedList<Integer>();
        int temp = 0;

        //50000
        answer.add(money/50000);
        temp = money%50000;
        //10000
        answer.add(temp/10000);
        temp = temp%10000;
        //5000
        answer.add(temp/5000);
        temp = temp%5000;
        //1000
        answer.add(temp/1000);
        temp = temp%1000;
        //500
        answer.add(temp/500);
        temp = temp%500;
        //100
        answer.add(temp/100);
        temp = temp%100;
        //50
        answer.add(temp/50);
        temp = temp%50;
        //10
        answer.add(temp/10);
        temp = temp%10;
        //1
        answer.add(temp/1);
        temp = temp%1;

        return answer;
    }
}
