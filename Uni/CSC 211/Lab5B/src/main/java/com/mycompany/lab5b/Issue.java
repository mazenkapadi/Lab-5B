/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5b;

/**
 *
 * @author mazenkapadi
 */

public interface Issue {

    public static enum IssueStatus {
        NEW, OPENED, FIXED, CLOSED
    }

    public String getId();
    public String getProjectName();
    public IssueStatus getStatus();
    public String getSynopsis();
    public String getDescription();
}
