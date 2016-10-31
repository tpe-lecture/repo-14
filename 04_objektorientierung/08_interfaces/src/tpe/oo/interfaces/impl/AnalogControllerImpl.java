package tpe.oo.interfaces.impl;

import java.awt.Point;

import tpe.oo.interfaces.api.AnalogController;

public class AnalogControllerImpl implements AnalogController {


    private Point position = new Point(0, 0);
    private double x;
    private double y;

    /**
     * @see tpe.oo.interfaces.api.DigitalController#up()
     */
    @Override
    public void up(double percentage) {

        y=y-percentage;
    }

    /**
     * @see tpe.oo.interfaces.api.DigitalController#down()
     */
    @Override
    public void down(double percentage) {

        y=y+percentage;
    }

    /**
     * @see tpe.oo.interfaces.api.DigitalController#left()
     */
    @Override
    public void left(double percentage) {

        x=x-percentage;
    }

    /**
     * @see tpe.oo.interfaces.api.DigitalController#right()
     */
    @Override
    public void right(double percentage) {

        x=x+percentage;
    }



    /**
     * @see tpe.oo.interfaces.api.DigitalController#getPosition()
     */
    @Override
    public Point getPosition() {
//        position.setLocation((int)x, (int)y);
//        return (Point) position.clone();
        return new Point((int)x,(int)y);
    }
}
