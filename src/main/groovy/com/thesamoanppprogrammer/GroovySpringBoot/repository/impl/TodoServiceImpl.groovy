package com.thesamoanppprogrammer.GroovySpringBoot.repository.impl

import com.thesamoanppprogrammer.GroovySpringBoot.entity.Todo
import com.thesamoanppprogrammer.GroovySpringBoot.repository.TodoRepository
import com.thesamoanppprogrammer.GroovySpringBoot.service.TodoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TodoServiceImpl implements TodoService {

    @Autowired
    TodoRepository todoRepository

    @Override
    List<Todo> findAll() {
        todoRepository.findAll()
    }

    @Override
    Todo findById(Integer todoId) {
        todoRepository.findById todoId get()
    }

    @Override
    Todo saveTodo(Todo todo){
        todoRepository.save todo
    }

    @Override
    Todo updateTodo(Todo todo){
        todoRepository.save todo
    }

    @Override
    Todo deleteTodo(Integer todoId){
        todoRepository.deleteById todoId
    }
}
