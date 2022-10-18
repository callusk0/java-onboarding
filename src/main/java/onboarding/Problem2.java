package onboarding;

<<<<<<< HEAD
public class Problem2 {
    public static String solution(String cryptogram) {
        String answer = "answer";
        answer = get_answer(cryptogram);
=======
import org.assertj.core.util.diff.DeleteDelta;

public class Problem2 {
    public static String solution(String cryptogram) {
        String answer = "answer";
        answer = get_answer();
>>>>>>> b918b25 (feat: setup precourse onboarding project)
        return answer;
    }

    public static String get_answer(String answer) {
        if(answer.length() <2)
            return answer;
<<<<<<< HEAD
            
        StringBuilder temp = new StringBuilder();
        boolean isSame = false;
        char x = answer.charAt(0);
        int a = 0;
        for(int i = 1; i < answer.length() ;i++){

            if(x == answer.charAt(i)){
                isSame = true;
            }
            if(x != answer.charAt(i)){
                if(isSame == false){
                    temp.append(x);
                    x = answer.charAt(i);
                    a++;
                }
                if(isSame == true){
                    isSame = false;
                    x = answer.charAt(i);
                }
            }
        }
        
        if( a== answer.length()- 1)
        {
            return answer;
        }

        if(x != answer.charAt(answer.length() - 2)){
            temp.append(x);
        }

        return get_answer(temp.toString());
    }

=======
        StringBuilder temp = new StringBuilder();
        //마지막 처리

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
>>>>>>> b918b25 (feat: setup precourse onboarding project)
}
