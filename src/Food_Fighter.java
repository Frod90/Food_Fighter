import java.util.*;

public class Food_Fighter {
    public static void main(String[] args){
        int[] food = {1,3,4,6};
        Solution s = new Solution();
        String str = s.solution(food);
        System.out.println(str);

    }
}
class Solution {
    public String solution(int[] food) {


        int len =0;
        for(int a =0; a<food.length; a++){
            len += (int)(food[a]/2);
        }

        int[] result =new int[len*2+1];
        int k =0;

        for(int i=1; i<food.length; i++){

            for(int j=0; j<(int)(food[i]/2); j++ ){
                result[j+k] = i;
            }
            k += (int)(food[i]/2);
        }
        result[len] = 0;

        for(int i=food.length-1; i>0; i-- ){
            for(int j=0; j<(int)(food[i]/2); j++ ){
                result[j+k+1] = i;
            }
            k += (int)(food[i]/2);
        }

        int count1 =0;
        for(int i=0; i<result.length; i++){
            if( result[i] == 1){
                count1++;
            }
        }

        int count2 =0;
        for(int i=0; i<result.length; i++){
            if( result[i] == 2){
                count2++;
            }
        }

        int count3 =0;
        for(int i=0; i<result.length; i++){
            if( result[i] == 3){
                count3++;
            }
        }

        String str1 = "1번 음식 " +count1/2 +"개, ",
                str2 = "2번 음식 " +count2/2 +"개, ",
                str3 = "3번 음식 " +count3/2 +"개";
        if(count1==0){
            str1 = "";
        }else if(count2==0){
            str2 = "";
        }else if(count3==0){
            str3 = "";
        }
        String string = "";
        for(int i=0; i< result.length; i++){
            string += result[i];
        }

        String answer = "두 선수는 " +str1 +str2 +str3 +"를 먹게 되므로 배치는 " +string +"입니다.";
        return answer;
    }
}