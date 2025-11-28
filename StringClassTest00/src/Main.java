

public class Main extends Object {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        sb.append(54);
        sb.append("java");
        sb.append("ok");
        sb.append(true);
        sb.append(10.04);
        System.out.println(sb);

        sb.insert(4,2);
        sb.setCharAt(5,'3');
        sb.replace(3,10,"wow");
        System.out.println(sb);
        System.out.println(sb.toString());
        int length = sb.length();
        System.out.println("총 문자수 : "+ length);



    }
}