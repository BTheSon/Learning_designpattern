package vn.edu.qnu.example.builder;
public class Bedroom {

    private String bedType;
    private int numberOfBeds;
    private boolean hasBalcony;
    private boolean hasBathroom;
    private int size;
    private String wallColor;
    private boolean hasTV;
    private boolean hasAC;

    public Bedroom(
            String bedType,
            int numberOfBeds,
            boolean hasBalcony,
            boolean hasBathroom,
            int size,
            String wallColor,
            boolean hasTV,
            boolean hasAC
    ) {
        this.bedType = bedType;
        this.numberOfBeds = numberOfBeds;
        this.hasBalcony = hasBalcony;
        this.hasBathroom = hasBathroom;
        this.size = size;
        this.wallColor = wallColor;
        this.hasTV = hasTV;
        this.hasAC = hasAC;
    }

    @Override
    public String toString() {
        return "Bedroom{" +
                "bedType='" + bedType + '\'' +
                ", numberOfBeds=" + numberOfBeds +
                ", hasBalcony=" + hasBalcony +
                ", hasBathroom=" + hasBathroom +
                ", size=" + size +
                ", wallColor='" + wallColor + '\'' +
                ", hasTV=" + hasTV +
                ", hasAC=" + hasAC +
                '}';
    }

}