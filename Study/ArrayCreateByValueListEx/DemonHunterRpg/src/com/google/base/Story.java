package com.google.base;

import java.util.Scanner;

public class Story {
    public void initStoryWrite() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        String gameStory = "태초에 빛이 있으라" + "빛이 태어나며 어둠이 태어났으니"
                + "빛은 어둠에 대항할 영웅을 창조했다";
        System.out.println("태초에 빛이 있으라");
        Thread.sleep(500);
        System.out.println("빛이 태어나며 어둠이 태어났으니");
        Thread.sleep(500);
        System.out.println("빛은 어둠에 대항할 영웅을 창조했다");
        Thread.sleep(500);
    }


}
