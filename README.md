#Stopwatch tasks by Phanuwatch Luangpradit (5910545779)
I ran the tasks on Msi GP62 QF Leopard pro, and got these results:

Task                                      | Time
------------------------------------------|---------------
Append 50,000 chars to String             | 1.112922 sec
Append 100,000 chars to String            | 3.205033 sec
Append 100,000 chars to StringBuilder     | 0.002055 sec
Add 1 billion double using array          | 1.411113 sec
Add 1 billion Double using array          | 5.257767 sec
Add 1 billion BigDecimal using array      | 9.018126 sec

#Explaination of Results
1.Why does appending 100,000 chars to a String take more than 2X the time to append 50,000 chars?
Answer: Because time depends on the number of chars, the more chars the more time it takes.

2.Why is appending to StringBuilder so mauch different than appending to String? What is happening to the String?
Answer: Because StringBuilder can automatically create the chars array but String cannot. String is constant. String will create the new one and replace the old String.

3.Explain difference in time to sum double, Double, and BigDecimal. Which is faster and why?
Answer: double runs on registry that is faster than run on cpu. Double and Bigdecimal same as String but Bigdecimal is hard to collect in data, so that why BigDecimal is slower than double and Double objects.

4.Why is there such a big difference in the time used to append chars to a String and StringBuilder? Even though we eventually "copy" the StringBuilder into a String so the final is the same.
Answer:

5.Why is there a significant difference in times to sum double, Double, and BigDecimal values?
Answer:
