package choucroute.com.todolist.model


class ToDo(var tabTask: MutableList<Task>?){
    init {
        var TabSubTask : MutableList<AbstractTask> = mutableListOf( SubTask(true,"First SubTask"),
                                                                    SubTask(true,"Second SubTask"),
                                                                    SubTask(true,"Third SubTask"))

        this.tabTask = mutableListOf( Task(TabSubTask,true,"First Task"),
                                      Task(null,true,"Second Task"),
                                      Task(null,true,"Third Task"),
                                      Task(null,true,"Third Task"))
    }
}

