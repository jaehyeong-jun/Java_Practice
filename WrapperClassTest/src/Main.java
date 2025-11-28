public class Main {
    public static void main(String[] args) {

        int a = 100;
        Integer obj = 200;

        a = obj;
        System.out.println(a);

        Integer obj2 = 300;
        int b = obj2;
        System.out.println(b);

        Integer obj3 = 500;
        Integer obj4 = 500;
        System.out.println("레퍼런스가 가지고있는 주소값 비교 " + (obj3 == obj4));
        System.out.println("최종값이 같은지 여부 : " + obj3.equals(obj4));

    }
}