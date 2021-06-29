import java.io.*; // for handling input/output
import java.util.*;
public class replacement{ //public class replacement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  int a[]=new int[n];
	  int arr[]=new int[n];
	  for(int i=0;i<n;i++){
		  a[i]=sc.nextInt();
	  }
	  for(int j=0;j<n;j++){
		  if(j==0){
			  arr[0]=a[0]*a[1];
		  }
		  else if(j==n-1){
			  arr[n-1]=a[n-1]*a[n-2];
		  }
		  else{
			  arr[j]=a[j-1]*a[j+1];
		  }
	  }
	  for(int k=0;k<n;k++){
	  System.out.print(arr[k]+" ");               // Your code here
	}
	}
}

