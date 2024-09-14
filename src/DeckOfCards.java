import java.util.ArrayList;
import java.util.Collections;
import java.security.SecureRandom;

public class DeckOfCards {
  private final ArrayList<Card> cards = new ArrayList<>();  
  
  public DeckOfCards() {
    createCards();
  }

  public boolean cardsRemain() {
    return !cards.isEmpty();
  }

  private void createCards() {
    for (Card.Suit suit : Card.Suit.values()) {
      for (Card.Rank rank : Card.Rank.values()) {
        cards.add(new Card(rank, suit));
      }
    }
  }

  public void shuffle() {
    SecureRandom secureRandom = new SecureRandom();
    Collections.shuffle(cards, secureRandom);
  }

  public Card dealOneCard() {
    if (cardsRemain()) {
      return cards.remove(cards.size() - 1);
    }
    return null;
  }
}
