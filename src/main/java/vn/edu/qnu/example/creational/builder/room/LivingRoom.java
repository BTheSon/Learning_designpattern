package vn.edu.qnu.example.creational.builder.room;

public class LivingRoom extends Room {
    private boolean hasFireplace;
    private String sofaColor;

    public LivingRoom(int size, String wallColor, boolean hasFireplace, String sofaColor) {
        super(size, wallColor);
        this.hasFireplace = hasFireplace;
        this.sofaColor = sofaColor;
    }

    @Override
    public String toString() {
        return "LivingRoom{" + super.toString() + ", hasFireplace=" + hasFireplace + ", sofaColor='" + sofaColor + "'}";
    }
}
