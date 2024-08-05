package pogrammers_Lv1;

import java.util.*;

class 두개뽑아서더하기 {
    public int[] solution(int[] numbers) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        
        for(int i = 0; i<numbers.length; i++){
            for(int j = i+1; j<numbers.length; j++){

                if(!queue.contains(numbers[i]+numbers[j])){
                    queue.add(numbers[i]+numbers[j]);
                }
                
            }
        }
        
        int[] answer = new int[queue.size()];
        int i = 0;
        while (!queue.isEmpty()) {
            answer[i++] = queue.poll();
        }
        
        return answer;
    }
}