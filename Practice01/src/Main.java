import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        String filePath = "output.txt"; // 저장할 파일 경로
        String content = "Hello, world!\nJava로 파일 쓰기 예제입니다.";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
            System.out.println("파일 저장 완료");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}