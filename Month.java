package Month;

public enum Month {
    //constant values // Objects of class 'Month'
    JANUARY(5),
    FEBRUARY(10),
    MARCH(15),
    APRIL(20),
    MAY(25),
    JUNE(30);

    //fields
    private int averageTemp;
    private int birthCount;

    //Constructor - not public
    Month(int averageTemp){
        this.averageTemp = averageTemp;
        this.birthCount = 10;
    }
    //methods
    public int getAverageTemp(){
        return this.averageTemp;
    }
}
