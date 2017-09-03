package com.example.mobileviolet;

/**
 * Created by kitt3 on 2017-05-01.
 */


import android.graphics.Canvas;

/**
 An invisible node that is used in the toolbar to draw an
 edge, and in notes to serve as an end point of the node
 connector.
 */
public class PointNode extends AbstractNode
{
    /**
     Constructs a point node with coordinates (0, 0)
     */
    public PointNode()
    {
        point = new Point2D(0, 0);
    }

    public void draw(Canvas canvas)
    {
    }

    public void translate(double dx, double dy){point.setLocation(point.getX() + dx, point.getY() + dy);}

    public boolean contains(Point2D p)
    {
        final double THRESHOLD = 5;
        return point.distance(p) < THRESHOLD;
    }

    public Rectangle2D getBounds(){return new Rectangle2D(point.getX(), point.getY(), 0, 0);}

    public Point2D getConnectionPoint(Direction d)
    {
        return point;
    }

    private Point2D point;
}
