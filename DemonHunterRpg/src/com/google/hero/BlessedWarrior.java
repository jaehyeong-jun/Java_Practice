package com.google.hero;

public class BlessedWarrior extends Hero {
    public BlessedWarrior()
    {
        this.name = "신성 전사";
        this.level = 1;
        this.hp = 400;
        this.mp = 0;
    }
    public BlessedWarrior(String name)
    {
        this.name = name;
        this.level = 1;
        this.hp = 400;
        this.mp = 0;
    }

    public void attack() {
        System.out.println("신성전사 공격하다!");
    }

    @Override
    public void defense() {
        System.out.println("신성전사 방어하다!");
    }

    @Override
    public void move() {
        System.out.println("신성전사 움직이다!");
    }

    @Override
    public void story() {
        System.out.println("전사는 선악에 관심이 없습니다. 하지만 그의 행보에 많은 이들이 구원받았고 그는 신의 축복을 받았습니다.");
    }
}
