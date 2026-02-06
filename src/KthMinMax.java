import java.util.*;
public class KthMinMax {
    public static int max(int[] arr,int k){
        PriorityQueue<Integer> pg=new PriorityQueue<>();
        for(int a:arr){
            pg.add(a);

            if(pg.size()>k){
                pg.poll();
            }
        }
        return pg.peek();

   
    }
    public static int min(int[] arr,int k){
        PriorityQueue<Integer> pn=new PriorityQueue<>();
        for(int a:arr){
            pn.add(a);

            if(pn.size()>k){
                pn.poll();
            }
        }
        return pn.peek();

   
    }


    public static void main(String args[]){
        int[] arr={5,2,4,3,45};
        int res=max(arr,2);
        int res1=min(arr,3);
        System.out.println("k max"+res);
        System.out.println("k min"+res1);
    }
    
}