class Solution {
    public boolean isValid(String s) {
      /*  if(s.length()==1)
        return false;
       else {
        Stack<Character> ok=new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{' )
              ok.push(s.charAt(i));
            else if(s.charAt(i)==')')
            {
                if( ok.size()!=0  && ok.peek()=='(')
                ok.pop();
                else
                    return false;
            }
            else if(s.charAt(i)=='}')
            {
                if(ok.size()!=0 && ok.peek()=='{')
                ok.pop();
                else return false;
            }
            else if(s.charAt(i)==']')
            {
                if(ok.size()!=0 && ok.peek()=='[')
                ok.pop();
                else
                    return false;
            }
            
        }
      //  System.out.println(ok);
        if(ok.size()==0)
        return true;
        else
        return false;
    }   */  
            Stack<Character> ok = new Stack<>();

        for(char ch: s.toCharArray())
        {
            switch (ch)
            {
                case '(':
                case '{':
                case '[':
                    ok.push(ch);
                    break;
                case ')':
                    if(ok.isEmpty() || ok.pop() != '(')
                    {
                        return false;
                    }
                    break;
                case '}':
                    if(ok.isEmpty() || ok.pop() != '{')
                    {
                        return false;
                    }
                    break;
                case ']':
                    if(ok.isEmpty() ||  ok.pop() != '[')
                    {
                        return false;
                    }
                    break;
            }
        }

        return ok.isEmpty();  

    
    }
}