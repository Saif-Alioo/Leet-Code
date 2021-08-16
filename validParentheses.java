class Solution {
    public boolean isValid(String s) {
        if(s.length() == 0) return false;
       boolean isBlanced = true;
    Stack<Character> stack = new Stack<>();
    
    for(int i = 0; i < s.length() && isBlanced; i++){
        char ch = s.charAt(i);
        switch(ch){
            case '(':
                stack.push(ch);
                break;
            case '{':
                stack.push(ch);
                break;
            case '[':
                stack.push(ch);
                break;
                
            case ')':
                
                if(stack.empty()){
                    isBlanced = false;
                }else if(stack.peek() != '('){
                    isBlanced = false;
                }else{
                    stack.pop();
                }
                
                break;
            case '}':
                if(stack.empty()){
                    isBlanced = false;
                }else if(stack.peek() != '{'){
                    isBlanced= false;
                }else{
                    stack.pop();
                }

                break;
            case ']':
                if(stack.empty()){
                   isBlanced = false;
                }else if(stack.peek() != '['){
                    isBlanced = false;
                }else{
                    stack.pop();
                }
                
                break;
                
        }
        
    }
    
    if(!stack.empty()){isBlanced = false;}
    return isBlanced;
    
    }
}
