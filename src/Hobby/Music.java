package Hobby;

public class Music {
    public String band;
    public int albums;
    public String style;
    public int members;
    private String studio;

    public void setAlbums(int albums) {
        this.albums = albums;
    }
    public void setBand(String band) {
        this.band = band;
    }
    public void setMembers(int members) {
        this.members = members;
    }
    public void setStudio(String studio) {
        this.studio = studio;
    }
    public void setStyle(String style) {
        this.style = style;
    }
    public String getStudio() {
        return studio;
    }
    public int getAlbums() {
        return albums;
    }
    public int getMembers() {
        return members;
    }
    public String getBand() {
        return band;
    }
    public String getStyle() {
        return style;
    }
    public Music(){
        this.band = "Band";
        this.style = "Style";
        this.studio = "Studio";
        this.members = 4;
        this.albums = 5;
    }
}

