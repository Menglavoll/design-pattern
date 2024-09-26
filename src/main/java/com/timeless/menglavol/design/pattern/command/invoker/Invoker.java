package com.timeless.menglavol.design.pattern.command.invoker;

import com.timeless.menglavol.design.pattern.command.command.ICommand;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Invoker
 * @Description: 代理者 处理客户的请求
 * @Author: timeless
 * @Date: 2024/9/14
 */
public class Invoker {

    // 声明一个命令集合存放带执行的所有命令
    private final List<ICommand> commands = new ArrayList<>();

    // 向集合中添加命令
    public void add(ICommand command) {
        commands.add(command);
    }

    // 从集合中移除一个命令
    public void remove(ICommand command) {
        commands.remove(command);
    }

    // 执行所有命令
    public void execute() {
        for (ICommand command : commands) {
            command.execute();
        }
    }
}
