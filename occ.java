public class occ{
    public static int occur(int arr[],int key,int i){
        if(arr[i]==key){
                return i;
        }
        return occur(arr,key,i+1);
    }
    public static void main(String args[]){
int arr[]={1,2,3,4,5};
        int key=3;
        System.out.println(occur(arr,key,0));
    }
}