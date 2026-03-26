package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class ShapeFactory {
    public static ComplexCommand createRectangle(Job2dDriver driver, int x, int y, int w, int h) {
        ComplexCommand commands = new ComplexCommand();
        commands.addCommand(new SetPositionCommand(x,y,driver));
        commands.addCommand(new OperateToCommand(x + w,y,driver));
        commands.addCommand(new OperateToCommand(x+w,y+h,driver));
        commands.addCommand(new OperateToCommand(x,y+h,driver));
        commands.addCommand(new OperateToCommand(x,y,driver));
        return commands;
    }


    public static ComplexCommand createSquare(Job2dDriver driver, int x, int y, int h) {
        ComplexCommand commands = new ComplexCommand();
        commands.addCommand(new SetPositionCommand(x,y,driver));
        commands.addCommand(new OperateToCommand(x + h,y,driver));
        commands.addCommand(new OperateToCommand(x+h,y+h,driver));
        commands.addCommand(new OperateToCommand(x,y+h,driver));
        commands.addCommand(new OperateToCommand(x,y,driver));
        return commands;
    }

    public static ComplexCommand createTriangle(Job2dDriver driver, int x1,int y1, int x2,int y2, int x3, int y3) {
        ComplexCommand commands = new ComplexCommand();

        commands.addCommand(new SetPositionCommand(x1,y1,driver));
        commands.addCommand(new OperateToCommand(x2,y2,driver));
        commands.addCommand(new OperateToCommand(x3,y3,driver));
        commands.addCommand(new OperateToCommand(x1,y1,driver));
        return commands;
    }
}

