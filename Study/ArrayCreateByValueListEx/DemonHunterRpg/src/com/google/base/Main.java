package com.google.base;

import com.google.hero.*;
import java.util.Scanner;




public class Main {

    public static int select(int num)
    {
        int temp;
        Scanner sc = new Scanner(System.in);
        while (true) {

            temp = sc.nextInt();
            if(temp > 0 || temp < num) break;
            else System.out.println("제대로된 숫자를 입력하세요");

        }
        return temp;
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Story story = new Story();
        story.initStoryWrite();
        int num;
        int yourJob = 0;

        Hero job = null;
        Player you = new Player();

        System.out.println("\n어둠에 대항하는 당신은 누구인가? 1. 영웅 2. 기사 3. 마법사 4. 전사");
        num = select(4);

        switch (num) {
            case 1:
                job = new Hero();
                you.InitStatus(job);
                yourJob = 1;
                break;
            case 2:
                job = new Knight();
                you.InitStatus(job);
                yourJob = 2;
                break;
            case 3:
                job = new Wizard();
                you.InitStatus(job);
                yourJob = 3;
                break;
            case 4:
                job = new Warrior();
                you.InitStatus(job);
                yourJob = 4;
                break;
            default:
                System.out.println("올바른 번호를 입력하세요.");
                break;
            }

        job.story();
        you.status();
        while(true) {
            System.out.println("무엇을 할까 1. 전투 2. 휴식");
            num = select(3);
            switch(num)
            {
                case 1:
                    you.LevelUp(job);
                    you.status();

                    if(you.getLevel() == 10)
                    {
                        System.out.println("당신은 새로운 힘을 깨달았습니다.");
                        Thread.sleep(1000);

                        switch(yourJob)
                        {
                            case 1: job = new HolyGuardian(); break;
                            case 2: job = new DarkKnight(); break;
                            case 3: job = new WhiteWizard(); break;
                            case 4: job = new BlessedWarrior(); break;
                            default: break;
                        }
                        job.story();
                        you.InitStatus(job);
                        you.status();
                    }
                    break;

                case 2:
                    System.out.println("체력을 회복합니다");
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + num);
            }

            if (num==3)
            {
                break;
            }
        }
    }
}
