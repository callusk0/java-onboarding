package onboarding;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class Problem6 {
    public static List<String> solution(List<List<String>> forms) {
        List<String> answer = List.of("answer");

        answer = get_answerList(forms);

        return answer;
    }

    public static List<String> get_answerList(List<List<String>> forms){
        List<String> answer = new ArrayList<String>();

        answer = divine(forms);


        return answer;
    }

    public static List<String> divine(List<List<String>> forms){
        List<String> temp = new ArrayList<String>();
        List<List<String>> divform = new ArrayList<List<String>>();
        String temp_string = new String();
        for(int i =0;i<forms.size();i++){
            temp = forms.get(i);
            temp_string = temp.get(1);
            if(temp_string.length() <=2 ){
                divform.add(temp);
            }
            else
            {
                List<String> divtempList = new ArrayList<String>();
                divtempList.add(temp.get(0));

                for(int j = 1; j < temp_string.length(); j++)
                {
                    StringBuilder tempSB = new StringBuilder();
                    tempSB.append(temp_string.charAt(j-1));
                    tempSB.append(temp_string.charAt(j));
                    divtempList.add(tempSB.toString());
                }
                divform.add(divtempList);
            }
        }

        return compare(divform);
    }

    public static List<String> compare(List<List<String>> compareList)
    {
        //1부터 이름 시작
        //중복 제거
        List<String> l_ans = new ArrayList<>();
        for(int i = compareList.size() - 1; i >= 0; i--)
        {
            List<String> temp = new ArrayList<>();
            temp = compareList.get(i);
            for(int j = 1; j < temp.size();j++)
            {
                String tempSt = temp.get(j);
                for(int k = i -1; k >= 0; k--)
                {
                    if(k < 0 || l_ans.contains(compareList.get(k).get(0)))
                        break;
                    for(int l = 1; l<compareList.get(k).size();l++)
                    {
                        if(tempSt.equals(compareList.get(k).get(l)))
                        {
                            if(!l_ans.contains(temp.get(0))){
                                l_ans.add(temp.get(0));
                            }
                            if(!l_ans.contains(compareList.get(k).get(0))){
                                l_ans.add(compareList.get(k).get(0));
                                break;
                            }
                        }
                    }

                }
            }
        }
        

        Collections.sort(l_ans, String.CASE_INSENSITIVE_ORDER);
        return l_ans;
    }

}
