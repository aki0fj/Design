public class BookList{
  public String searchBook(String bookName){
    String location = null;
    if(bookName.equals("Insect illustrations")){
      location = "B-15";
    }
    if(bookName.equals("Botanical books")){
      location = "A-22";
    }
    if(bookName.equals("Animals book")){
      location = "A-23";
    }
    return location;
  }
}
