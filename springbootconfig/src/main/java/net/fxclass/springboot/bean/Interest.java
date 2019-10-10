package net.fxclass.springboot.bean;

public class Interest {
    private String name;
    private Integer time;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Interest{" +
                "name='" + name + '\'' +
                ", time=" + time +
                '}';
    }
}
