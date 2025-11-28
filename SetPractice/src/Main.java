import java.util.*;

class lotto{

    private int index;
    private ArrayList<Integer> nums = new ArrayList<>();

    lotto(int index)
    {
        this.index = index + 1;
    }

    void setNums()
    {
        int num;
        Random ran = new Random();
        Set<Integer> set = new HashSet<>();
        while(set.size()<7)
        {
            num = ran.nextInt(45) + 1;
            set.add(num);
        }

        this.nums.addAll(set);
        Collections.sort(this.nums);
    }

    public int getIndex() {
        return index;
    }

    public ArrayList<Integer> returnNums()
    {
        return this.nums;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<lotto> list = new ArrayList<>();
        System.out.println("몇개의 로또를 구매?");

        int num = sc.nextInt();

        for(int i = 0; i < num; i++)
        {
            list.add(new lotto(i));
            list.get(i).setNums();
        }

        for(lotto i : list)
        {
            System.out.println(i.getIndex()+"번째 로또의 번호는 "+i.returnNums());
        }

    }
}