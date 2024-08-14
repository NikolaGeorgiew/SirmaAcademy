package SingleResponsibility;

public class BookRepository {
    public void saveToDatabase(Book book){
        //Save to database;
    }
    public Book findById(int id) {
        return new Book();
    }
}
