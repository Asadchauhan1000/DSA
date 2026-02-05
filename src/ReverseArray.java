public class ReverseArray {
    public static void main(String args[]){
        int[] x={2,1,3,2,1,3,2};
        int i,j,temp;
        int l=x.length;
        i=0;
        j=l-1;
        while(i<=j){
            temp=x[i];
            x[i]=x[j];
            x[j]=temp;
            i++;
            j--;


        }
        
        for(int a:x){
            System.out.print(" "+a);
        }
    }
    
}
