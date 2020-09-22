public class Test {
   public static void main(String[] args) {
     Random random=new Random();
     int max = 10,min =0;
     int randomNum=random.nextInt((max-min)+1)+min;
     System.out.println(randomNum);
  }
}
