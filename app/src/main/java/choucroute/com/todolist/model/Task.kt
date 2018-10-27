package choucroute.com.todolist.model

class Task(val tabTask:MutableList<AbstractTask>?,done:Boolean,description:String) : AbstractTask(done,description){
}