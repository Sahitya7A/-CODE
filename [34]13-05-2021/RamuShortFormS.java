/*
Program- 1

Ramu is given a word and asked to replace the word in shortform, 

a shortform is a word by replacing non-intersected substrings with their respective lengths 


You will be given a word.
Your task is to find all possible shortforms of the given word, 
8and print them as a list of lexicographic7 order.


Note - Print the list of possible short-forms of W in lexographic order. 


Sample Input-1:
---------------
kmit

Sample Output-1:
----------------
[4, 3t, 2i1, 2it, 1m2, 1m1t, 1mi1, 1mit, k3, k2t, k1i1, k1it, km2, km1t, kmi1, kmit]


Sample Input-2:
---------------
cse

Sample Output-2:
----------------
[3, 2e, 1s1, 1se, c2, c1e, cs1, cse]

input =school
output =[1c1o1l, 1c1o2, 1c1oo1, 1c1ool, 1c2o1, 1c2ol, 1c3l, 1c4, 1ch1o1, 1ch1ol, 1ch2l, 1ch3, 1cho1l, 1cho2, 1choo1, 1chool, 2h1o1, 2h1ol, 2h2l, 2h3, 2ho1l, 2ho2, 2hoo1, 2hool, 3o1l, 3o2, 3oo1, 3ool, 4o1, 4ol, 5l, 6, s1h1o1, s1h1ol, s1h2l, s1h3, s1ho1l, s1ho2, s1hoo1, s1hool, s2o1l, s2o2, s2oo1, s2ool, s3o1, s3ol, s4l, s5, sc1o1l, sc1o2, sc1oo1, sc1ool, sc2o1, sc2ol, sc3l, sc4, sch1o1, sch1ol, sch2l, sch3, scho1l, scho2, schoo1, school]

case =2
input =shortcut
output =[1h1r1c1t, 1h1r1c2, 1h1r1cu1, 1h1r1cut, 1h1r2u1, 1h1r2ut, 1h1r3t, 1h1r4, 1h1rt1u1, 1h1rt1ut, 1h1rt2t, 1h1rt3, 1h1rtc1t, 1h1rtc2, 1h1rtcu1, 1h1rtcut, 1h2t1u1, 1h2t1ut, 1h2t2t, 1h2t3, 1h2tc1t, 1h2tc2, 1h2tcu1, 1h2tcut, 1h3c1t, 1h3c2, 1h3cu1, 1h3cut, 1h4u1, 1h4ut, 1h5t, 1h6, 1ho1t1u1, 1ho1t1ut, 1ho1t2t, 1ho1t3, 1ho1tc1t, 1ho1tc2, 1ho1tcu1, 1ho1tcut, 1ho2c1t, 1ho2c2, 1ho2cu1, 1ho2cut, 1ho3u1, 1ho3ut, 1ho4t, 1ho5, 1hor1c1t, 1hor1c2, 1hor1cu1, 1hor1cut, 1hor2u1, 1hor2ut, 1hor3t, 1hor4, 1hort1u1, 1hort1ut, 1hort2t, 1hort3, 1hortc1t, 1hortc2, 1hortcu1, 1hortcut, 2o1t1u1, 2o1t1ut, 2o1t2t, 2o1t3, 2o1tc1t, 2o1tc2, 2o1tcu1, 2o1tcut, 2o2c1t, 2o2c2, 2o2cu1, 2o2cut, 2o3u1, 2o3ut, 2o4t, 2o5, 2or1c1t, 2or1c2, 2or1cu1, 2or1cut, 2or2u1, 2or2ut, 2or3t, 2or4, 2ort1u1, 2ort1ut, 2ort2t, 2ort3, 2ortc1t, 2ortc2, 2ortcu1, 2ortcut, 3r1c1t, 3r1c2, 3r1cu1, 3r1cut, 3r2u1, 3r2ut, 3r3t, 3r4, 3rt1u1, 3rt1ut, 3rt2t, 3rt3, 3rtc1t, 3rtc2, 3rtcu1, 3rtcut, 4t1u1, 4t1ut, 4t2t, 4t3, 4tc1t, 4tc2, 4tcu1, 4tcut, 5c1t, 5c2, 5cu1, 5cut, 6u1, 6ut, 7t, 8, s1o1t1u1, s1o1t1ut, s1o1t2t, s1o1t3, s1o1tc1t, s1o1tc2, s1o1tcu1, s1o1tcut, s1o2c1t, s1o2c2, s1o2cu1, s1o2cut, s1o3u1, s1o3ut, s1o4t, s1o5, s1or1c1t, s1or1c2, s1or1cu1, s1or1cut, s1or2u1, s1or2ut, s1or3t, s1or4, s1ort1u1, s1ort1ut, s1ort2t, s1ort3, s1ortc1t, s1ortc2, s1ortcu1, s1ortcut, s2r1c1t, s2r1c2, s2r1cu1, s2r1cut, s2r2u1, s2r2ut, s2r3t, s2r4, s2rt1u1, s2rt1ut, s2rt2t, s2rt3, s2rtc1t, s2rtc2, s2rtcu1, s2rtcut, s3t1u1, s3t1ut, s3t2t, s3t3, s3tc1t, s3tc2, s3tcu1, s3tcut, s4c1t, s4c2, s4cu1, s4cut, s5u1, s5ut, s6t, s7, sh1r1c1t, sh1r1c2, sh1r1cu1, sh1r1cut, sh1r2u1, sh1r2ut, sh1r3t, sh1r4, sh1rt1u1, sh1rt1ut, sh1rt2t, sh1rt3, sh1rtc1t, sh1rtc2, sh1rtcu1, sh1rtcut, sh2t1u1, sh2t1ut, sh2t2t, sh2t3, sh2tc1t, sh2tc2, sh2tcu1, sh2tcut, sh3c1t, sh3c2, sh3cu1, sh3cut, sh4u1, sh4ut, sh5t, sh6, sho1t1u1, sho1t1ut, sho1t2t, sho1t3, sho1tc1t, sho1tc2, sho1tcu1, sho1tcut, sho2c1t, sho2c2, sho2cu1, sho2cut, sho3u1, sho3ut, sho4t, sho5, shor1c1t, shor1c2, shor1cu1, shor1cut, shor2u1, shor2ut, shor3t, shor4, short1u1, short1ut, short2t, short3, shortc1t, shortc2, shortcu1, shortcut]

case =3
input =desktop
output =[1e1k1o1, 1e1k1op, 1e1k2p, 1e1k3, 1e1kt1p, 1e1kt2, 1e1kto1, 1e1ktop, 1e2t1p, 1e2t2, 1e2to1, 1e2top, 1e3o1, 1e3op, 1e4p, 1e5, 1es1t1p, 1es1t2, 1es1to1, 1es1top, 1es2o1, 1es2op, 1es3p, 1es4, 1esk1o1, 1esk1op, 1esk2p, 1esk3, 1eskt1p, 1eskt2, 1eskto1, 1esktop, 2s1t1p, 2s1t2, 2s1to1, 2s1top, 2s2o1, 2s2op, 2s3p, 2s4, 2sk1o1, 2sk1op, 2sk2p, 2sk3, 2skt1p, 2skt2, 2skto1, 2sktop, 3k1o1, 3k1op, 3k2p, 3k3, 3kt1p, 3kt2, 3kto1, 3ktop, 4t1p, 4t2, 4to1, 4top, 5o1, 5op, 6p, 7, d1s1t1p, d1s1t2, d1s1to1, d1s1top, d1s2o1, d1s2op, d1s3p, d1s4, d1sk1o1, d1sk1op, d1sk2p, d1sk3, d1skt1p, d1skt2, d1skto1, d1sktop, d2k1o1, d2k1op, d2k2p, d2k3, d2kt1p, d2kt2, d2kto1, d2ktop, d3t1p, d3t2, d3to1, d3top, d4o1, d4op, d5p, d6, de1k1o1, de1k1op, de1k2p, de1k3, de1kt1p, de1kt2, de1kto1, de1ktop, de2t1p, de2t2, de2to1, de2top, de3o1, de3op, de4p, de5, des1t1p, des1t2, des1to1, des1top, des2o1, des2op, des3p, des4, desk1o1, desk1op, desk2p, desk3, deskt1p, deskt2, deskto1, desktop]

case =4
input =fs
output =[1s, 2, f1, fs]
*/
import java.util.*;
class RamuShortFormS
{
    public static void printLexOSF(String s)
    {
        ArrayList<String> a = new ArrayList<>();
        StringBuilder sb;
        String[] w;//binary value
        int n=s.length();//string length
        for(int i=0;i<Math.pow(2,s.length());i++)
        {
            sb=new StringBuilder();
            int count=0;//0 count
            w=Integer.toBinaryString(i).split("");
            int w_length=w.length;//array length
            boolean flag=false;//flag to enter if binary value has leading zeros
            int w_ltemp=0;//no of leading zeros
            if(w_length < n)//contains leading zeros
            {
                w_ltemp=n-w_length;
                flag=true;
            }
            if(flag)//contains leading zeros
            {
                sb.append(s.substring(0,w_ltemp));
            }
            for(int k=0;k<w_length;k++)
            {
                if(w[k].equals("1"))
                {
                    count++;
                }
                else
                {
                    if(count==0)
                    {
                        sb.append(s.substring(w_ltemp+k,w_ltemp+k+1));
                    }
                    else
                    {
                        sb.append(count);
                        sb.append(s.substring(w_ltemp+k,w_ltemp+k+1));
                        count=0;
                    }
                }
            }
            if(count>0)//if last binary digit is also 1
            {sb.append(count);}
            a.add(String.valueOf(sb));
        }
        Collections.sort(a);
        for(String b : a)
        {System.out.print(b+" ");}
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        printLexOSF(s);//printLexicalOrderedShortForms
        sc.close();
    }
}
/*Making all 2^n combinations and making 1 as substring intersections*/
/*
kmit
0        	kmit
1   	kmi1
1 0	km1t
1 1	km2
1 0 0	k1it
1 0 1	k1i1
1 1 0	k2t
1 1 1	k3
1 0 0 0	1mit
1 0 0 1	1mi1
1 0 1 0	1m1t
1 0 1 1	1m2
1 1 0 0	2it
1 1 0 1	2i1
1 1 1 0	3t
1 1 1 1	4
k m i t
*/

