package Parentheses;

public class RemoveParenthesesDriver 
{
	public static void main (String[] args)
	{
		String S = "(()())(())";
		System.out.println("Let's remove outermost parentheses from: " + S);
		System.out.print(removeOutermostParentheses(S));
	} // end main

    public static String removeOutermostParentheses(String S) 
    {
		StringBuilder s = new StringBuilder();
		int opened = 0;
		for (char c : S.toCharArray()) 
		{
		    if (c == '(' && opened++ > 0) s.append(c);
		    if (c == ')' && opened-- > 1) s.append(c);
		}
        return s.toString();
    } // end removeOutermostParentheses
} // end class RemoveParentheseDriver