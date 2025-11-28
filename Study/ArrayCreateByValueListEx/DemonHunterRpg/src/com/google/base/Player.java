package com.google.base;
import com.google.hero.Hero;

public class Player {
    protected String nickname;
    protected int level;
    protected int exp;
    protected double hp;
    protected double mp;
    protected double atk;
    protected double def;
    protected String job;

    Player(){}
    Player(String name, String job)
    {
        this.level = 0;
        this.exp = 0;
        this.nickname = name;
        this.job = job;
    }

    public void LevelUp(Hero v)
    {
        this.level++;
        this.exp = 0;
        this.hp += v.getHp() *0.1;
        this.mp += v.getMp() *0.1;
        this.atk += v.getAtk() * 0.1;
        this.def += v.getDef() * 0.1;
    }

    public void InitStatus(Hero v)
    {
        this.job = v.getName();
        this.hp = v.getHp();
        this.mp = v.getMp();
        this.atk = v.getAtk();
        this.def = v.getDef();
        for(int i = 0; i < level; i++)
        {
            LevelUp(v);
        }
    }

    public void status() {
        System.out.println(
                "Job='" + job + '\'' +
                        ", Level=" + level +
                        ", Hp=" + hp +
                        ", Mp=" + mp +
                        '}');
    }

    public int getLevel() {
        return level;
    }
}
