public class Main{
  protected static HumanLetterFactory hlf = HumanLetterFactory.getInstance();
  protected static String result = "";

  public static void main(String args[]){
    
    addLetters("A");
    addLetters("i");
    addLetters("h");
    addLetters("a");
    addLetters(" ");
    addLetters("a");
    addLetters("i");
    addLetters("y");
    addLetters("o");
    addLetters("r");
    addLetters("i");
    addLetters("m");
    addLetters("o");
    addLetters(" ");
    addLetters("a");
    addLetters("o");
    addLetters("i");

    System.out.println(result);
  }

  private static void addLetters(String letter) {
    result += letter;
    HumanLetter dmy = hlf.getHumanLetter(letter);
  }
}
