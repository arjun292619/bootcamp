package com.javaBootCamp.enumeration_section22;

public class TaskUtility {
    public static void main(String[] args) {
        TaskUtility taskUtility = new TaskUtility();
        System.out.println(taskUtility.getDaysToComplete(PriorityEnum.MEDIUM));
        System.out.println(taskUtility.getDaysToComplete(PriorityEnum.URGENT));
        System.out.println(taskUtility.getDaysToComplete(PriorityEnum.LOW));
    }

    public int getDaysToComplete(PriorityEnum priority){
        return switch (priority){
            case LOW ->  7;
            case MEDIUM -> 5;
            case HIGH -> 3;
            case URGENT -> 1;
            default -> 0;
        };
    }
}
