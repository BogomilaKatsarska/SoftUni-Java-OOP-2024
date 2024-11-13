package PolyCalc;

public class ExtensionInputInterpreter extends InputInterpreter{

    private MemorySaveOperation memorySaveOperation;

    public ExtensionInputInterpreter(CalculationEngine engine) {
        super(engine);
        this.memorySaveOperation = new MemorySaveOperation();
    }

    @Override
    public Operation getOperation(String operation) {
        if (operation.equals("/")){
            return new DivideOperation();
        } else if (operation.equals("mr")){
            return new MemoryRecallOperation(memorySaveOperation);
        } else if (operation.equals("ms")){
            return this.memorySaveOperation;
        } else {
            return super.getOperation(operation);
        }
    }
}