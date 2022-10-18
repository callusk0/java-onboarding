package onboarding;

import org.assertj.core.util.diff.DeleteDelta;

public class Problem2 {
    public static String solution(String cryptogram) {
        String answer = "answer";
        answer = get_answer();
        return answer;
    }

    public static String get_answer(String answer) {
        if(answer.length() <2)
            return answer;
        StringBuilder temp = new StringBuilder();
        마지막 처리

        char x = answer.charAt(0);
        for(int i = 1; i < answer.length() ;i++){
            if(x == answer.charAt(i)){
            }
            else{
                temp.append(x);
                x = answer.charAt(i);
            }
        }
        String temp_string = temp.toString();
        if(temp_string.charAt(temp_string.length()) !=  )

        return temp.toString();
    }
}
