# MyFiles

Create a new java ﬁle called MyFile.java

Write code to read the content of the text ﬁle input.txt. For each line in
input.txt, write a new line in the new text ﬁle test.txt that computes
the answer to some operation on a list of numbers.

If the input.txt has the following:
       
       Min: 1,2,3,5,6

       Max: 1,2,3,5,6

       Avg: 1,2,3,5,6

Your program should generate test.txt as follows:

       The min [1, 2, 3, 5, 6] is 1.
  
       The max of [1, 2, 3, 5, 6] is 6.
       
       The avg of [1, 2, 3, 5, 6] is 3.4.

Assume that the only operations given in the input ﬁle are min, max and
avg and that a list of comma-separated integers always follows the
operation. You should deﬁne the functions min, max and avg that take in
a list of integers and return the min, max or avg of the list.

Your program should handle any combination of operations and any
length of input numbers. You can assume that the list of input numbers
are always valid integers and that the list is never empty.

Modify your MyFile.java ﬁle to do the following:

Change your program to additionally handle the operation “px” where x is
a number f rom 10 to 90 and deﬁnes the x percentile of the list of numbers.
E.g.:

         Input.txt:

         Min: 1,2,3,5,6
         
         Max: 1,2,3,5,6
         
         Avg: 1,2,3,5,6
         
         P90: 1,2,3,4,5,6,7,8,9,10
         
         Sum: 1,2,3,5,6
         
         P70: 1,2,3

Your output.txt should read:
         
         The min [1,2,3,5,6] is 1.
         
         The max of [1,2,3,5,6] is 6.
         
         The avg of [1,2,3,5,6] is 3.4.
         
         The 90th percentile of [1,2,3,4,5,6,7,8,9,10] is 9.
         
         The sum of [1,2,3,5,6] is 17.
         
         The 70th percentile of [1,2,3] is 2.

Compile, save and run your ﬁle.
