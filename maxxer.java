public class maxxer{
    public static void main(String[] args){
        int[] lst = new int[args.length];
        for(int i = 0; i < args.length; i++){
            lst[i] = Integer.parseInt(args[i]);
        }
        int max = findMax(lst);
        System.out.println("The max of the entered list is " + max);
    }
    public static int findMax(int[] lst){
        int largest = lst[0];
        for(int a : lst){
            if(a >= largest){
                largest = a;
            }
        }
        return largest;
    }
}