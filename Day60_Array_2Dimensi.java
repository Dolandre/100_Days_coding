package dolandre_Febrianto;

public class Day60_Array_2Dimensi {
    public static void main(String[] args) {
        String [][] mhs = new String [3][3];
        
        mhs [0][0] = "Dolan";
        mhs [0][1] = "Andre";
        mhs [0][2] = "Febri";
        mhs [1][0] = "Anto";
        mhs [1][1] = "Dilan";
        mhs [1][2] = "Yunus";
        mhs [2][0] = "Gbriel";
        mhs [2][1] = "Anis";
        mhs [2][2] = "Frans";
        
        for (int i = 0; i < mhs.length; i++) {
            
            for (int j = 0; j < mhs[i].length; j++) {
                
                System.out.println(mhs[i][j] + " ");
            }
            System.out.println();
        }
        
        
    }
    
}
