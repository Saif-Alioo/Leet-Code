class Solution {
    public int titleToNumber(String columnTitle) {
        int ans=0;
        int pow=1;
        int len=columnTitle.length();
        for(int i=len-1;i>=0;i--){
            char []ch=columnTitle.toCharArray();
            ans=ans+(ch[i]-64)*pow;
            pow=pow*26;
        }
        return ans;
    }
}
