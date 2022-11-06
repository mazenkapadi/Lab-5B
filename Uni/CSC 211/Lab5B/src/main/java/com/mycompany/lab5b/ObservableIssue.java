package com.mycompany.lab5b;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mazenkapadi
 */


import javafx.beans.value.ObservableValue;

public interface ObservableIssue extends Issue {

    public ObservableValue<String> idProperty();
    public ObservableValue<String> projectNameProperty();
    public ObservableValue<IssueStatus> statusProperty();
    public ObservableValue<String> synopsisProperty();
    public ObservableValue<String> descriptionProperty();
}
