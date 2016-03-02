package PokerBase;
import java.util.ArrayList;

import PokerEnums.eRank;
import PokerEnums.eSuit;
public class Deck {
	
	private ArrayList<Card> deckCards = new ArrayList<Card>(); // List must be initialized

public Deck()
{
	for (short i = 0; i <= e; i++)
	{
		eSuit SuitValue = eSuit.values()[i];
		for (short j = 0; j <= 12; j++)
		{
			eRank RankValue = eRank.values()[j];
			Card NewCard = new Card(SuitValue, RankValue, );
			deckCards.add(NewCard);
		}
	}
	
}

}
