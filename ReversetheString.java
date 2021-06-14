class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        char temp;
        for (int i=0;i<n/2;i++){
           temp=s[i];
            s[i]=s[n-1-i];
            s[n-1-i]=temp;
        }
    }
}
