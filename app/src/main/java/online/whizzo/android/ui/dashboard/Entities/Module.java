package online.whizzo.android.ui.dashboard.Entities;

import java.util.ArrayList;
import java.util.List;

public class Module {

    private String name;
    private ArrayList<CourseCard> modulePosts = new ArrayList<>();

    public Module(String name){
        this.name  = name;
    }

    public void addPost(CourseCard post){
        modulePosts.add(post);
    }

    public ArrayList<CourseCard> getPosts(){
        return modulePosts;
    }
}
