public class Librarian {
  public String searchBook(String bookName){
    BookList bookList = new BookList();
    String location = bookList.searchBook(bookName);

    if(location != null){
      LendingList lendingList = new LendingList();

      if(lendingList.check(bookName)){
        return "Sorry...Now Lending";
      } else {
        return location;
      }
    } else {
      return "Sorry...We don't have this book.";
    }
  }
}
