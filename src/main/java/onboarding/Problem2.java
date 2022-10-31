package onboarding;

public class Problem2 {
    public static String solution(String cryptogram) {
        String answer = "answer";
        answer = get_answer(cryptogram);
        return answer;
    }

    public static String get_answer(String answer) {
        if(answer.length() <2)
            return answer;
            
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

    
    // private static String get_answer(String cryptogram) {
    //     if(cryptogram.length()<2)
    //         return cryptogram;
        
    //     Queue<Character> answer_queue = new LinkedList<>();

    //     make_answer_queue(cryptogram, answer_queue);
    //     answer_queue = make_answer_string(answer_queue);
        
    //     StringBuilder x = new StringBuilder();
    //     while(!answer_queue.isEmpty())
    //     {
    //         x.append(answer_queue.poll());
    //     }

    //     return x.toString();
    // }

    // private static Queue<Character> make_answer_string(Queue<Character> answer_queue) {
    //     if(answer_queue.size()<2)
    //         return answer_queue;
    //     char a,b  = 0;
    //     int answer_queue_size = answer_queue.size();

    //     a = answer_queue.poll();
    //     b = answer_queue.poll();
    //     Queue<Character> x = new LinkedList<>();

    //     while(true)
    //     {
    //         if(a != b)
    //             x.add(a);
    //         if(a == b)
    //         {
    //             while(a == b){
    //                 if(answer_queue.isEmpty())
    //                     break;
    //                 b=answer_queue.poll();
    //             }
    //         }
    //         if(answer_queue.isEmpty())
    //             break;
    //         a = b;
    //         b=answer_queue.poll();

    //     }
    //     if (a != b)
    //         x.add(b);
    //     if(answer_queue_size == x.size())
    //         return x;
    //     return make_answer_string(x);
    // }

    // private static void make_answer_queue(String cryptogram, Queue<Character> answer_queue) {
    //     for(int i =0;i<cryptogram.length();i++)
    //     {
    //         answer_queue.add(cryptogram.charAt(i));
    //     }
    // }

}
