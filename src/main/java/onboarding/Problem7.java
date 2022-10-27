package onboarding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class Problem7 {
    public static List<String> solution(String user, List<List<String>> friends, List<String> visitors) {
        //각자 친구관계 맵
        //점수 맵
        //친구인 사람들의 친구들 점수 + 10
        //방문한 사람들 점수 + 1
        List<String> answer = Collections.emptyList();

        HashMap<String,List<String>> friends_map = new HashMap<String,List<String>>();

        friends_map = make_frends(friends);
        answer = make_answer(user, friends_map, visitors);

        return answer;
    }

    public static HashMap<String,List<String>> make_frends(List<List<String>> friends){
        HashMap<String,List<String>> friends_map = new HashMap<String,List<String>>();

        for(int i =0;i<friends.size();i++)
        {
            if(2 < friends.get(i).size()) //2보다 크면 잘못된 값
                break;
            if(friends_map.get(friends.get(i).get(0)) == null ? true : false)
            {
                List<String> templist = new ArrayList<>();
                templist.add(friends.get(i).get(1));
                friends_map.put(friends.get(i).get(0), templist);
            }
            if(friends_map.get(friends.get(i).get(1)) == null ? true : false)
            {
                List<String> templist = new ArrayList<>();
                templist.add(friends.get(i).get(0));
                friends_map.put(friends.get(i).get(1), templist);
            }
            
            
            if(friends_map.get(friends.get(i).get(0)) != null ? true : false)
            {
                if(!friends_map.get(friends.get(i).get(0)).contains(friends.get(i).get(1)))
                    friends_map.get(friends.get(i).get(0)).add(friends.get(i).get(1));
            }
            if(friends_map.get(friends.get(i).get(1)) != null ? true : false)
            {
                if(!friends_map.get(friends.get(i).get(1)).contains(friends.get(i).get(0)))
                    friends_map.get(friends.get(i).get(1)).add(friends.get(i).get(0));
            }
        }
        return friends_map;
    }

    public static List<String> make_answer(String user, HashMap<String,List<String>> friends_map, List<String> visitors){
        HashMap<String,Integer> scores = new HashMap<String,Integer>();
        List<String> userfriends = new ArrayList<String>();

        userfriends = friends_map.get(user);
        for(int i = 0;i<userfriends.size();i++)
        {
            if(userfriends.get(i) != null)
                scorefriends(scores, friends_map, userfriends.get(i));
        }

        for(int i = 0; i<visitors.size(); i++)
        {
            if(scores.get(visitors.get(i)) == null)
            {
                scores.put(visitors.get(i), 1);
            }
            else
            {
                scores.put(visitors.get(i), scores.get(visitors.get(i)) + 1);
            }
        }

        return sortedlist(userfriends, scores, user);

    }

    public static HashMap<String,Integer> scorefriends(HashMap<String,Integer> scores, HashMap<String,List<String>> friends_map, String freind) {
        List<String> friends_fr = new ArrayList<String>();

        if(friends_map.get(freind) == null)
            return scores;

        
        friends_fr = friends_map.get(freind);
        for(int i =0; i < friends_fr.size();i++)
        {
            if(scores.get(friends_fr.get(i)) == null)
            {
                scores.put(friends_fr.get(i), 10);
            }
            else
            {
                scores.put(friends_fr.get(i), scores.get(friends_fr.get(i)) + 10);
            }
        }
        return scores;
    }

    public static List<String> sortedlist(List<String> userfriends, HashMap<String,Integer> scores, String user) {

        List<String> topscores = new ArrayList<String>();
        List<String> sortkeys = new ArrayList<>(scores.keySet());
        sortkeys.sort(String.CASE_INSENSITIVE_ORDER); //알파벳순 정렬
        sortkeys.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return scores.get(o2).compareTo(scores.get(o1));
            }
        });

        for(int i = 0; i<sortkeys.size();i++)
        {
            if(topscores.size() >= 5)
                break;
            if(!userfriends.contains(sortkeys.get(i)) && sortkeys.get(i) != user)
            {
                topscores.add(sortkeys.get(i));
            }
        }

        return topscores;

    }

}
