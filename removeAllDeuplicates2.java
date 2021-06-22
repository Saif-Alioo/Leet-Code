class Solution {
    
    public String removeDuplicates(String s, int k) {
        Stack<int[]> stack = new Stack();
        for(char i : s.toCharArray()){
            if(!stack.isEmpty() && stack.peek()[0] == i){
                stack.peek()[1]++;
            }else{
                stack.push(new int[]{i,1});
            }
            
            if(stack.peek()[1] == k){
                stack.pop();
            }
        }
        StringBuilder result = new StringBuilder();
        
        while(!stack.isEmpty()){
            int len = stack.peek()[1];
            char ch = (char)stack.pop()[0];
            while(len>0){
                result.append(ch);
                len--;
            }
        }
        
        return result.reverse().toString();
        // int count=1;
        // for(int i=1;i<s.length();i++){
        //     if(s.charAt(i)==s.charAt(i-1)){
        //         count++;
        //     }else{
        //         count=1;
        //     }
        //     if(count==k){
        //         String reduced=s.substring(0,i-k+1)+s.substring(i+1);
        //         return removeDuplicates(reduced,k);
        //     }
        // }
        // return s;
    }
}
