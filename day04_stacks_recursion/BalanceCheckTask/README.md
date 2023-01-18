
# Question: 
* How do we check if the expressions are balanced with the opening and closing delimiters?
* Open brackets must be closed by the same type of brackets.
* Open brackets must be closed in the correct order.
* Every close bracket has a corresponding open bracket of the same type.


## Examples
*            EXAMPLE          VALİD          DESCRIPTION            
*            (A+B)+(C-D)      Yes            Symbols are balanced.
*            ((A+B)+(C-D)     No             One Closing brace missing
*            ((A+B)+[C-D])    Yes            Symbols are balanced.
*            ((A+B)+[C-D]}    No             The last closing brace does not match the first opening paranthesis
