class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stk= new Stack<>(); 
       
        stk.push(s.charAt(0));
        for(int i = 1; i<=s.length()-1 ; i++ ){
             char ch=s.charAt(i);
            if(!stk.empty()){
                if(ch == stk.peek() ){
                    stk.pop();
                }
                else{
                   stk.push(ch); 
                }
            }else{
                stk.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stk.empty()){
            sb.append(stk.pop());
        }
        return sb.reverse().toString();
    }
}
