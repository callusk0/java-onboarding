<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 53bf1c5 (제출)
package onboarding;

import java.util.List;

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;
        
        int pobi_score = get_score(pobi);
        int crong_score = get_score(crong);

        answer = who_wins(pobi_score, crong_score);

        return answer;
    }

    public static int who_wins(int x, int y) {
        if(x < 0 || y < 0)
            return -1;
        if(x == y)
            return 0;
        if(x > y)
            return 1;
        if(x < y)
            return 2;
        return -1;
    }


    public static int get_score(List<Integer> pages){
        if (pages.size() < 0 || pages.size() > 2)
            return -1;
        int left = pages.get(0);
        int right = pages.get(1);

        if(left%2 !=1 || right%2 != 0)
            return -1;
        if (right - left != 1)
            return -1;

        int left_score = get_pageScore(left);
        int right_score = get_pageScore(right);

        return left_score >= right_score ? left_score : right_score;
    }

    public static int get_pageScore(int num){
        int hen = 0;

        if (num >= 100){
            hen = num /100;
            num = num -hen*100;
        }
        
        int ten = num / 10;
        int one = num % 10;

        return get_biggest(one, ten, hen);
    }

    public static int get_biggest(int one, int ten, int hen){

        int sum = 0;
        int pro = 0;
        sum = one + ten + hen;

        if(hen != 0 && ten != 0)
            pro = one * ten * hen;
        else if(hen == 0 && ten != 0)
            pro = one * ten;
        else if(hen == 0 && ten == 0)
            pro = one;

        return sum >= pro ? sum : pro;
    }

<<<<<<< HEAD
=======
package onboarding;

import java.util.List;

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;
        
        int pobi_score = get_score(pobi);
        int crong_score = get_score(crong);

        answer = who_wins(pobi_score, crong_score);

        return answer;
    }

    public static int who_wins(int x, int y) {
        if(x < 0 || y < 0)
            return -1;
        if(x == y)
            return 0;
        if(x > y)
            return 1;
        if(x < y)
            return 2;
        return -1;
    }


    public static int get_score(List<Integer> pages){
        int score = Integer.MAX_VALUE;
        if (pages.size() < 0 || pages.size() > 2)
            return -1;
        int left = pages.get(0);
        int right = pages.get(1);

        if(left%2 !=1 || right%2 != 0)
            return -1;
        if (right - left != 1)
            return -1;

        int left_score = get_pageScore(left);
        int right_score = get_pageScore(right);

        score = left_score >= right_score ? left_score : right_score;

        return score;
    }

    public static int get_pageScore(int num){
        int score = Integer.MAX_VALUE;

        int hen = 0;

        if (num >= 100){
            hen = num /100;
            num = num -hen*100;
        }
        
        int ten = num / 10;
        int one = num % 10;

        score = get_biggest(one, ten, hen);

        return score;
    }

    public static int get_biggest(int x, int y, int z){
        int score = Integer.MAX_VALUE;

        int sum = 0;
        int pro = 0;
        sum = x + y + z;

        if(z != 0 && y != 0)
            pro = x * y * z;
        else if(z == 0 && y != 0)
            pro = x * y;
        else if(z == 0 && y == 0)
            pro = x;
        
        score = sum >= pro ? sum : pro;

        return score;
    }

>>>>>>> 70ce538 (gradlew 빌드 테스트)
=======
>>>>>>> 53bf1c5 (제출)
}