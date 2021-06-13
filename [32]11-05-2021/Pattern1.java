/*write a program to print the following pattern for any given 'n' where n>0

input = 5
output = 
1
2 5
6 9 14
15 18 23 30
31 34 39 46 55


    hint for rows
    1 + 1x1 = 2
    2 + 2x2 = 6
    6 + 3x3 = 15
    15 + 4x4 = 31
    31 + 5x5 = 56

    for columns
    add 3,5,7,9...
3 5 7 9 11 13 15 17 19 21 23 25 27 29 31 33 35 37 39 41 43 45 47 49 51 53 55 57 59 61

input = 15
output =
1
2 5
6 9 14
15 18 23 30
31 34 39 46 55
56 59 64 71 80 91
92 95 100 107 116 127 140
141 144 149 156 165 176 189 204
205 208 213 220 229 240 253 268 285
286 289 294 301 310 321 334 349 366 385
386 389 394 401 410 421 434 449 466 485 506
507 510 515 522 531 542 555 570 587 606 627 650
651 654 659 666 675 686 699 714 731 750 771 794 819
820 823 828 835 844 855 868 883 900 919 940 963 988 1015
1016 1019 1024 1031 1040 1051 1064 1079 1096 1115 1136 1159 1184 1211 1240



input = 20
output =
1
2 5
6 9 14
15 18 23 30
31 34 39 46 55
56 59 64 71 80 91
92 95 100 107 116 127 140
141 144 149 156 165 176 189 204
205 208 213 220 229 240 253 268 285
286 289 294 301 310 321 334 349 366 385
386 389 394 401 410 421 434 449 466 485 506
507 510 515 522 531 542 555 570 587 606 627 650
651 654 659 666 675 686 699 714 731 750 771 794 819
820 823 828 835 844 855 868 883 900 919 940 963 988 1015
1016 1019 1024 1031 1040 1051 1064 1079 1096 1115 1136 1159 1184 1211 1240
1241 1244 1249 1256 1265 1276 1289 1304 1321 1340 1361 1384 1409 1436 1465 1496
1497 1500 1505 1512 1521 1532 1545 1560 1577 1596 1617 1640 1665 1692 1721 1752 1785
1786 1789 1794 1801 1810 1821 1834 1849 1866 1885 1906 1929 1954 1981 2010 2041 2074 2109
2110 2113 2118 2125 2134 2145 2158 2173 2190 2209 2230 2253 2278 2305 2334 2365 2398 2433 2470
2471 2474 2479 2486 2495 2506 2519 2534 2551 2570 2591 2614 2639 2666 2695 2726 2759 2794 2831 2870
*/
import java.util.*;
class Pattern1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int temp=1,rtemp=1;
        System.out.println(temp);
        for(int i=1;i<n;i++)
        {
            for(int j=0,k=1;j<i+1;j++,k+=2)
            {
                if(j==0)
                {
                    temp=(rtemp)+(i*i);
                    System.out.print(temp+" ");
                    rtemp=temp;
                    continue;
                }
                temp+=k;
                System.out.print(temp+" ");
            }
            System.out.println();
        }
    }
}