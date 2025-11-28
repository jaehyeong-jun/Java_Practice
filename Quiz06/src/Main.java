//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.


public class Main {
    public static void main(String[] args) {

        Cat stray_cat = new Cat();
        Cat baby_cat = new Cat("나비", "흰색");
        Cat old_cat = new Cat("나미", 10, "얼룩");

        System.out.println(stray_cat.toString());
        System.out.println(baby_cat.toString());
        System.out.println(old_cat.toString());

        // stray_cat.age = 1; 직접 접근 X
        stray_cat.setAge(1);//간접 접근 O

        stray_cat.Meow();
        baby_cat.Meow();
        old_cat.Meow();

        stray_cat.Eat();
        baby_cat.Eat();
        old_cat.Eat();


    }
}