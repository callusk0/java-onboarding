package onboarding;

import java.util.List;

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;
        
        int pobi_score = get_score(pobi);
        int crong_score = get_score(crong);

<<<<<<< HEAD
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
=======
        if(pobi_score < 0 || crong_score < 0)
            return -1;
        if(pobi_score > crong_score)
            return 1;
        if(pobi_score < crong_score)
            return 2;
        if(pobi_score == crong_score)
            return 0;

        return answer;
    }

    public static int get_score(List<Integer> pages){
        int score = Integer.MAX_VALUE;
>>>>>>> b918b25 (feat: setup precourse onboarding project)
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

<<<<<<< HEAD
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
=======
        score = left_score >= right_score ? left_score : right_score;

        return score;
    }

    public static int get_pageScore(int num){
        int score = Integer.MAX_VALUE;

        int z = 0;

        if (num >= 100){
            z = num /100;
            num = num -z*100;
        }
        
        int x = num / 10;
        int y = num % 10;

        score = get_biggest(x, y, z);

        return score;
    }

    public static int get_biggest(int x, int y, int z){
        int score = Integer.MAX_VALUE;

        int sum = 0;
        int pro = 0;
        sum = x + y + z;
        if(z == 0)
            pro = x * y;
        else
            pro = x * y * z;
        
        score = sum >= pro ? sum : pro;

        return score;
>>>>>>> b918b25 (feat: setup precourse onboarding project)
    }

}