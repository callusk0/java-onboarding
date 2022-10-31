<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 53bf1c5 (제출)
package onboarding;


public class Problem3 {
    public static int solution(int number) {
        
        int answer = get_clapnum(number);

        return answer;
    }

    public static int get_clapnum(int num){
        //전체 바로 계산?
        //10의 단위로 끊어서 계산 해보자 ex) 10개당 3 100개당 60

        int answerNum = 0;
        
        //자릿수
        int digit = get_digit(num);
        
        answerNum = get_answer_over_ten(num, answerNum, digit);
        
        // 10 = 3 100 (10 * 3 + 10 * 3)= 60 1000(10 * 60 + 100 * 3) = 900
        
        answerNum = get_answer_one_seat(num, answerNum);       


        return answerNum;
    }

    private static int get_answer_one_seat(int num, int answerNum) {
        int oneSeat = 0;
        oneSeat = num % 10;
        //10개당 3
        //1의 자리
        if(oneSeat < 3)
            answerNum += 0;
        else if(oneSeat < 6)
            answerNum += 1;
        else if(oneSeat < 9)
            answerNum += 2;
        else if(oneSeat == 9)
            answerNum += 3;
        return answerNum;
    }

    private static int get_answer_over_ten(int num, int answerNum, int digit) {
        int temp = num;
        int numPerDigit = 3;
        for(int i=1;i<digit; i++)
        {
            int xnum = (int)Math.pow(10,i);
            temp = num/xnum;
            int x = temp % 10;
            answerNum += x * numPerDigit;
            if(x == 3 || x == 6 || x == 9)
                answerNum += (num%xnum) + 1;
            if (x < 4)
                answerNum += 0 * xnum; 
            else if (x < 7)
                answerNum += 1 * xnum; 
            else if (x < 9)
                answerNum += 2 * xnum;
            numPerDigit = numPerDigit*10 + (int)xnum*3;
        }
        return answerNum;
    }

    private static int get_digit(int num) {
        int temp = num;
        int digit = 0;
        while(temp > 0)
        {
            digit++;
            temp = temp/10;
        }
        return digit;
    }

}
<<<<<<< HEAD
=======
package onboarding;


public class Problem3 {
    public static int solution(int number) {
        
        int answer = get_clapnum(number);

        return answer;
    }

    public static int get_clapnum(int num){
        //전체 바로 계산?
        //10의 단위로 끊어서 계산 해보자 ex) 10개당 3 100개당 60

        int temp = 0;
        int t_count = 0;
        int rem_n = 0;

        //자릿수
        int ten_n = 0;
        temp = num;
        while(temp > 0)
        {
            ten_n++;
            temp = temp/10;
        }

        
        int n_th = 3;
        for(int i=1;i<ten_n; i++)
        {
            double xnum = Math.pow(10,i);
            temp = num/(int)xnum;
            int x = temp % 10;
            t_count += x * n_th;
            if(x == 3 || x == 6 || x == 9)
                t_count += (num%xnum) + 1;
            if (x < 4)
                t_count += 0 * xnum; 
            else if (x < 7)
                t_count += 1 * xnum; 
            else if (x < 9)
                t_count += 2 * xnum;
            n_th = n_th*10 + (int)xnum*3;
        }

        // 10 = 3 100 (10 * 3 + 10 * 3)= 60 1000(10 * 60 + 100 * 3) = 900

        temp = num;
        rem_n = num % 10;
        //10개당 3
        //1의 자리
        if(rem_n < 3)
            t_count += 0;
        else if(rem_n < 6)
            t_count += 1;
        else if(rem_n < 9)
            t_count += 2;
        else if(rem_n == 9)
            t_count += 3;       


        return t_count;
    }


}
>>>>>>> 6d54423 (리팩토링 시작)
=======
>>>>>>> 53bf1c5 (제출)
