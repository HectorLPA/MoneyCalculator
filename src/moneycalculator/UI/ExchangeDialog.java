
package moneycalculator.UI;

import java.util.Date;
import moneycalculator.Model.Currency;
import moneycalculator.Model.CurrencySet;
import moneycalculator.Model.Exchange;
import moneycalculator.Model.Money;

public class ExchangeDialog {
    private final CurrencySet currencySet;
    private final Exchange exchange;
    
    public ExchangeDialog(CurrencySet currencySet){
        this.currencySet=currencySet;
    }
    public Exchange getExchange(){
        return this.exchange;
    }
    public void execute(){
        Exchange exchange= new Exchange(null, null,null);
        
    }
}
