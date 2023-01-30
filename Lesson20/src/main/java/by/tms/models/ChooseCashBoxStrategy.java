package by.tms.models;

public interface ChooseCashBoxStrategy {
    CashBox chooseCashBox(String customerName, CashBox[] cashBoxes);
}
