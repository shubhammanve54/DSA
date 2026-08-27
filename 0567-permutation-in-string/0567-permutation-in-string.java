class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if ( s1.length()>s2.length()){
            return false;
        }
        int[] count = new int [26];
        for(char c  :s1.toCharArray()){
            count[c -'a']++;
        }
        int left =0;
        for(int right =0; right <s2.length(); right++){
            count[s2.charAt(right)-'a']--;
            if(right - left +1> s1.length()){
                count [s2.charAt(left)-'a']++;
                left++;
            }
            if (right -left +1== s1.length()){
                boolean match = true; 
                for(int i=0; i< 26; i++){
                    if(count [i] !=0){
                        match = false;
                        break;
                    }
                }
                if (match){
                    return true;
                }
            }

        }
       return false; 
    }
}