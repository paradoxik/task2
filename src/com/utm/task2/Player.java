package com.utm.task2;

public class Player {

private String name;
private int scored;

Player(){
    this.name="Unknown";
    this.scored=0;
}
public void setScored(){
    this.scored=1;
}
public boolean getScored(){
    if (scored==0)return false;
        else  return true;
}

public boolean setname(String n){
    this.name= n;
    return true;
}
public String getName(){
    return this.name;
    }




}
