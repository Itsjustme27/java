public class Break{
    public static void main(String[] args){
        for(int i = 0; i < 100; i++)
        {
            if(i > 10){
                break;
            }else{
                System.out.println(i);
            }
        }
    }
}