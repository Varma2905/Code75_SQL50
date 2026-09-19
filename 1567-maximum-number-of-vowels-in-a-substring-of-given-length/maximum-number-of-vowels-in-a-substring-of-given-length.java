class Solution {
    public int maxVowels(String s, int k) {
        int count=0;
        int max=0;

        for(int i=0;i<k;i++){
            if(isvowel(s.charAt(i))){
                count++;
            }
        }
        max=count;
        for(int i=k;i<s.length();i++){
            if(isvowel(s.charAt(i))){
                count++;
            }
            if(isvowel(s.charAt(i-k))){
                count--;
            }
            max=Math.max(count,max);
        }
        return max;
    }
    private boolean isvowel(char ch){
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
    }
}