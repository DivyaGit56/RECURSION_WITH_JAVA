public class subsequences {

    public static void printSubseq(String ip,String op, int i){
        // Base Case
        if(i == ip.length()){
            System.out.println(op);
            return ;
        }
        // include
      printSubseq(ip, op+ip.charAt(i), i+1);

    //   exclude
     printSubseq(ip, op, i+1);



    }
    public static void main(String[]args){
         System.out.println("Subsequense are : " );
      printSubseq("Divya"," ",0);
       
    }
}
