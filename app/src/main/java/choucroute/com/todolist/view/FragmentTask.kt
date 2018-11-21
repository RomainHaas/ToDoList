package choucroute.com.todolist.view

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import choucroute.com.todolist.R
import choucroute.com.todolist.model.*
import kotlinx.android.synthetic.main.fragment_task.*

class FragmentTask : Fragment() {
    private fun loadTask(){
        fragmentProgressBar.visibility = View.VISIBLE
        val toDo : ToDo = ToDo(null)
        //TODO: 11/21/2018 2:21 PM Fill the listView with tasks, which contain in the toDoList "toDo".
        Thread.sleep(2000)

        fragmentProgressBar.visibility = View.INVISIBLE
    }

    companion object {
        fun newInstance() = FragmentTask()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        loadTask()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_task,container,false)

    }
}