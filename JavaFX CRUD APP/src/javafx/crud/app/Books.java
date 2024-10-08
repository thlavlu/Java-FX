
package javafx.crud.app;

/**
 *
 * @author thlavlu
 */
public class Books {
   
    private Integer id;
    private String title;
    private String author;
    private Integer year;
    private Integer pages;

    public Books(Integer id, String title, String author, Integer year, Integer pages) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.pages = pages;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void setPage(Integer pages) {
        this.pages = pages;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getYear() {
        return year;
    }

    public Integer getPage() {
        return pages;
    }    
    
}
