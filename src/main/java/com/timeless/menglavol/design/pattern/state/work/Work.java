package com.timeless.menglavol.design.pattern.state.work;

import com.timeless.menglavol.design.pattern.state.state.AbstractState;
import com.timeless.menglavol.design.pattern.state.state.ConcreteStateA;

/**
 * @ClassName: Work
 * @Description: 工作类
 * @Author: timeless
 * @Date: 2024/9/12
 */
public class Work {

    private AbstractState state;

    private String hour;

    private boolean finish;

    public Work() {
        this.state = new ConcreteStateA();
    }

    public void programming(){
        state.handle(this);
    }

    public AbstractState getState() {
        return state;
    }

    public void setState(AbstractState state) {
        this.state = state;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }
}
