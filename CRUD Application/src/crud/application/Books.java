
package crud.application;
public class Books {
   
    private Integer id;
    private String title;
    private String auther;
    private Integer year;
    private Integer page;

    public Books(Integer id, String title, String auther, Integer year, Integer page) {
        this.id = id;
        this.title = title;
        this.auther = auther;
        this.year = year;
        this.page = page;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuther() {
        return auther;
    }

    public Integer getYear() {
        return year;
    }

    public Integer getPage() {
        return page;
    }    
    
}
