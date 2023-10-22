package VISITOR;

public class ComputerPartSpecificMaintainer implements ComputerPartMaintainer{

    @Override
    public void maintain(Multimedia multimedia) {
        System.out.println("Multimedia is maintained only....");
    }

}