package Moses.week2;

public class PrintConsecutiveNumbers {

    public static void printConsecutiveNumbers(int N) {

        for(int i = 1; i <= N;i++){
            StringBuilder sb = new StringBuilder();

            if(i % 2 == 0){
                sb.append("Codility");

            }
            if(i % 3 == 0){
                sb.append("Test");
            }
            if(i % 5 == 0){
                sb.append("Coders");
            }
            if(sb.length() > 0){
                System.out.println(sb.toString());
            }else{
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {
        int N = 30;
        printConsecutiveNumbers(N);
    }
}
