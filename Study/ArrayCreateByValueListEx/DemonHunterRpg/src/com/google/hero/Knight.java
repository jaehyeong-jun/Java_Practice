package com.google.hero;

public class Knight extends Hero
{

    public Knight()
    {
        this.name = "기사";
        this.level = 1;
        this.hp = 200;
        this.mp = 30;
    }
    public Knight(String name)
    {
        this.name = name;
        this.level = 1;
        this.hp = 200;
        this.mp = 30;
    }

    @Override
    public void attack() {
        System.out.println("기사 공격하다!");
    }

    @Override
    public void defense() {
        System.out.println("기사 방어하다!");
    }

    @Override
    public void move() {
        System.out.println("기사 움직이다!");
    }

    @Override
    public void story() {
        System.out.println("기사는 약한 이들을 위하여 검을 들었습니다.");
    }
}