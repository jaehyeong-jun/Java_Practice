package com.google.hero;

public class HolyGuardian extends Hero {
    public HolyGuardian()
    {
        this.name = "빛의 수호자";
        this.level = 1;
        this.hp = 400;
        this.mp = 200;
    }
    public HolyGuardian(String name)
    {
        this.name = name;
        this.level = 1;
        this.hp = 400;
        this.mp = 200;
    }

    public void attack() {
        System.out.println("빛의 수호자 공격하다!");
    }

    @Override
    public void defense() {
        System.out.println("빛의 수호자 방어하다!");
    }

    @Override
    public void move() {
        System.out.println("빛의 수호자 움직이다!");
    }

    @Override
    public void story() {
        System.out.println("그는 누구보다 약했으나 누구보다 명예롭게 싸웠습니다. 신은 그의 업적을 기리며 그를 축복하였습니다.");
    }
}
