package edu.brandeis.cosi103a.charlescai;

import edu.brandeis.cosi.atg.api.cards.Card;
import java.util.HashMap;
import edu.brandeis.cosi.atg.api.GameDeck;

public class Supply {
  private HashMap<Card.Type, Integer> sharedSupply;

  public Supply() {
    sharedSupply = new HashMap<>();
    sharedSupply.put(Card.Type.BITCOIN, 60);
    sharedSupply.put(Card.Type.ETHEREUM, 40);
    sharedSupply.put(Card.Type.DOGECOIN, 30);
    sharedSupply.put(Card.Type.METHOD, 14);
    sharedSupply.put(Card.Type.MODULE, 8);
    sharedSupply.put(Card.Type.FRAMEWORK, 8);
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Current Shared Supply:\n");
    for (Card.Type type : sharedSupply.keySet()) {
      sb.append(type.getDescription() + ": " + sharedSupply.get(type) + "\n");
    }
    return sb.toString();
  }
}
