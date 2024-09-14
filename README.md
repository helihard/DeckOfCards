Uppgift: Skapa och hantera en kortlek i Java

I den här uppgiften ska du bygga en kortlek och implementera funktioner för att blanda och dela ut kort. Du kommer att hantera klasser för enskilda kort och en kortlek. Följande steg guidar dig genom processen.

1. Skapa klassen Card:
  •	Skapa en klass som representerar ett spelkort. Varje kort ska ha två egenskaper:
    o	Ett ansikte (t.ex. "Ace", "King", "Queen", "Two", etc.).
    o	En färg (t.ex. "Hearts", "Diamonds", "Clubs", "Spades").
  •	Implementera en konstruktor som tar in dessa två egenskaper och sätter dem.
  •	Överskriv toString()-metoden för att skriva ut kortet i formatet "Ansikte Färg" (t.ex. "Ace of Spades").

2. Skapa klassen DeckOfCards:
  •	Skapa en klass som representerar en kortlek med 52 kort.
  •	Implementera en konstruktor som fyller kortleken med 52 unika kort (13 kort i varje färg).
  •	Lägg till en metod shuffle() som blandar korten slumpmässigt med hjälp av SecureRandom.
  •	Implementera en metod dealOneCard() som delar ut ett kort i taget från kortleken. Om alla kort är utdelade ska metoden returnera null.

3. Skapa klassen Main:
  •	I Main-klassen:
    o	Skapa en instans av DeckOfCards.
    o	Blanda kortleken med metoden shuffle().
    o	Dela ut och skriv ut alla 52 kort, fyra per rad, tills kortleken är tom.

Tips:
  •	Tänk på att noggrant separera ansvaret mellan klasserna: Card hanterar individuella kort, medan DeckOfCards ansvarar för att skapa, blanda och dela ut kortleken.
  •	Använd gärna System.out.println för att debugga och testa under arbetets gång.

