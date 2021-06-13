/*
The School of Languages and Science teaches five subjects : Physics, Chemistry, Math, Botany and Zoology. 
Each student is skilled in one subject. The subjects are described by string of named skills that consists of 
the letters p,c,m,b, and z only. Each character describes the skill of a student  as follows: 


p-> Physics 
c-> Chemistry
m -> Math.
b -> Botany.
z -> Zoology. 

Your task is to determine the total number of different  teams satisfying the following constraints : 


--> A team consists of a group of exactly five students 
--> Each student is skilled in a different subject.
-->  A student may only be on one team.


For instance, if the skills string is "pcmbzpcmbz" then there are two possible teams that can be formed at one time: skills[0-4] and skills[5-9]
determine permutations as we will always be limited to two teams given 10 students 


Function Description 
Complete the function differentTeam in the editor below.  The function must return an integer value representing the number of teams that can be formed with the given constraints 


differentTeams has the following parameters:

skills : a string where each position represents the skill of a student


input = pcmpp
output = 0

Explanantion 
The students skills are described as follows 

1. The first student is skilled in Physics.
2. The second student is skilled in Chemistry
3. The third student is skilled in Math
4. The fourth student is skilled in Physics 
5. The fifth student is skilled in Physics


There are no students skilled in Botany or Zoology, it is impossible to form any team so the function returns 0. 

//backend testcases:
case = 1
input = pcmpcmbbbzz
output = 2

case = 2
input = pcmpp
output = 0

case = 3
input = pppp
output = 0

case = 4
input = pcmbz
output = 1

case = 5
input = ppcmbzcmbz
output = 2

case = 6
input = pcmbzpcmbzpcmbzp
output = 3
*/
import java.util.*;
class Program2 
{
	static int differentTeams(String skills) {
		int numberOfTeams = Integer.MAX_VALUE;
		// Assign an array count of people in 5 Subjects
		int[] countArr = new int[5];
		for(int i=0;i<skills.length();i++){
		   char subject = skills.charAt(i);
		   if(subject=='p'){
				countArr[0]++;
		   }else if(subject=='c'){
				countArr[1]++;
		   }else if(subject=='m'){
				countArr[2]++;
		   }else if(subject=='b'){
				countArr[3]++;
		   }else if (subject=='z'){
				countArr[4]++;
		   }else{ 
				throw new IllegalArgumentException("Invalid Input: " + subject); 
		   }

		}
    
		// Iterate count array to find the Minimum Value
		for(int i=0;i<5;i++){
		   if(countArr[i]<numberOfTeams){
			  numberOfTeams = countArr[i];
		   }
    }

    return numberOfTeams;
}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(differentTeams(s));
	}
}
