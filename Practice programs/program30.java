public class Movezoros{
    public static void main(String[]args){
        int arr[]={0,10,0,20,30,0,40};
        int index=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                    arr[index]=arr[i];
                    index++;

                }

            }
            while (index<arr.length){
                arr[index]=0;
                index++;

            }
            System.out.println("Array after moving zeros:");

            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");

            }
        }
    }
