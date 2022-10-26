package onboarding;


public class Problem3 {
    public static int solution(int number) {

        // 10당 3개씩 있고, 10의 자리 일 경우 + 10, 100의 자리 일 경우 + 100 등등

        

        int answer = get_clapnum(number);
        return answer;
    }

    public static int get_clapnum(int num){
        //재귀로 10 씩 곱해져서 나와야할까? 바로 계산?
        //10의 단위로 끊어서 계산 해보자 ex) 10개당 3 100개당 60

        // int calc_n = 0;
        // int div_n = num /10;
        // int rem_n = num %10;

        // if(rem_n < 3)
        //     calc_n = 0;
        // else if(rem_n < 6)
        //     calc_n = 1;
        // else if(rem_n < 9)
        //     calc_n = 2;
        // else if(rem_n >= 9)
        //     calc_n = 3;

        // calc_n += (div_n/10) * 3; 
        
        // if(div_n > 0)
        //     calc_n += get_clapnum(div_n) * 10;

        // if(div_n%3 == 0)
        // calc_n += num;

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
            int x = temp % (int)xnum;
            t_count += x * n_th;
            if(x == 3 || x == 6 || x == 9)
                t_count += num%xnum + 1;
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

        // if ((temp/10)%3 == 0)
        //     t_count += rem_n + 1;
        


        return t_count;
    }


}
