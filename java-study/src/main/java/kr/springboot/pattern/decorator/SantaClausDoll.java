package kr.springboot.pattern.decorator;

public class SantaClausDoll extends TreeDecorator {

    public SantaClausDoll(ChristmasTree tree) {
        super(tree);
    }

    public String decorate() {
        return super.decorate() + decorateWithSantaClausDoll();
    }

    private String decorateWithSantaClausDoll() {
        return " with Santa Claus Doll";
    }

}
