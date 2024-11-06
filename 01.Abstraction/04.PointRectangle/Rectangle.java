package PointInRectangle;

public class Rectangle {
    private Point bottomL;
    private Point topR;

    public Rectangle(Point bottomL, Point topR) {
        this.bottomL = bottomL;
        this.topR = topR;
    }

    public boolean contains(Point point){
        boolean xBetween = point.getCoordX() >= bottomL.getCoordX() && point.getCoordX() <= topR.getCoordX();
        boolean yBetween = point.getCoordY() >= bottomL.getCoordY() && point.getCoordY() <= topR.getCoordY();

        return xBetween && yBetween;
    }
}
