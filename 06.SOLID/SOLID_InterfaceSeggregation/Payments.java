package SOLID_InterfaceSeggregation;

// fat interface - we do not want to include all methods
public interface Payments {

    void payWithCreditCard();

    void payWithDebitCard();

    void payWithVisaCard();

    void payWithMasterCard();

    void payWithBankTransfer();

    void payWithCashTransfer();
}