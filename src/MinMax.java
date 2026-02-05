public class MinMax {
    public static void main(String args[]){
        int[] a={3,4,2,4,6,-1,4,1,9};
        int min,max;
        min=a[0];
        max=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]<min){
                min=a[i];

            }
            if(a[i]>max){
                max=a[i];
        
        }
    }
        System.out.println("Min  "+min);
        System.out.println("Max  "+max);

    }
    
}
