public class Card {
  public enum Suit {
    Spades, Hearts, Diamonds, Clubs
  }

  public enum Rank {
    Ace, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King
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

  @Override
  public String toString() {
    return this.face + " of " + this.colour;
  }
}
