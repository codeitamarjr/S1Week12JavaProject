# Week12Project
This is the second project of my BSc. in Computing.


Introduction
A local clinic needs a program to education people about blood type compatibility. The blood type compatibility can be summarized in the table below: 
 

A person can only give blood to someone with compatible blood antigens. If a person receives blood from someone with an incompatible blood type, it can cause a life threatening immune system reaction. The blood transfusion will likely fail.
Your program should ask a user’s blood type first, then if she/he want to learn about giving or receiving blood. Based on the blood type and choice of give or receive, your program will print the corresponding compatible blood types. 
NOTE, if the blood type or give/receive choice entered doesn’t exist, the program should promote the user to re-enter it again.

Example 1:

Please provide blood type (A+, O+, B+, AB+, A-, O-, B-, AB-): X
Blood type doesn’t exist, please try again!
Please provide your blood type (A+, O+, B+, AB+, A-, O-, B-, AB-): A+
Do you want to know about giving or receiving (1 for Gives, 2 for Receives): 2
The blood type for A+ to receive are: A+, A-, O+, O-


Example 2:

Please provide blood type (A+, O+, B+, AB+, A-, O-, B-, AB-): AB+
Do you want to know about giving or receiving (1 for Gives, 2 for Receives): 3
Choice doesn’t exist, please try again!
Do you want to know about giving or receiving (1 for Gives, 2 for Receives): 1
The blood type for AB+ to give are: AB+




Requirements
Use either a flowchart or an algorithm, and write a Java program implementing this. 

### Version 2.0

Requirements
Write a Java program with Objective-Oriented programming. You need to use “class” and “method” feature of Java. The marks for each section includes the correct use of those features. Requirements are:

1.	Use UML diagram to show the classes and methods created for the program, and explain the propose and function of each class and method. Document this in a word document, and implement it in Java following the other requirements below.
      

2.	Create classes for the blood clinic, donor and receiver with appropriate methods.
     

3.	Ask a user to input first name, last name and if she/he is a donor or receiver. Depending on the choice, creating new donor or receiver object. Then the program prints out the blood type that she/he can receive or give (blood types that a donor can give to; blood types that a receiver can receive).


