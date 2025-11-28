public class Main {
    public static void main(String[] args) {

        String str = "안낭혀사에";
        // String str = new String(""); 와 비슷함. String은 자료형이 아닌 특수 클래스
        // int a = 100;
        // Object obj = new Object();

        byte[] bytes1 = str.getBytes();

        System.out.println("bytes1.length : " + bytes1.length);

        String str1 = new String(bytes1);
        System.out.println("bytes -> String : " + str1);

    }
}