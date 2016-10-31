package tpe.oo.interfaces.impl;

import java.awt.Point;

import tpe.oo.interfaces.api.AnalogController;
import tpe.oo.interfaces.api.DigitalController;

public class DualShock4 implements AnalogController,DigitalController {
    //private Point position = new Point(0, 0);
    AnalogControllerImpl a = new AnalogControllerImpl();
    DigitalControllerImpl d = new DigitalControllerImpl();


    @Override
    public void up() {
        d.up();

    }

    @Override
    public void down() {
        d.down();

    }

    @Override
    public void left() {
        d.left();

    }

    @Override
    public void right() {
        d.right();

    }

    @Override
    public void up(double percentage) {
        a.up(percentage);

    }

    @Override
    public void down(double percentage) {
        a.down(percentage);

    }

    @Override
    public void left(double percentage) {
        a.left(percentage);

    }

    @Override
    public void right(double percentage) {
        a.right(percentage);

    }

    @Override
    public Point getPosition() {
        Point analog = a.getPosition();
        Point digital= d.getPosition();
        
//        position.setLocation(analog.getX()+digital.getX(), analog.getY()+digital.getY());
//        oder Point result = new Point();
//        result.x=analog.x+digital.x;
//        result.y=analog.y+digital.y;
//        return (Point)position;
          return new Point((int)analog.getX()+(int)digital.getX(),
                           (int)analog.getY()+(int)digital.getY());
    }

}
