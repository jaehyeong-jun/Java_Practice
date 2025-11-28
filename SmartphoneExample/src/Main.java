//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
class Phone
{
    public String model;
    public String color;
    public Phone() {
        System.out.println("Phone() 생성자가 실행!");
        model = "핸드폰";
        color = "검은색";
    }
}

class SmartPhone extends Phone
{
    public SmartPhone(){
        System.out.println("부모 객체 호출됨");
        this.model = "실행됨";
    }

}

public class Main {
    public static void main(String[] args) {

        SmartPhone myphone = new SmartPhone();
    }
}