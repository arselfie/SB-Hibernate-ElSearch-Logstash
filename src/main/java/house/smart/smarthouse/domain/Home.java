package house.smart.smarthouse.domain;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Home {
    @Id
    @GeneratedValue
    private int id;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinTable(name = "home_room",
            joinColumns = @JoinColumn(name = "home_fk_id"),
    inverseJoinColumns = @JoinColumn(name = "room_fk_id"))
    private List<Room> rooms = new ArrayList<>();

    @ElementCollection
    @CollectionTable(name = "home_technologie",
            joinColumns = @JoinColumn(name = "home_fk_id"))
    private List<String> technologies = new ArrayList<>();

    @ManyToOne
    private User user;

    public Home() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<String> getTechnologies() {
        return technologies;
    }

    public void setTechnologies(List<String> technologies) {
        this.technologies = technologies;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }
}
