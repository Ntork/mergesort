
package mergsort;
import java.util.*;


public class mergsort {
//function for divid it 30 20 40 5 90 80 10
	//l=0 , r=6 , m=l+(r-l)/2 =3
	public static void merg(int arr[],int l,int m,int r) {
	//lenght for subarrray1(n1=m-l+1)and length for subarray2(n2=r-m)
		int n1=m-l+1; //4
		int n2=r-m; //3 
	//creat two subarray depend on length n1,n2
		int [] subl=new int[n1];
		int [] subr=new int[n2];
	//copy data to temp arrays
		for(int i=0;i<n1;i++) {
			subl[i]=arr[l+i];
		}
		for(int j=0 ; j<n2;j++) {
			subr[j]=arr[m+1+j];
		}
	//sort 
		int i,j,k;
		i=j=k=0;
		while(i<n1 && j<n2) {
			if(subl[i]<subr[j]) {
				arr[k]=subl[i];
				i++;
			}
			else {
				arr[k]=subr[j];
				j++;
			}
			k++;
		}
		//sort rest value
		while(i<n1) {
			arr[k]=subl[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k]=subr[j];
			j++;
			k++;
		}
	}
//function for mergesort
	public static void mergsort(int arr[],int l ,int r ) {//0 6
		if(l<r){
			int m=l+(r-l)/2; //3
			mergsort(arr,l,m);//from 0 to 3
			mergsort(arr,m+l,r);//from 3 to 6
			merg(arr,l,m,r);
		}
	}
//function for print
	public static void print(int[] arr) {
		for(int i=0 ; i<arr.length ;i++) {
			System.out.println(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr= {60,10,20,5,60,70};
 mergsort(arr,0,arr.length-1);
 print(arr);
	}

}
