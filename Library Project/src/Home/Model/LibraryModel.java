package Home.Model;

public class LibraryModel {
    private int id ;
    private String name ;
    private String gender ;
    private String bookname ;
    private String contact ;
    private String loandate ;
    private String duedate ;
    private String image ;

    public LibraryModel(int id, String name, String gender, String bookname, String contact, String loandate, String duedate, String image) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.bookname = bookname;
        this.contact = contact;
        this.loandate = loandate;
        this.duedate = duedate;
        this.image = image;
    }
    
    

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getBookname() {
        return bookname;
    }

    public String getContact() {
        return contact;
    }

    public String getLoandate() {
        return loandate;
    }

    public String getDuedate() {
        return duedate;
    }

    public String getImage() {
        return image;
    }
    
    
}
