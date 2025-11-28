package com.google.hero;


public class Wizard extends Hero
{
    public Wizard()
    {
        this.name = "마법사";
        this.level = 1;
        this.hp = 120;
        this.mp = 150;
    }
    public Wizard(String name)
    {
        this.name = name;
        this.level = 1;
        this.hp = 120;
        this.mp = 150;
    }

    public void attack() {
        System.out.println("마법사 공격하다!");
    }

    @Override
    public void defense() {
        System.out.println("마법사 방어하다!");
    }

    @Override
    public void move() {
        System.out.println("마법사 움직이다!");
    }

    @Override
    public void story() {
        System.out.println("마법사는 빛과 어둠의 존재에 궁금증이 생겼습니다. 그는 그들을 탐구해보기로 했습니다.");
    }

}