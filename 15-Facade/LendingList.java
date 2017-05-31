public class LendingList{
  public boolean check(String bookName){
    if(bookName.equals("Insect illustrations")){
      return false;
    }
    if(bookName.equals("Animals book")){
      return false;
    }
    return true;
  }
}
