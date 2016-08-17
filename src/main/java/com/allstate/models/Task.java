package com.allstate.models;

import org.aspectj.apache.bcel.generic.InstructionCP;

import java.util.Date;

public class Task {

    private int id;
    private String name;
    private String category;
    private Date due;
    private boolean isComplete;
    private Date createdAt;
    private Date updatedAt;

    public Task() {
        this.createdAt = new Date();
        this.updatedAt = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getDue() {
        return due;
    }

    public void setDue(Date due) {
        this.due = due;
    }

    public boolean getIsComplete() {
        return isComplete;
    }

    public void setIsComplete(boolean isComplete) {
        this.isComplete = isComplete;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void UpdateTime() {
        this.updatedAt = new Date();
    }
}
