class Solution {
    public int maxVowels(String s, int k) {
        int count = 0; 
        int maxcount =0;
         
         for (int i =0; i< k;i++){
            if ( isVowel(s.charAt(i))){
                count++;
            }
         }
         maxcount= count ;
         for(int i=k; i<s.length();i++){

            if (isVowel(s.charAt(i))){
                count++;
            }
            if (isVowel(s.charAt(i-k))){
                count--;
            }
            maxcount = Math.max(maxcount,count);
         }
         return maxcount;
            }
            private boolean isVowel(char c){

                return c== 'a'||c=='e'||c=='i'||c=='o'||c=='u';
            }
}