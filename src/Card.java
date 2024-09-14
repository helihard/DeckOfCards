public class Card {
  public enum Suit {
    SPADES, HEARTS, DIAMONDS, CLUBS
  }

  public enum Rank {
    ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
  }

  private final Rank face;
  private final Suit colour;

  // constructor with enums
  public Card(Rank face, Suit colour) {
    this.face = face;
    this.colour = colour;
  }

  // face getter
  public Rank getFace() {
    return face;
  }

  // colour getter
  public Suit getColour() {
    return colour;
  }

  private String formatEnum(Enum<?> e) {
    String name = e.name().toLowerCase();
    return name.substring(0, 1).toUpperCase() + name.substring(1);
  } 

  @Override
  public String toString() {
    return formatEnum(face) + " of " + formatEnum(colour);
  }
}
