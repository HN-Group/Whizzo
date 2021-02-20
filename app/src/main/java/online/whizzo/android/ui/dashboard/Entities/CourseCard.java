package online.whizzo.android.ui.dashboard.Entities;

public class CourseCard {
    private String title, description;

    public CourseCard(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
