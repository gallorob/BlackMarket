//Carolo Nicolas       436266
//Copy the code is not a good idea
package it.unipv.ingsw.blackmarket.dealers;

import it.unipv.ingsw.blackmarket.Briefcase;
import it.unipv.ingsw.blackmarket.Dealer;
import it.unipv.ingsw.blackmarket.Exchange;

public final class CaroloNicolas extends Dealer {
    private Briefcase bag = Briefcase.FULL;

    @Override
    public Briefcase exchangeBriefcase(int roundNo, int totRounds) {
        if (roundNo == 1){
            bag = Briefcase.FULL;
        }
        if (roundNo > totRounds / 2){
            return Briefcase.EMPTY;
        } else {
            return bag;
        }
    }

    public void exchangeResult(Exchange exchange, int roundNo, int totRounds) {
        if (exchange.secondBriefcase().equals(Briefcase.FULL)){
            bag = Briefcase.FULL;
        } else{
            bag = Briefcase.EMPTY;
        }
    }
}
