
package moneycalculator.Control;

import moneycalculator.Model.CurrencySet;
import moneycalculator.UI.ExchangeDialog;


public class ExchangeOperation {
    private final CurrencySet currencySet;
  
    
    
public ExchangeOperation(CurrencySet currencySet){
    this.currencySet=currencySet;
}

public void execute() {
    ExchangeDialog exchangeDialog=new ExchangeDialog(currencySet);
    exchangeDialog.execute();

}



}
