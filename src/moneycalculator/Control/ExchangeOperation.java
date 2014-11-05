
package moneycalculator.Control;

import moneycalculator.Model.CurrencySet;
import moneycalculator.Model.Exchange;
import moneycalculator.UI.ExchangeDialog;


public class ExchangeOperation {
    private final CurrencySet currencySet;
  
    
    
public ExchangeOperation(CurrencySet currencySet){
    this.currencySet=currencySet;
}

public Exchange readExchange(){
    
}

public void displayMoney(){
    
}
public void exchangeMoney(){
    
}

public ExchangeRate readExchangeRate (){
    
}
public void execute() {
    ExchangeDialog exchangeDialog=new ExchangeDialog(currencySet);
    exchangeDialog.execute();

}



}
