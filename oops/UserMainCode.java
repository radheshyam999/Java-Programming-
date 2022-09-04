package oops;


 class UserMainCode {
    static String ans= ""; 
    static void printSubStr(
        String str, int low, int high)
    {
        ans= str.substring(low, high + 1);
    }
 

    static int longestPalSubstr(String str)
    {
        
        int n = str.length();
 
        boolean table[][] = new boolean[n][n];
        int maxLength = 1;
        for (int i = 0; i < n; ++i)
            table[i][i] = true;
        int start = 0;
        for (int i = 0; i < n - 1; ++i) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                table[i][i + 1] = true;
                start = i;
                maxLength = 2;
            }
        }
 
        for (int k = 3; k <= n; ++k) {
 
            
            for (int i = 0; i < n - k + 1; ++i) {

                int j = i + k - 1;
                    if (table[i + 1][j - 1]
                    && str.charAt(i) == str.charAt(j)) {
                    table[i][j] = true;
 
                    if (k > maxLength) {
                        start = i;
                        maxLength = k;
                    }
                }
            }
        }
        printSubStr(str, start,
                    start + maxLength - 1);
 
        
        return maxLength;
    }
 
    public String game(String input1){
        longestPalSubstr(input1);
        
        

      return ans;  
        //throw new UnsupportedOperationException("game(String input1)");
    }
    
    

public static void main(String[] args) {
    new UserMainCode().game("sdhjdhfskjfhdskjfAAAA");

    System.out.println(ans);
}



}
 