public class 이상한문자만들기 {
    public static void main(String[] args) {

        Solution sol = new Solution();
        System.out.println(sol.solution("try hello WORLD    "));
    }
}

class Solution {
    public String solution(String s) {
        String answer = "";
        // split(String regex, int limit);
        // 구분자를 바탕으로 배열 형식으로 문자열을 자르지만 limit 수만큼 자른다.
        // limit가 -1(음수)일 경우 배열의 마지막에 빈 문자열이 올 경우 빈 문자열이 그대로 유지
        String[] str = s.split(" ",-1);
        System.out.println(str.length);
        for(int i = 0; i < str.length; i++){
            for(int j = 0; j < str[i].length(); j++){
                String a = str[i].substring(j,j+1);
                if(j % 2 == 0){
                    a = a.toUpperCase();

                }else{
                    a = a.toLowerCase();
                }
                answer += a;
            }
         if(i == str.length-1){
             break;
         }
            answer += " ";
        }
        return answer;
    }
}
