package com.thesamoanppprogrammer.GroovySpringBoot.repository

import com.thesamoanppprogrammer.GroovySpringBoot.entity.Todo
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TodoRepository extends JpaRepository<Todo, Integer> {}
