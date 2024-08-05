package pogrammers_Lv1;

import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] st1 = {1,2,3,4,5};
        int[] st2 = {2,1,2,3,2,4,2,5};
        int[] st3 = {3,3,1,1,2,2,4,4,5,5};
        
        int[] rank = new int[3];
        
        for(int i = 0; i<answers.length; i++){
            if(answers[i] == st1[i%5]){
                rank[0]++;
            }
            if(answers[i] == st2[i%8]){
                rank[1]++;
            }
            if(answers[i] == st3[i%10]){
                rank[2]++;
            }
        }
        
        int max = rank[0];
        for(int i = 1; i<3; i++){
            if(rank[i]>max){
                max = rank[i];
            }
        }
        
        int[] result = new int[3];
        int p = 0;
        for(int i = 0; i<3; i++){
            if(rank[i] == max){
                result[p++] = i+1;
            }
        }
        
        return Arrays.copyOf(result, p);
    }
}