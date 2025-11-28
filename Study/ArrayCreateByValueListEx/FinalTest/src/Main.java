class Member
{
    final public void run()
    {

    }
}

class s_Member extends Member   // 불가
{
   public int number = 100;
   public void test()
    {
        number = 200;
    }
}

public class Main {
    public static void main(String[] args) {

        Member member = new Member();
    }
}