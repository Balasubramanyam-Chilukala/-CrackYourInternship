class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack();
        for(int i=0;i<s.length();i++){
            char cc = s.charAt(i);
            if(cc=='(' || cc=='{' || cc=='['){
                st.push(cc);
            }else{ 
                if(st.isEmpty() ) {
                    return false;
                }
                if(((cc==')' && st.peek()=='(') || (cc==']' && st.peek()=='[') || (cc=='}' && st.peek()=='{'))){
                char x = st.pop();
            }else{
                return false;
            }
            }
        }
        if(st.isEmpty()){
            return true;
        } 
        return false;
    }
}
