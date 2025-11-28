import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {

        String text = "홍길동a강호동a유재석";

        StringTokenizer st = new StringTokenizer(text,"a");

        int countTokens = st.countTokens();

        for( int i = 0; i<countTokens; i++){
            String token = st.nextToken();
            System.out.println(token);
        }

        st = new StringTokenizer(text,"a");

        while(st.hasMoreTokens()){
            String token = st.nextToken();
            System.out.println(token);
        }
    }
}