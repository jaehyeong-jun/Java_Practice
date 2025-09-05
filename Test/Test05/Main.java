//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main
{
    public static void main(String[] args)
    {
        Car ggoma = new Car(); //객체 생성
        ggoma.name = "꼬마"; //생성 후 초기화
        System.out.println("꼬마의 이름 : " + ggoma.name);
        System.out.println("꼬마의 나이 : " + ggoma.age);

        Car fast = new Car(4, "패스트","빨간색");
        System.out.println("패스트의 이름 : " + fast.name);
        System.out.println("패스트의 색깔 : " + fast.color);

        Car bkie = new Car(5, "bike", "검은색");
        System.out.println("바이크의 이름 : " + bkie.name);
        System.out.println("바이크의 색깔 : " + bkie.color);
        System.out.println("바이크의 나이 : " + bkie.age);

        System.out.println(bkie.Run());
        System.out.println(bkie.Stop());
        System.out.println(bkie.Stop());

    }
}