public interface Payable {
    //Interface: methods without implementation which will be implementable by our objets
    // Our class MUST implement all of the defined methods

    //Static field
    int MAX_BANK_ACCOUNTS = 5; // i.e.: public static final int MAX_BANK_ACCOUNTS;

    //Abstract method
    boolean payWithCard(int productCost, int cardBalance);


}
