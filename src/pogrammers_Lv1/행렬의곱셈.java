package pogrammers_Lv1;

class ����ǰ��� {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int width = arr2[0].length;
        int height = arr1.length;
        int commonLength = arr1[0].length;       

        int[][] result = new int[height][width];

        for(int i = 0; i<height; i++){
            for(int j = 0; j<width; j++){
                for (int k = 0; k < commonLength; k++) {
                    result[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        
        return result;
    }
}