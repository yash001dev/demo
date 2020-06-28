
public class SecondLargest {
    public static void main(String[] args) {
        int a[]={4,8,9,2,5};
        int largest=Integer.MIN_VALUE;
        int secodLargest=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>largest){
                secodLargest=largest;
                largest=a[i];
            }
            else if(a[i]>secodLargest && a[i]!=largest){
                secodLargest=a[i];
            }
        }
        if(secodLargest==Integer.MIN_VALUE){
            System.out.println("There is No Second Largest Elements in the list...");
        }
        else{
            System.out.println("Second Largest Element:"+secodLargest);
        }
        
    }
}