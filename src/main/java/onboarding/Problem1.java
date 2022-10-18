package onboarding;

import java.util.List;

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;
        
        int pobi_score = get_score(pobi);
        int crong_score = get_score(crong);

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
    }

}