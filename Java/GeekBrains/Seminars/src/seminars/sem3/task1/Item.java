package seminars.sem3.task1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor


public class Item {
    public String name;
    public String country;
    public Integer volume;


    public Item() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }
}
