import java.util.*;
class P
{
public static void main(String[] args)
{
Scanner sc =new Scanner(System.in);
int r=sc.nextInt();
int c=sc.nextInt();
int[][] a=new int[r][c];
for(int i=0;i<r;i++){
for(int j=0;j<c;j++)
{a[i][j]=sc.nextInt();}}
int k=sc.nextInt();
int[][] b =new int[r][c];
for(int i=0;i<r-1;i++){
for(int j=0;j<c-1;j++)
{
if(j==(r-1)){a[i][j]=a[i+1][0];}
else if(i==(c-1) && j==(r-1)){a[i][j]=a[0][0];}
else{a[i][j]=a[i][j+1];}
}}
for(int i=0;i<r;i++){
for(int j=0;j<c;j++)
{System.out.print(a[i][j]+" ");}
System.out.println();
}
}}

