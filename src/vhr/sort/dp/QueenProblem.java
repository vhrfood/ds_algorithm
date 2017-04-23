package vhr.sort.dp;

public class QueenProblem {

    public static void main(String args[]) {
        // four queen problem
        Integer[] pos = new Integer[4];
        int i=0;
        int j;
        while(i<4){
            for( j=0; j<4; j++){
                if(isValid(pos, i, j)){
                    pos[i]=j;
                    break;
                    
                }
            }
            if(j==4){
                j=pos[i]+1;
                pos[i] = null;
                i--;
                
            }
        }
        
        print(positions);

    }

    public static boolean isValid(Integer [] positions, int i, int j) {
        for (int index = 0; index < positions.length; index++) {
            if (i == index || j == positions[index] || (i - index) == (j - positions[index])) {
                return false;
            }

        }
        return true;
    }
    
    public static void print(int[] pos){
        for(int i =0 ; i <pos.length; i++){
            System.out.println("position of queen " + i + "is " + i +" "+ pos[i]);
        }
    }
}
