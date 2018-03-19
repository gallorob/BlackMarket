package it.unipv.ingsw.blackmarket.dealers;

import it.unipv.ingsw.blackmarket.Briefcase;
import it.unipv.ingsw.blackmarket.Exchange;
import it.unipv.ingsw.blackmarket.Dealer;

// VERSIONE 1


public class DsouzaSimone extends Dealer{
    Briefcase case_;

    @Override
    public Briefcase exchangeBriefcase(int roundNo, int totRounds) {

        if(roundNo == 1) {

            return Briefcase.EMPTY;
        }

        else {

            return case_;
        }
    }

    @Override
    public void exchangeResult(Exchange exchange, int roundNo, int totRounds) {
        if(roundNo==2)
            case_ = exchange.secondBriefcase();
        if(roundNo>2)
            case_= Briefcase.EMPTY;
        if(roundNo==5)
            case_ = exchange.secondBriefcase();
        if(roundNo>5)
            case_= Briefcase.EMPTY;

    }
}
