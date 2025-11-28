package com.google.hero;


public class DarkKnight extends Hero
{
    public DarkKnight()
    {
        this.name = "흑기사";
        this.level = 1;
        this.hp = 250;
        this.mp = 120;
    }
    public DarkKnight(String name)
    {
        this.name = name;
        this.level = 1;
        this.hp = 250;
        this.mp = 120;
    }

    public void attack() {
        System.out.println("암흑 기사 공격하다!");
    }

    @Override
    public void defense() {
        System.out.println("암흑 기사 방어하다!");
    }

    @Override
    public void move() {
        System.out.println("암흑 기사 움직이다!");
    }

    @Override
    public void story() {
        System.out.println("기사는 자신의 나약함을 저주했습니다. 그는 암흑의 힘을 빼앗아 쓰기로 했습니다.");
    }
}
