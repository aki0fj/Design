public class Visitor{
  public static void main(String args[]){

    String bookName = args[0];
    System.out.println("Searching " + bookName);

    Librarian nakamura = new Librarian();
    String location = nakamura.searchBook(bookName);
    System.out.println(location);

    if(location.equals("Sorry...Now Lending")){
      System.out.println("Oh...Shit!");
    }else if(location.equals("Sorry...We don't have this book.")){
      System.out.println("Ah, Useless library.");
    }else{
      System.out.println("Thank you !");
    }
  }
}
