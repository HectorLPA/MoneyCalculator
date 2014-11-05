package moneycalculator.Application;

import moneycalculator.Control.ExchangeOperation;
import moneycalculator.Model.Currency;
import moneycalculator.Model.CurrencySet;
import moneycalculator.Persistence.CurrencySetLoader;
import moneycalculator.UI.ExchangeDialog;

public class Application {
    
    public static void main(String[] args) {
        CurrencySet currencySet = new CurrencySetLoader().load();
        ExchangeOperation exchangeOperation=new ExchangeOperation(currencySet);
        exchangeOperation.execute();
        
        
    }
}
