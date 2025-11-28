//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

//        boolean bool = true;
//        byte b1 = 127; //-128~127, 1byte
//        int i1 = Integer.MAX_VALUE;
////        float i2 = Integer.MAX_VALUE;
////        double i3 = Integer.MAX_VALUE;
//
//        String S1 = "안녕하쎄요";
//
//        System.out.println(bool);
//        System.out.println(b1);
//        System.out.println(i1);
////        System.out.println(i2);
////        System.out.println(i3);
//        System.out.println(S1);

        byte b2 = 100;
        int i2 = 200;
        double d2 = b2 + i2; //묵시적 형변환 , 자동 타입 변환

        i2 = (int)d2; //명시적 형변환
    }
}