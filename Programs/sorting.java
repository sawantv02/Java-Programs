/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vishakha
 */
public class sorting {
    
    public static void main(String args[])
    {
        int arr[]={5,6,3,4,9,8,1};
        int sorted[]={1,2,3,4,5,6,7};
        algos a=new algos();
        int b[]=new int[arr.length];
        int ifFound=a.findIndex(sorted,5);     
        System.out.println(ifFound);
    }
    

}

class algos
        {
    
    public void bubblesort(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=1;j<a.length;j++)
            {
                if(a[j-1]>a[j])
                {
                    int temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
                
            }
            printArray(a);
        }
    }
    
    public void insertionSort(int a[])
    {
        for(int i=1;i<a.length;i++)
        {
            int key=a[i];
            int j=i-1;
            
            while(j>=0 && key<a[j])
            {
                a[j+1]=a[j];
                j--;
            }
            //printArray(a);
            a[j+1]=key; 
            printArray(a);
        }
        //printArray(a);
    }
    
    public void selectionSort(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            int min=i;
            
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]<a[min])
                {
                    min=j;
                }
            }
            int temp=a[i];
            a[i]=a[min];
            a[min]=temp;
            printArray(a);
            
        }
        //printArray(a);
    }
    
    public void quickSort(int a[],int low,int high)
    {
        if(low<high)
        {
            
            int p=partition(a, low, high);
            quickSort(a,low,p);
            quickSort(a,p+1, high);
        }
        printArray(a);
    }
    
    public int partition(int a[],int low,int high)
    {
        int pivot=a[low];
        int i=low;
        int j=high;
        
        while(true)
        {
            while(a[i]<pivot)
                i++;
            while(a[j]>pivot)
                j--;
            if(i<j)
            {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            }
            else
                return j;
        }
        
    }
    
    public void mergeSort(int a[],int begin,int end,int b[])
    {
        if(end-begin<2)
            return;
        {
            int middle=(begin+end)/2;
            mergeSort(a, begin,middle,b);
            mergeSort(a,middle, end,b);
            merge(a,begin,middle,end,b);
            copyArray(b, begin, end, a  );
        }
    }
    
    public void merge(int a[],int begin,int middle,int end,int b[])
    {
        int i=begin;
        int j=middle;
        for(int k=begin;k<end;k++)
        {
            if(i<middle && (j>=end||a[i]<=a[j])){
                b[k]=a[i];
            i=i+1;
            }
            else
            {
                b[k]=a[j];
                j=j+1;
            }
            
        }
        
        
        
    }
    
    public int binarySearch(int a[],int target,int start,int end)
    {
        if(start>end)
            return -1;
        
        int mid=(start+end)/2;
        int val=a[mid];
        if(target<val)
            return binarySearch(a, target, start,mid-1);
        if(target>val)
            return binarySearch(a, target,mid+1, end);
        
        return mid;
    }
    
    public int findIndex(int a[],int target)
    {
        return binarySearch(a,target,0,a.length);
    }
    public void copyArray(int B[], int iBegin, int iEnd, int A[])
{
    for(int k = iBegin; k < iEnd; k++)
        A[k] = B[k];
    printArray(A);
}
    public void printArray(int a[])
    {
        System.out.println("pass");
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+",");
    }
}
