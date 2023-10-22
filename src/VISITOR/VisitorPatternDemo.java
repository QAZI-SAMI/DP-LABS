package VISITOR;

public class VisitorPatternDemo {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());

        ComputerPartSpecificMaintainer maintainer = new ComputerPartSpecificMaintainer();

        Multimedia multimedia = new Multimedia();

        maintainer.maintain(multimedia);

    }
}