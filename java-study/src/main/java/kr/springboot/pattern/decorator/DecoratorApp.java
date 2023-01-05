package kr.springboot.pattern.decorator;

public class DecoratorApp {

    public static void main(String[] args) {

        ChristmasTree tree1 = new SantaClausDoll(new ChristmasTreeImpl());

        System.out.println(tree1.decorate());

        ChristmasTree tree2 = new BubbleLights(new ChristmasTreeImpl());

        System.out.println(tree2.decorate());

    }

}
