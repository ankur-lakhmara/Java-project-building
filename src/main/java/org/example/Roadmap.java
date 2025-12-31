package org.example;

public class Roadmap {
    private int id;
    private String area;
    private String topic;
    private String subtopic;

    @Override
    public String toString(){
        return "Roadmap{" +
                "id=" + id +
                ", area='" + area + '\'' +
                ", topic='" + topic + '\'' +
                ", subtopic='" + subtopic + '\'' +
                ", priority='" + priority + '\'' +
                ", notes='" + notes + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getSubtopic() {
        return subtopic;
    }

    public void setSubtopic(String subtopic) {
        this.subtopic = subtopic;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private String priority;
    private String notes;
    private String status;

}
