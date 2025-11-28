package com.google.hero;

public class Warrior extends Hero {
    public Warrior()
    {
        this.name = "전사";
        this.level = 1;
        this.hp = 250;
        this.mp = 0;
    }
    public Warrior(String name)
    {
        this.name = name;
        this.level = 1;
        this.hp = 250;
        this.mp = 0;
    }

    public void attack() {
        System.out.println("전사 공격하다!");
    }

    @Override
    public void defense() {
        System.out.println("전사 방어하다!");
    }

    @Override
    public void move() {
        System.out.println("전사 움직이다!");
    }

    @Override
    public void story() {
        System.out.println("전사는 선악에 관심이 없습니다. 강렬한 투쟁만을 위해 그는 암흑과 싸우기로 결심했습니다.");
    }

}
