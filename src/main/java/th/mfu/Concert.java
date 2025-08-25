package th.mfu;

import java.util.Date;

public class Concert {

    // Attributes
    private int id;
    private String title;
    private String performer;
    private Date date;
    private String description;

    // Default constructor
    public Concert() {
    }

    // Constructor with title and description
    public Concert(String title, String description) {
        this.title = title;
        this.description = description;
    }

    // Getter and Setter for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter for title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Getter and Setter for performer
    public String getPerformer() {
        return performer;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }

    // Getter and Setter for date
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    // Getter and Setter for description
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
