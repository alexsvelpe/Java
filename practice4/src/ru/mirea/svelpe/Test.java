package ru.mirea.svelpe;

public class Test {
    public static void main(String[] args) {
        MovableCircle krug = new MovableCircle(4, new MovablePoint(5, 2, 13, 16));
        System.out.println(krug);
        krug.moveDown();
        krug.moveRight();
        System.out.println(krug);
        krug.moveUp();
        krug.moveLeft();
        System.out.println(krug);
    }
}