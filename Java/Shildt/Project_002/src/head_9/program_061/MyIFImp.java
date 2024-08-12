package head_9.program_061;

public class MyIFImp implements MyIF {
    // necessary to realise only method getNumber(), defined in MyIF
    // For method getString() it's allow to apply standard realisation
    public int getNumber() {
        return 100;
    }
}
