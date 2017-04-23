package vhr.list;

public class LongestSubsequence {

    public static void main(String args[]){
        String one="acbcf";
        String two="abcdaf";
        char[] row=one.toCharArray();
        char[] col=two.toCharArray();
        int rowSize=one.length()+1;
        int colSize=two.length()+1;
        int[][] array=new int[rowSize][colSize];
        for(int i=1; i<rowSize; i++){
            for(int j=1; j<colSize; j++){
                if(row[i-1] == col[j-1]){
                    array[i][j]=array[i-1][j-1] +1;
                }else{
                    array[i][j]=max(array[i][j-1], array[i-1][j]);
                }
               
            }
        }
        
        print(array);
    }
    
    public static int max(int a, int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
    
    public static void print(int arr[][]){
        for(int[] row: arr){
            for(int num:row){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
