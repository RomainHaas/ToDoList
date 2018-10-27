package choucroute.com.todolist.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import choucroute.com.todolist.R
import choucroute.com.todolist.model.AbstractTask
import choucroute.com.todolist.model.SubTask
import choucroute.com.todolist.model.ToDo
import choucroute.com.todolist.model.Task
import kotlinx.android.synthetic.main.activity_task_view.*

class TaskView : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task_view)


        val tostinette1 : AbstractTask = SubTask(true,"First SubTask")
        val tostinette2 : AbstractTask = SubTask(true,"Second SubTask")
        val tostinette3 : AbstractTask = SubTask(true,"Third SubTask")
        var subTabTest : MutableList<AbstractTask> = mutableListOf(tostinette1,tostinette2,tostinette3)


        val test: Task = Task(subTabTest,true,"First Task")
        val test2: Task= Task(null,true,"Second Task")
        val test3: Task= Task(null,true,"Third Task")
        val test4: Task = Task(null,true,"Fourth Task")
        var tabTest : MutableList<Task> = mutableListOf(test,test2,test3,test4)

        val toDo : ToDo = ToDo(tabTest)

        var txtD:TextView = findViewById(R.id.textDescription)
        for(i in tabTest){
            txtD.text = txtD.text.toString() + i.descritpion.toString()+"\n"
            if(i.tabTask != null){
                for(j in i.tabTask){
                    txtD.text = txtD.text.toString()+"  "+ j.descritpion.toString()+"\n"
                }
            }

        }

    }
}
