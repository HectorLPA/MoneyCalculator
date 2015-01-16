package moneycalculator.Application;

import moneycalculator.Control.ExchangeOperation;
import moneycalculator.Model.Currency;
import moneycalculator.Model.CurrencySet;
import moneycalculator.Persistence.CurrencySetLoader;
import moneycalculator.UI.ExchangeDialog;
import moneycalculator.UI.MoneyDisplay;
import java.io.IOException;
public class Application {
    
   public static void main(String[] args) throws IOException {
        CurrencySet currencies = CurrencySet.getInstance();
        MoneyDisplay consoleMoneyDialog = new MoneyDisplay();
        ExchangeDialog consoleCurrencyDialog = new ExchangeDialog();
        ExchangeOperation control = new ExchangeOperation(currencies, consoleMoneyDialog, consoleCurrencyDialog);
        control.execute();
    }
}
