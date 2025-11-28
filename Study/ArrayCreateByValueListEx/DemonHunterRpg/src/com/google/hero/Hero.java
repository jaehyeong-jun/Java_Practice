package com.google.hero;

public class Hero{
    protected String name;
    protected int level;
    protected double hp;
    protected double mp;
    protected double atk;
    protected double def;

    public Hero() {
        this.name = "영웅";
        this.level = 1;
        this.hp = 100;
        this.mp = 100;
        this.atk = 10;
        this.def = 5;
    }
    public void attack(){
        System.out.println("공격하다!");
    }
    public void defense(){
        System.out.println("방어하다!");
    }
    public void move(){
        System.out.println("이동하다!");
    }

    public void story(){
        System.out.println("태어난 영웅은 가장 약합니다. 하지만 그의 의지만큼은 그 무엇도 막을 수 없습니다.");
    }

    public double getMp() {
        return mp;
    }

    public double getHp() {
        return hp;
    }

    public double getAtk() {
        return atk;
    }

    public double getDef() {
        return def;
    }

    public String getName() {
        return name;
    }

}