package com.google.hero;

public class WhiteWizard extends Hero {

    public WhiteWizard()
    {
        this.name = "빛마법사";
        this.level = 1;
        this.hp = 150;
        this.mp = 300;
    }
    public WhiteWizard(String name)
    {
        this.name = name;
        this.level = 1;
        this.hp = 150;
        this.mp = 300;
    }

    public void attack() {
        System.out.println("빛마법사 공격하다!");
    }

    @Override
    public void defense() {
        System.out.println("빛마법사 방어하다!");
    }

    @Override
    public void move() {
        System.out.println("빛마법사 움직이다!");
    }

    @Override
    public void story() {
        System.out.println("마침내 마법사는 빛과 어둠을 깨달았습니다. 마법사는 어둠에 대항하기 위한 마법을 개발했습니다.");
    }

}
