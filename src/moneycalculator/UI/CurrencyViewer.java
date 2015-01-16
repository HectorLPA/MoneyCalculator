/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package moneycalculator.UI;


import moneycalculator.Model.Currency;

public class CurrencyViewer {

    public void show(Currency currency) {
        System.out.println(currency.getCode());
    }
}
