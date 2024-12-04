package Command;

import java.util.Stack;

//invoker
public class MyRemoteCommand {
    Stack<ICommand> undoOperations = new Stack<>();
    ICommand command;

    public MyRemoteCommand(){

    }

    public MyRemoteCommand(ICommand command){
        this.command = command;
    }

    public void pressButton(){
        command.execute();
        undoOperations.push(command);
    }

    public void undo(){
        if(!undoOperations.isEmpty()){
            ICommand command1 = undoOperations.pop();
            command1.undo();
        }
    }
}
