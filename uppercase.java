public class uppercase {
    public static void main(String[] agrs){
        String str="my name is megha i'm from mysuru";
        String[] arr=str.split(" ");
        String str1="";
        for(int i=0;i<arr.length;i++){
            if(arr[i].length()>1){
                if(i%2==0){
                    System.out.println(arr[i].toUpperCase()+" ");
                }
                else
                    System.out.println(arr[i].toLowerCase()+" ");
            }
        }

    }
}
