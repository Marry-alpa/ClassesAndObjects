package Hobby;

public class Main {
    public static void main(String[] args) {
        Music m1 = new Music();
        Music m2 = new Music();

        m1.setBand("MCR");
        m1.setStyle("Rock");
        m1.setStudio("Studio");
        m1.setMembers(5);
        m1.setAlbums(4);

        m2.setBand("BVB");
        m2.setStyle("Metal rock");
        m2.setStudio("Studio");
        m2.setMembers(5);
        m2.setAlbums(5);

        System.out.printf(
                "Band: %s Style: %s Studio: %s Members: %d Albums: %d%n",
                m1.getBand(),
                m1.getStyle(),
                m1.getStudio(),
                m1.getMembers(),
                m1.getAlbums());

        System.out.printf(
                "Band: %s Style: %s Studio: %s Members: %d Albums: %d%n",
                m2.getBand(),
                m2.getStyle(),
                m2.getStudio(),
                m2.getMembers(),
                m2.getAlbums());
    }
}

